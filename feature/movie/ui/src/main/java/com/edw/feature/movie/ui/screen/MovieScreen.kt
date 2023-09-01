package com.edw.feature.movie.ui.screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieScreen(viewModel: MovieSearchViewModel) {

    val result = viewModel.movieList.value
    val movieName = viewModel.movieName.collectAsState()

    Scaffold(topBar = {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = movieName.value,
            onValueChange = {
                viewModel.setMovie(it)
            },
            colors = TextFieldDefaults.textFieldColors(
                disabledIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            placeholder = { Text(text = "Buscar pelicula...") }, trailingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            }
        )
    }) {
        Log.d("", "")

        if (result.isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        if (result.error.isNotBlank()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = result.error)
            }
        }

        result.data?.let { movie ->
            if (movie.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "Peliculas no encontradas")
                }
            } else {
                LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp), content = {
                    items(result.data.size) {
                        Box(
                            modifier = Modifier
                                .height(200.dp)
                                .border(1.dp, color = Color.White),
                            contentAlignment = Alignment.Center
                        ) {
                            AsyncImage(
                                model = result.data[it].imageUrl,
                                contentDescription = null,
                                contentScale = ContentScale.FillBounds,
                            )
                        }
                    }
                })
            }
        }
    }
}
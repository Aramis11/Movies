package com.edw.feature.movie_details.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieDetailsScreen(id: String, viewModel: MovieDetailViewModel) {

    val result = viewModel.movieDetails.value

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Movie Details") })
    }) {
        Log.d("", "$it")
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

        result.data?.let {
            Column(modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
            ) {
                AsyncImage(
                    model = it.imageURL,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .height(300.dp),
                    contentScale = ContentScale.Crop
                )
                
                Box(modifier = Modifier.fillMaxWidth()){
                    Column(Modifier.fillMaxWidth()) {
                        Text(text = it.title)
                        Text(text = it.description)
                    }
                }
            }
        }
    }
}
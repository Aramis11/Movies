package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final CodeLibraryAccessors laccForCodeLibraryAccessors = new CodeLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final DaggerLibraryAccessors laccForDaggerLibraryAccessors = new DaggerLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final JetbrainsLibraryAccessors laccForJetbrainsLibraryAccessors = new JetbrainsLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final Retrofit2LibraryAccessors laccForRetrofit2LibraryAccessors = new Retrofit2LibraryAccessors(owner);
    private final SquareupLibraryAccessors laccForSquareupLibraryAccessors = new SquareupLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() { return create("material"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at code
     */
    public CodeLibraryAccessors getCode() { return laccForCodeLibraryAccessors; }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() { return laccForCoilLibraryAccessors; }

    /**
     * Returns the group of libraries at dagger
     */
    public DaggerLibraryAccessors getDagger() { return laccForDaggerLibraryAccessors; }

    /**
     * Returns the group of libraries at espresso
     */
    public EspressoLibraryAccessors getEspresso() { return laccForEspressoLibraryAccessors; }

    /**
     * Returns the group of libraries at jetbrains
     */
    public JetbrainsLibraryAccessors getJetbrains() { return laccForJetbrainsLibraryAccessors; }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() { return laccForJunitLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at retrofit2
     */
    public Retrofit2LibraryAccessors getRetrofit2() { return laccForRetrofit2LibraryAccessors; }

    /**
     * Returns the group of libraries at squareup
     */
    public SquareupLibraryAccessors getSquareup() { return laccForSquareupLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("android.material"); }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxHiltLibraryAccessors laccForAndroidxHiltLibraryAccessors = new AndroidxHiltLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxPagingLibraryAccessors laccForAndroidxPagingLibraryAccessors = new AndroidxPagingLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("androidx.appcompat"); }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() { return laccForAndroidxActivityLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() { return laccForAndroidxComposeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() { return laccForAndroidxCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.hilt
         */
        public AndroidxHiltLibraryAccessors getHilt() { return laccForAndroidxHiltLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() { return laccForAndroidxNavigationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.paging
         */
        public AndroidxPagingLibraryAccessors getPaging() { return laccForAndroidxPagingLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() { return laccForAndroidxRoomLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() { return laccForAndroidxTestLibraryAccessors; }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityActivityLibraryAccessors laccForAndroidxActivityActivityLibraryAccessors = new AndroidxActivityActivityLibraryAccessors(owner);

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.activity.activity
         */
        public AndroidxActivityActivityLibraryAccessors getActivity() { return laccForAndroidxActivityActivityLibraryAccessors; }

    }

    public static class AndroidxActivityActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.activity.activity.compose"); }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeComposeLibraryAccessors laccForAndroidxComposeComposeLibraryAccessors = new AndroidxComposeComposeLibraryAccessors(owner);
        private final AndroidxComposeUiLibraryAccessors laccForAndroidxComposeUiLibraryAccessors = new AndroidxComposeUiLibraryAccessors(owner);

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for livedata (androidx.compose.runtime:runtime-livedata)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() { return create("androidx.compose.livedata"); }

        /**
         * Returns the group of libraries at androidx.compose.compose
         */
        public AndroidxComposeComposeLibraryAccessors getCompose() { return laccForAndroidxComposeComposeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.ui
         */
        public AndroidxComposeUiLibraryAccessors getUi() { return laccForAndroidxComposeUiLibraryAccessors; }

    }

    public static class AndroidxComposeComposeLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("androidx.compose.compose.bom"); }

    }

    public static class AndroidxComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeUiUiLibraryAccessors laccForAndroidxComposeUiUiLibraryAccessors = new AndroidxComposeUiUiLibraryAccessors(owner);

        public AndroidxComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.ui"); }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui
         */
        public AndroidxComposeUiUiLibraryAccessors getUi() { return laccForAndroidxComposeUiUiLibraryAccessors; }

    }

    public static class AndroidxComposeUiUiLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeUiUiTestLibraryAccessors laccForAndroidxComposeUiUiTestLibraryAccessors = new AndroidxComposeUiUiTestLibraryAccessors(owner);
        private final AndroidxComposeUiUiToolingLibraryAccessors laccForAndroidxComposeUiUiToolingLibraryAccessors = new AndroidxComposeUiUiToolingLibraryAccessors(owner);

        public AndroidxComposeUiUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for graphics (androidx.compose.ui:ui-graphics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGraphics() { return create("androidx.compose.ui.ui.graphics"); }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui.test
         */
        public AndroidxComposeUiUiTestLibraryAccessors getTest() { return laccForAndroidxComposeUiUiTestLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui.tooling
         */
        public AndroidxComposeUiUiToolingLibraryAccessors getTooling() { return laccForAndroidxComposeUiUiToolingLibraryAccessors; }

    }

    public static class AndroidxComposeUiUiTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeUiUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("androidx.compose.ui.ui.test.junit4"); }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() { return create("androidx.compose.ui.ui.test.manifest"); }

    }

    public static class AndroidxComposeUiUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxComposeUiUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.ui.ui.tooling"); }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() { return create("androidx.compose.ui.ui.tooling.preview"); }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {
        private final AndroidxCoreCoreLibraryAccessors laccForAndroidxCoreCoreLibraryAccessors = new AndroidxCoreCoreLibraryAccessors(owner);

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.core.core
         */
        public AndroidxCoreCoreLibraryAccessors getCore() { return laccForAndroidxCoreCoreLibraryAccessors; }

    }

    public static class AndroidxCoreCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.core.core.ktx"); }

    }

    public static class AndroidxHiltLibraryAccessors extends SubDependencyFactory {
        private final AndroidxHiltNavigationLibraryAccessors laccForAndroidxHiltNavigationLibraryAccessors = new AndroidxHiltNavigationLibraryAccessors(owner);

        public AndroidxHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.hilt:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.hilt.compiler"); }

        /**
         * Returns the group of libraries at androidx.hilt.navigation
         */
        public AndroidxHiltNavigationLibraryAccessors getNavigation() { return laccForAndroidxHiltNavigationLibraryAccessors; }

    }

    public static class AndroidxHiltNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxHiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.hilt.navigation.compose"); }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxLifecycleRuntimeLibraryAccessors laccForAndroidxLifecycleRuntimeLibraryAccessors = new AndroidxLifecycleRuntimeLibraryAccessors(owner);
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lifecycle (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle"); }

            /**
             * Creates a dependency provider for livedata (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() { return create("androidx.lifecycle.livedata"); }

        /**
         * Returns the group of libraries at androidx.lifecycle.runtime
         */
        public AndroidxLifecycleRuntimeLibraryAccessors getRuntime() { return laccForAndroidxLifecycleRuntimeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() { return laccForAndroidxLifecycleViewmodelLibraryAccessors; }

    }

    public static class AndroidxLifecycleRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.runtime"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-runtime-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.lifecycle.runtime.compose"); }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.viewmodel"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.lifecycle.viewmodel.compose"); }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.navigation.compose"); }

    }

    public static class AndroidxPagingLibraryAccessors extends SubDependencyFactory {
        private final AndroidxPagingRuntimeLibraryAccessors laccForAndroidxPagingRuntimeLibraryAccessors = new AndroidxPagingRuntimeLibraryAccessors(owner);

        public AndroidxPagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.paging:paging-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.paging.compose"); }

        /**
         * Returns the group of libraries at androidx.paging.runtime
         */
        public AndroidxPagingRuntimeLibraryAccessors getRuntime() { return laccForAndroidxPagingRuntimeLibraryAccessors; }

    }

    public static class AndroidxPagingRuntimeLibraryAccessors extends SubDependencyFactory {

        public AndroidxPagingRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.paging:paging-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.paging.runtime.ktx"); }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.room.compiler"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.room.ktx"); }

            /**
             * Creates a dependency provider for paging (androidx.room:room-paging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() { return create("androidx.room.paging"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.room.runtime"); }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestEspressoLibraryAccessors laccForAndroidxTestEspressoLibraryAccessors = new AndroidxTestEspressoLibraryAccessors(owner);
        private final AndroidxTestExtLibraryAccessors laccForAndroidxTestExtLibraryAccessors = new AndroidxTestExtLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.espresso
         */
        public AndroidxTestEspressoLibraryAccessors getEspresso() { return laccForAndroidxTestEspressoLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test.ext
         */
        public AndroidxTestExtLibraryAccessors getExt() { return laccForAndroidxTestExtLibraryAccessors; }

    }

    public static class AndroidxTestEspressoLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestEspressoEspressoLibraryAccessors laccForAndroidxTestEspressoEspressoLibraryAccessors = new AndroidxTestEspressoEspressoLibraryAccessors(owner);

        public AndroidxTestEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.espresso.espresso
         */
        public AndroidxTestEspressoEspressoLibraryAccessors getEspresso() { return laccForAndroidxTestEspressoEspressoLibraryAccessors; }

    }

    public static class AndroidxTestEspressoEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestEspressoEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.test.espresso.espresso.core"); }

    }

    public static class AndroidxTestExtLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("androidx.test.ext.junit"); }

            /**
             * Creates a dependency provider for junit115 (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit115() { return create("androidx.test.ext.junit115"); }

    }

    public static class CodeLibraryAccessors extends SubDependencyFactory {

        public CodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("code.gson"); }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("coil.compose"); }

    }

    public static class DaggerLibraryAccessors extends SubDependencyFactory {
        private final DaggerHiltLibraryAccessors laccForDaggerHiltLibraryAccessors = new DaggerHiltLibraryAccessors(owner);

        public DaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at dagger.hilt
         */
        public DaggerHiltLibraryAccessors getHilt() { return laccForDaggerHiltLibraryAccessors; }

    }

    public static class DaggerHiltLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public DaggerHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("dagger.hilt"); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("dagger.hilt.compiler"); }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("espresso.core"); }

    }

    public static class JetbrainsLibraryAccessors extends SubDependencyFactory {
        private final JetbrainsKotlinLibraryAccessors laccForJetbrainsKotlinLibraryAccessors = new JetbrainsKotlinLibraryAccessors(owner);

        public JetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jetbrains.kotlin
         */
        public JetbrainsKotlinLibraryAccessors getKotlin() { return laccForJetbrainsKotlinLibraryAccessors; }

    }

    public static class JetbrainsKotlinLibraryAccessors extends SubDependencyFactory {

        public JetbrainsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStdlib() { return create("jetbrains.kotlin.stdlib"); }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("junit"); }

            /**
             * Creates a dependency provider for junit (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit.junit"); }

            /**
             * Creates a dependency provider for jupiter (org.junit.jupiter:junit-jupiter-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJupiter() { return create("junit.jupiter"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("kotlinx.coroutines.android"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("kotlinx.coroutines.core"); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("kotlinx.coroutines.test"); }

    }

    public static class Retrofit2LibraryAccessors extends SubDependencyFactory {
        private final Retrofit2ConverterLibraryAccessors laccForRetrofit2ConverterLibraryAccessors = new Retrofit2ConverterLibraryAccessors(owner);

        public Retrofit2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("retrofit2.retrofit"); }

        /**
         * Returns the group of libraries at retrofit2.converter
         */
        public Retrofit2ConverterLibraryAccessors getConverter() { return laccForRetrofit2ConverterLibraryAccessors; }

    }

    public static class Retrofit2ConverterLibraryAccessors extends SubDependencyFactory {

        public Retrofit2ConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("retrofit2.converter.gson"); }

    }

    public static class SquareupLibraryAccessors extends SubDependencyFactory {
        private final SquareupOkhttp3LibraryAccessors laccForSquareupOkhttp3LibraryAccessors = new SquareupOkhttp3LibraryAccessors(owner);

        public SquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at squareup.okhttp3
         */
        public SquareupOkhttp3LibraryAccessors getOkhttp3() { return laccForSquareupOkhttp3LibraryAccessors; }

    }

    public static class SquareupOkhttp3LibraryAccessors extends SubDependencyFactory {
        private final SquareupOkhttp3LoggingLibraryAccessors laccForSquareupOkhttp3LoggingLibraryAccessors = new SquareupOkhttp3LoggingLibraryAccessors(owner);

        public SquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at squareup.okhttp3.logging
         */
        public SquareupOkhttp3LoggingLibraryAccessors getLogging() { return laccForSquareupOkhttp3LoggingLibraryAccessors; }

    }

    public static class SquareupOkhttp3LoggingLibraryAccessors extends SubDependencyFactory {

        public SquareupOkhttp3LoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() { return create("squareup.okhttp3.logging.interceptor"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final EspressoVersionAccessors vaccForEspressoVersionAccessors = new EspressoVersionAccessors(providers, config);
        private final HiltVersionAccessors vaccForHiltVersionAccessors = new HiltVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final LifecycleVersionAccessors vaccForLifecycleVersionAccessors = new LifecycleVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: material (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: paging (3.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("paging"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: room (2.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.espresso
         */
        public EspressoVersionAccessors getEspresso() { return vaccForEspressoVersionAccessors; }

        /**
         * Returns the group of versions at versions.hilt
         */
        public HiltVersionAccessors getHilt() { return vaccForHiltVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlin
         */
        public KotlinVersionAccessors getKotlin() { return vaccForKotlinVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() { return vaccForKotlinxVersionAccessors; }

        /**
         * Returns the group of versions at versions.lifecycle
         */
        public LifecycleVersionAccessors getLifecycle() { return vaccForLifecycleVersionAccessors; }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() { return vaccForOrgVersionAccessors; }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxComposeVersionAccessors vaccForAndroidxComposeVersionAccessors = new AndroidxComposeVersionAccessors(providers, config);
        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("androidx.appcompat"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

        /**
         * Returns the group of versions at versions.androidx.compose
         */
        public AndroidxComposeVersionAccessors getCompose() { return vaccForAndroidxComposeVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() { return vaccForAndroidxTestVersionAccessors; }

    }

    public static class AndroidxComposeVersionAccessors extends VersionFactory  {

        public AndroidxComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.compose.runtime (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRuntime() { return getVersion("androidx.compose.runtime"); }

            /**
             * Returns the version associated to this alias: androidx.compose.ui (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUi() { return getVersion("androidx.compose.ui"); }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        private final AndroidxTestExtVersionAccessors vaccForAndroidxTestExtVersionAccessors = new AndroidxTestExtVersionAccessors(providers, config);
        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test.ext
         */
        public AndroidxTestExtVersionAccessors getExt() { return vaccForAndroidxTestExtVersionAccessors; }

    }

    public static class AndroidxTestExtVersionAccessors extends VersionFactory  {

        public AndroidxTestExtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.ext.junit (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("androidx.test.ext.junit"); }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: espresso.core (3.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("espresso.core"); }

    }

    public static class HiltVersionAccessors extends VersionFactory  {

        public HiltVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: hilt.android (2.47)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("hilt.android"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  {

        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlin.stdlib (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getStdlib() { return getVersion("kotlin.stdlib"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("kotlinx.coroutines"); }

    }

    public static class LifecycleVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public LifecycleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: lifecycle (2.6.1)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("lifecycle"); }

            /**
             * Returns the version associated to this alias: lifecycle.ktx (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("lifecycle.ktx"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.jetbrains
         */
        public OrgJetbrainsVersionAccessors getJetbrains() { return vaccForOrgJetbrainsVersionAccessors; }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsKotlinVersionAccessors vaccForOrgJetbrainsKotlinVersionAccessors = new OrgJetbrainsKotlinVersionAccessors(providers, config);
        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinVersionAccessors getKotlin() { return vaccForOrgJetbrainsKotlinVersionAccessors; }

    }

    public static class OrgJetbrainsKotlinVersionAccessors extends VersionFactory  {

        public OrgJetbrainsKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.jetbrains.kotlin.android (1.8.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("org.jetbrains.kotlin.android"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final ComPluginAccessors paccForComPluginAccessors = new ComPluginAccessors(providers, config);
        private final NlPluginAccessors paccForNlPluginAccessors = new NlPluginAccessors(providers, config);
        private final OrgPluginAccessors paccForOrgPluginAccessors = new OrgPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com
         */
        public ComPluginAccessors getCom() { return paccForComPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.nl
         */
        public NlPluginAccessors getNl() { return paccForNlPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.org
         */
        public OrgPluginAccessors getOrg() { return paccForOrgPluginAccessors; }

    }

    public static class ComPluginAccessors extends PluginFactory {
        private final ComAndroidPluginAccessors paccForComAndroidPluginAccessors = new ComAndroidPluginAccessors(providers, config);
        private final ComGithubPluginAccessors paccForComGithubPluginAccessors = new ComGithubPluginAccessors(providers, config);
        private final ComGooglePluginAccessors paccForComGooglePluginAccessors = new ComGooglePluginAccessors(providers, config);

        public ComPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com.android
         */
        public ComAndroidPluginAccessors getAndroid() { return paccForComAndroidPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.com.github
         */
        public ComGithubPluginAccessors getGithub() { return paccForComGithubPluginAccessors; }

        /**
         * Returns the group of plugins at plugins.com.google
         */
        public ComGooglePluginAccessors getGoogle() { return paccForComGooglePluginAccessors; }

    }

    public static class ComAndroidPluginAccessors extends PluginFactory {

        public ComAndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("com.android.application"); }

            /**
             * Creates a plugin provider for com.android.library to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("com.android.library"); }

            /**
             * Creates a plugin provider for com.android.library811 to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary811() { return createPlugin("com.android.library811"); }

    }

    public static class ComGithubPluginAccessors extends PluginFactory {
        private final ComGithubBenPluginAccessors paccForComGithubBenPluginAccessors = new ComGithubBenPluginAccessors(providers, config);

        public ComGithubPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com.github.ben
         */
        public ComGithubBenPluginAccessors getBen() { return paccForComGithubBenPluginAccessors; }

    }

    public static class ComGithubBenPluginAccessors extends PluginFactory {
        private final ComGithubBenManesPluginAccessors paccForComGithubBenManesPluginAccessors = new ComGithubBenManesPluginAccessors(providers, config);

        public ComGithubBenPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com.github.ben.manes
         */
        public ComGithubBenManesPluginAccessors getManes() { return paccForComGithubBenManesPluginAccessors; }

    }

    public static class ComGithubBenManesPluginAccessors extends PluginFactory {

        public ComGithubBenManesPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.github.ben.manes.versions to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersions() { return createPlugin("com.github.ben.manes.versions"); }

    }

    public static class ComGooglePluginAccessors extends PluginFactory {
        private final ComGoogleDaggerPluginAccessors paccForComGoogleDaggerPluginAccessors = new ComGoogleDaggerPluginAccessors(providers, config);

        public ComGooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com.google.dagger
         */
        public ComGoogleDaggerPluginAccessors getDagger() { return paccForComGoogleDaggerPluginAccessors; }

    }

    public static class ComGoogleDaggerPluginAccessors extends PluginFactory {
        private final ComGoogleDaggerHiltPluginAccessors paccForComGoogleDaggerHiltPluginAccessors = new ComGoogleDaggerHiltPluginAccessors(providers, config);

        public ComGoogleDaggerPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.com.google.dagger.hilt
         */
        public ComGoogleDaggerHiltPluginAccessors getHilt() { return paccForComGoogleDaggerHiltPluginAccessors; }

    }

    public static class ComGoogleDaggerHiltPluginAccessors extends PluginFactory {

        public ComGoogleDaggerHiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.dagger.hilt.android to the plugin id 'com.google.dagger.hilt.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("com.google.dagger.hilt.android"); }

    }

    public static class NlPluginAccessors extends PluginFactory {
        private final NlLittlerobotsPluginAccessors paccForNlLittlerobotsPluginAccessors = new NlLittlerobotsPluginAccessors(providers, config);

        public NlPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.nl.littlerobots
         */
        public NlLittlerobotsPluginAccessors getLittlerobots() { return paccForNlLittlerobotsPluginAccessors; }

    }

    public static class NlLittlerobotsPluginAccessors extends PluginFactory {
        private final NlLittlerobotsVersionPluginAccessors paccForNlLittlerobotsVersionPluginAccessors = new NlLittlerobotsVersionPluginAccessors(providers, config);

        public NlLittlerobotsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.nl.littlerobots.version
         */
        public NlLittlerobotsVersionPluginAccessors getVersion() { return paccForNlLittlerobotsVersionPluginAccessors; }

    }

    public static class NlLittlerobotsVersionPluginAccessors extends PluginFactory {
        private final NlLittlerobotsVersionCatalogPluginAccessors paccForNlLittlerobotsVersionCatalogPluginAccessors = new NlLittlerobotsVersionCatalogPluginAccessors(providers, config);

        public NlLittlerobotsVersionPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.nl.littlerobots.version.catalog
         */
        public NlLittlerobotsVersionCatalogPluginAccessors getCatalog() { return paccForNlLittlerobotsVersionCatalogPluginAccessors; }

    }

    public static class NlLittlerobotsVersionCatalogPluginAccessors extends PluginFactory {

        public NlLittlerobotsVersionCatalogPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for nl.littlerobots.version.catalog.update to the plugin id 'nl.littlerobots.version-catalog-update'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getUpdate() { return createPlugin("nl.littlerobots.version.catalog.update"); }

    }

    public static class OrgPluginAccessors extends PluginFactory {
        private final OrgJetbrainsPluginAccessors paccForOrgJetbrainsPluginAccessors = new OrgJetbrainsPluginAccessors(providers, config);

        public OrgPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.org.jetbrains
         */
        public OrgJetbrainsPluginAccessors getJetbrains() { return paccForOrgJetbrainsPluginAccessors; }

    }

    public static class OrgJetbrainsPluginAccessors extends PluginFactory {
        private final OrgJetbrainsKotlinPluginAccessors paccForOrgJetbrainsKotlinPluginAccessors = new OrgJetbrainsKotlinPluginAccessors(providers, config);

        public OrgJetbrainsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of plugins at plugins.org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinPluginAccessors getKotlin() { return paccForOrgJetbrainsKotlinPluginAccessors; }

    }

    public static class OrgJetbrainsKotlinPluginAccessors extends PluginFactory {

        public OrgJetbrainsKotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for org.jetbrains.kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("org.jetbrains.kotlin.android"); }

            /**
             * Creates a plugin provider for org.jetbrains.kotlin.android1810 to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid1810() { return createPlugin("org.jetbrains.kotlin.android1810"); }

    }

}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.newblablacar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newblablacar"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            buildConfigField("String", "TRIP_SEARCH_URL", "\"https://edge.blablacar.com/trip/\"")
            buildConfigField("String", "SEARCH_UUID", "\"8401658C-E98D-457E-A087-34FA2D979D69\"")
            buildConfigField("String", "TOKEN_URL", "\"https://edge.blablacar.com/\"")
            buildConfigField("String", "USER_AGENT", "\"candidate-281-04ef6fba-7b69-4d74-b6fd-44890917084b\"")
        }
        release {
            buildConfigField("String", "TRIP_SEARCH_URL", "\"https://edge.blablacar.com/trip/\"")
            buildConfigField("String", "SEARCH_UUID", "\"8401658C-E98D-457E-A087-34FA2D979D69\"")
            buildConfigField("String", "TOKEN_URL", "\"https://edge.blablacar.com/\"")
            buildConfigField("String", "USER_AGENT", "\"candidate-281-04ef6fba-7b69-4d74-b6fd-44890917084b\"")
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //Moshi
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    //Navigation
    val nav_version = "2.7.3"
    implementation("androidx.navigation:navigation-compose:$nav_version")

    //coil
    implementation("io.coil-kt:coil-compose:2.4.0")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.squareup.sqldelight") version "1.5.2" apply false
    kotlin("kapt") version "1.8.10"
    id("com.google.dagger.hilt.android") version "2.56.2" apply false
}
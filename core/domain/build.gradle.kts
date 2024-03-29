plugins {
    id("tydev.android.library")
    id("tydev.android.library.jacoco")
    kotlin("kapt")
}

android {
    namespace = "com.tydev.architectureTemplate.core.domain"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}

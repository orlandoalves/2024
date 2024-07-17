plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.test.uitests"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.test.uitests"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.uiautomator)
    implementation(libs.androidx.runner)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.uiautomator.v230alpha03)
    androidTestImplementation (libs.ext.junit)
    androidTestImplementation (libs.truth) // Ou versão mais recente
    androidTestImplementation (libs.hamcrest.library)  // Ou versão mais recente
}
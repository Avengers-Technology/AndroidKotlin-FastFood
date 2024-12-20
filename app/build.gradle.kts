plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.smeb9716"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.smeb9716"
        minSdk = 24
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

    viewBinding {
        enable = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.gson)
    // https://github.com/Spikeysanju/MotionToast
    implementation(libs.motionToast)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.convertergson)
    implementation(libs.interceptor)
    implementation(libs.ok2curl)
    // Lottie Splash
    implementation(libs.lottie)
    // Circle Image
    implementation(libs.circleimageview)
    // Glide
    implementation(libs.glide)

    // Lifecycle
    implementation(libs.lifecycleviewmodel)

    // Fragment
    implementation(libs.fragment)

    // ImageSlideShow: https://github.com/denzcoskun/ImageSlideshow
    implementation(libs.imageslideshow)
}
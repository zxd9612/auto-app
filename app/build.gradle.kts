plugins { id("com.android.application") }
android {
    namespace = "com.test.hello"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.test.hello"
        minSdk = 26; targetSdk = 33; versionCode = 1; versionName = "1.0"
    }
    buildTypes { getByName("release") { isMinifyEnabled = false } }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
dependencies {}

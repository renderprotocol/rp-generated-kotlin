plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

group = "com.nukive.renderprotocol"
version = "0.0.1-SNAPSHOT"

android {
    namespace = "com.nukive.renderprotocol"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    
    // Protobuf and gRPC dependencies required for the generated code
    api(libs.protobuf.java)
    api(libs.protobuf.kotlin)
    api(libs.grpc.stub)
    api(libs.grpc.protobuf)
    api(libs.grpc.kotlin.stub)
    api(libs.javax.annotation.api)
    
    testImplementation(libs.junit)
}
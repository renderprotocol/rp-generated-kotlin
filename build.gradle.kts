plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

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
    implementation(libs.protobuf.java)
    implementation(libs.protobuf.kotlin)
    implementation(libs.grpc.stub)
    implementation(libs.grpc.protobuf)
    implementation(libs.grpc.kotlin.stub)
    implementation(libs.javax.annotation.api)
    
    testImplementation(libs.junit)
}
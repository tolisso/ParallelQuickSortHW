plugins {
    kotlin("jvm") version "2.0.10"
}

group = "io.github.tolisso"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
}

tasks.test {
    useJUnitPlatform()
    jvmArgs = listOf("-Xms4g", "-Xmx4g")
}

kotlin {
    jvmToolchain(17)
}
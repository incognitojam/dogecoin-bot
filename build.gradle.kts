import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
}

group = "gg.dogecoin"
version = "1.0-SNAPSHOT"

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions.jvmTarget = "1.8"

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.github.cdimascio:dotenv-kotlin:6.2.2")
    implementation("dev.kord:kord-core:0.7.0-SNAPSHOT")
}

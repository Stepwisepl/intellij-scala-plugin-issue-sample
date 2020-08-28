import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

plugins {
    id("idea")
    kotlin("jvm") version "1.4.0"
}

group = "pl.stepwise"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_11

idea {
    project {
        jdkName = JavaVersion.VERSION_11.toString()
        languageLevel = IdeaLanguageLevel(JavaVersion.VERSION_11)
    }
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("com.typesafe.akka:akka-actor_2.13:2.6.8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.23")
}

plugins {
    kotlin("jvm") version "1.9.23"
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "main.java.org.variouslib.mylib.MyLib"
    }
}


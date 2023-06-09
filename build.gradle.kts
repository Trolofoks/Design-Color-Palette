buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Deps.ClassPath.androidGradlePlugin)
        classpath(Deps.ClassPath.kotlinGradlePlugin)
        classpath(Deps.ClassPath.kspGradlePlugin)
        classpath(Deps.ClassPath.serializationGradlePlugin)
    }
}

allprojects{
    repositories {
        mavenCentral()
        google()
        maven("https://jitpack.io")
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}


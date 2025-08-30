@file:Suppress("UnnecessaryVariable")

// Top-level build file where you can add configuration options common to all sub-projects/modules.

extra.apply {
    set("configurationName", "default")
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://jitpack.io")
    }
}

tasks {
    register<Delete>("clean").configure {
        delete(rootProject.buildDir)
    }
}

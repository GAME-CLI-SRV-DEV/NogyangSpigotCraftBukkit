import io.papermc.paperweight.util.Git

plugins {
    java
    `maven-publish`

    // In general, keep this version in sync with upstream. Sometimes a newer version than upstream might work, but an older version is extremely likely to break.
    id("io.papermc.paperweight.patcher") version "1.7.7"
}

val paperMavenPublicUrl = "https://repo.papermc.io/repository/maven-public/"

repositories {
    mavenCentral()
    maven(paperMavenPublicUrl) {
        content { onlyForConfigurations(configurations.paperclip.name) }
    }
}

dependencies {
    remapper("net.fabricmc:tiny-remapper:0.10.3:fat") // Must be kept in sync with upstream
    decompiler("org.vineflower:vineflower:1.10.1") // Must be kept in sync with upstream
    paperclip("io.papermc:paperclip:3.0.3") // You probably want this to be kept in sync with upstream
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "maven-publish")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }
}

subprojects {
    tasks.withType<JavaCompile> {
        options.encoding = Charsets.UTF_8.name()
        options.release = 21
    }
    tasks.withType<Javadoc> {
        options.encoding = Charsets.UTF_8.name()
    }
    tasks.withType<ProcessResources> {
        filteringCharset = Charsets.UTF_8.name()
    }

    repositories {
        mavenCentral()
        maven(paperMavenPublicUrl)
    }
}

val paperDir = layout.projectDirectory.dir("work/Paper")
val initSubmodules by tasks.registering {
    outputs.upToDateWhen { false }
    doLast {
        Git(layout.projectDirectory)("submodule", "update", "--init").executeOut()
    }
}

paperweight {
    serverProject = project(":NogyangSpigotCraftBukkit-Server")

    remapRepo = paperMavenPublicUrl
    decompileRepo = paperMavenPublicUrl

    upstreams {
        register("paper") {
            upstreamDataTask {
                dependsOn(initSubmodules)
                projectDir = paperDir
            }

            patchTasks {
                register("api") {
                    upstreamDir = paperDir.dir("Paper-API")
                    patchDir = layout.projectDirectory.dir("patches/api")
                    outputDir = layout.projectDirectory.dir("NogyangSpigot-API")
                }
                register("server") {
                    upstreamDir = paperDir.dir("Paper-Server")
                    patchDir = layout.projectDirectory.dir("patches/server")
                    outputDir = layout.projectDirectory.dir("NogyangSpigotCraftBukkit-Server")
                    importMcDev = true
                }
                register("generatedApi") {
                    isBareDirectory = true
                    upstreamDir = paperDir.dir("paper-api-generator/generated")
                    patchDir = layout.projectDirectory.dir("patches/generatedApi")
                    outputDir = layout.projectDirectory.dir("paper-api-generator/generated")
                }
            }
        }
    }
}

plugins {
    java  
}

repositories {
    mavenCentral() 
    maven {
      url = uri("https://repo.glowstone.net/content/repositories/snapshots/")
    }
    maven {
      url = uri("https://repo.spongepowered.org/repository/maven-public/")
    }
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
    maven {
    https://repo.glowstone.net/content/repositories/snapshots/
          }
}

dependencies {
    implementation(project(":NogyangSpigot-API")) // 14.0.0
    implementation("org.spongepowered:spongeapi:14.0.0-SNAPSHOT") // 14.0.0
    implementation("net.glowstone:Glowstone:2022.6.1-SNAPSHOT")
    // original by GlowstoneMC. Thank you!

}

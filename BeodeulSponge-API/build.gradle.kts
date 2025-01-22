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
}

dependencies {
    implementation("org.spongepowered:spongeapi:14.0.0-SNAPSHOT") // 14.0.0
implementation("org.spongepowered:spongeapi:1.21.4-14.0.0-SNAPSHOT") // 14.0.0
    implementation("net.glowstone:glowstone:2022.6.1-SNAPSHOT") // 2022.6.1
}

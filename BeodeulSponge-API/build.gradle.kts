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
}

dependencies {
    implementation(project(":NogyangSpigot-API")) // 12.0.0
    implementation("org.spongepowered:spongeapi:12.0.0-SNAPSHOT") // 12.0.0
    implementation("com.google.inject:guice:4.0")
    implementation("org.spongepowered:configurate-hocon:4.1.2")
    implementation("org.ow2.asm:asm:9.7.1")
   implementation("org.ow2.asm:asm-commons:9.7.1")
   compileOnly("org.projectlombok:lombok:1.18.36")

// original by GlowstoneMC. Thank you!

}

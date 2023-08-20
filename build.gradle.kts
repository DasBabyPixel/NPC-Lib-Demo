plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    maven("https://repository.derklaro.dev/releases/")
}

dependencies {
    val group = "com.github.juliarn.NPC-Lib"
    implementation(group, "npc-lib-bukkit", "3.0.0-beta5")
    implementation(group, "npc-lib-minestom", "3.0.0-beta5")
    implementation(group, "npc-lib-api", "3.0.0-beta5")
    implementation(group, "npc-lib-common", "3.0.0-beta5")
}

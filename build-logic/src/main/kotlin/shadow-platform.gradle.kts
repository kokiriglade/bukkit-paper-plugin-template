plugins {
    id("platform-conventions")
    id("com.gradleup.shadow")
    id("xyz.jpenilla.gremlin-gradle")
}

tasks {
    jar {
        archiveClassifier = "unshaded"
    }

    shadowJar {
        archiveClassifier.set(null as String?)
        relocateDependency("net.kyori.adventure.serializer.configurate4")
        relocateDependency("xyz.jpenilla.gremlin")
    }

    writeDependencies {
        relocateDependency("net.kyori.adventure.serializer.configurate4")
    }
}

extensions.configure<PlatformExtension> {
    productionJar = tasks.shadowJar.flatMap { it.archiveFile }
}

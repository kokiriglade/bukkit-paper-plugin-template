plugins {
    id("platform-conventions")
    id("com.gradleup.shadow")
}

tasks {
    jar {
        archiveClassifier = "unshaded"
        dependsOn(check)
    }

    shadowJar {
        dependsOn(check)
        archiveClassifier.set(null as String?)
        // relocations here
    }
}

extensions.configure<PlatformExtension> {
    productionJar = tasks.shadowJar.flatMap { it.archiveFile }
}

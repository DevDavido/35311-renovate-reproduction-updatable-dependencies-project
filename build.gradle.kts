plugins {
    java

    id("io.quarkus")
}

description = "..."
group = "com.test"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:3.19.3"))
    implementation("org.jboss.slf4j:slf4j-jboss-logmanager")
    implementation("io.quarkus:quarkus-agroal")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-config-yaml")
    implementation("io.quarkus:quarkus-container-image-docker")
    implementation("io.quarkus:quarkus-jdbc-mssql")
    implementation("io.quarkus:quarkus-smallrye-fault-tolerance")

    implementation("org.apache.commons:commons-csv:1.13.0")
    implementation("org.apache.commons:commons-lang3:3.17.0")

    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.quarkus:quarkus-junit5-mockito")
    testImplementation("io.quarkus:quarkus-jacoco")
    testImplementation("org.wiremock:wiremock:3.12.1")
}

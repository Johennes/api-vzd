/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

tasks.withType<JavaCompile>() {
    options.compilerArgs.add("-Xlint:unchecked")
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.4.3")
    implementation("org.bitbucket.b_c:jose4j:0.9.1")
    implementation("org.bouncycastle:bcprov-jdk15on:1.70")
    implementation("org.bouncycastle:bcpkix-jdk15on:1.70")

    // Use JUnit test framework.
    testImplementation("junit:junit:4.13.2")

    testImplementation("io.rest-assured:rest-assured:5.2.0")
    testImplementation("io.rest-assured:json-path:5.2.0")

    // HAPI FHIR LIBRARIES for Mapping FHIR Resources
    implementation ("ca.uhn.hapi.fhir:hapi-fhir-base:6.10.5")
    implementation ("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:6.10.5")

    // HAPI FHIR Client
    implementation ("ca.uhn.hapi.fhir:hapi-fhir-client:6.10.5")
}

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"



repositories {
    mavenCentral()
}

dependencies {

    implementation("org.apache.ignite:ignite-core:2.16.0")
    implementation("org.springframework:spring-beans:5.2.25.RELEASE")
    implementation("org.apache.ignite:ignite-spring:2.16.0")
}


tasks.test {
    useJUnitPlatform()
}
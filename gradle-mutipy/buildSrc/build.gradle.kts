plugins {
    `kotlin-dsl`
}

group = "jzxy.cbq"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

gradlePlugin{
    plugins {
        create("cbq-plugin"){
            id = "cbq-plugin"
            implementationClass = "jzxy.cbq.plugins.CbqPlugin"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
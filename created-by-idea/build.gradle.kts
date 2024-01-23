plugins {
    id("java")
    id("application")
}

group = "jzxy.cbq"
version = "1.0-SNAPSHOT"

java {   //configure<JavaApplication> 也可以直接写成 java 这个扩展函数，效果一样
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}

application {   //同 configure<JavaApplication>
    mainClass = "jzxy.cbq.Main"  //配置主类
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.springframework:spring-context:6.1.3")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

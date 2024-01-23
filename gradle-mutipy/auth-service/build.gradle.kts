plugins {
    `java-library`   //java-library 提供了传递依赖 api 函数
}

dependencies {
    api(project(":commons"))   //与 implementation 效果一样，但是支持传递依赖
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
tasks.test {
    useJUnitPlatform()
}
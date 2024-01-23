subprojects {   //subprojects 表示对所有的子项目生效
    apply(plugin = "java")   //定义插件需要使用 apply 来完成，plugin{} 在这里不行

    group = "jzxy.cbq"
    version = "1.0-SNAPSHOT"

    repositories {   //定义自定义仓库地址
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
    }
}
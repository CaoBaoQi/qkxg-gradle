import jzxy.cbq.config.JavaVersionConfig
import jzxy.cbq.config.mavenALiBaBa

subprojects {   //subprojects 表示对所有的子项目生效
    apply(plugin = "java")   //定义插件需要使用 apply 来完成，plugin{} 在这里不行

    group = "jzxy.cbq"
    version = "1.0-SNAPSHOT"

    configure<JavaPluginExtension>{
        sourceCompatibility = JavaVersionConfig.sourceVersion
        targetCompatibility = JavaVersionConfig.targetVersion
    }

    repositories {   //定义自定义仓库地址
        mavenALiBaBa()
    }
}
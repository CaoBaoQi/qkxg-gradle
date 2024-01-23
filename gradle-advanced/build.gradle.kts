plugins {
    id("java")
}

group = "jzxy.cbq"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
    mavenCentral()
}

dependencies {
}

tasks.register("CBQ") {   //第一个参数为任务名称，第二个参数使用 Lambda 编写任务具体操作
    group = "build"
    description = "I am Task-CBQ"
    //任务包含一个完整的操作列表，我们需要传入对应的 Action 到队列中，这样就可以依次执行了
    doFirst {   //使用 doFirst 向任务队列首部插入新的 Action，也就是要执行的内容
        println("Task-CBQ: doFirst")
        println("params: ${project.properties["p1"]}")
    }
    doLast {   //向队列尾部插入Action
        println("Task-CBQ: doLast")
    }
    dependsOn(tasks.compileJava)
}

tasks.build {   //直接从 tasks 中获取，这仅限于插件提供的任务
    dependsOn("CBQ")
}

defaultTasks("CBQ")

// 继承 DefaultTask 类来创建一个自定义的 HelloTask 类，注意这个类必须要可继承，要么 open 要么直接抽象类
open class HelloTask : DefaultTask() {
    private var name: String = ""

    @TaskAction   //添加 @TaskAction 注解来声明此函数为任务的 Action
    fun hello() {
        println("${name}: NGM AiYou")
    }

    fun user(name: String) {   // 类中也可以具有其他的函数
        this.name = name
    }
}

tasks.register<HelloTask>("hello") {   //使用 register 时指明我们自定义的任务类
    user("CXK")   //此时 this 就是 HelloTask 类型了，我们可以直接使用自定义的函数
}

tasks.register<Copy>("hello-copy") {   //这里使用Copy类型
    from("build/classes")   //使用 from 和 into 设置复制的目录和目标位置
    into("test")
    dependsOn(tasks.build)   //依赖一下 build
}

var time: Long = 0
gradle.taskGraph.beforeTask {
    time = System.currentTimeMillis()
}

gradle.taskGraph.afterTask {
    val takeTime = System.currentTimeMillis() - time
    println("Task-$name time: ${takeTime} ms")
}
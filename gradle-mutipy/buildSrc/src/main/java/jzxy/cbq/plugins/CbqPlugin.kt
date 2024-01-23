package jzxy.cbq.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class CbqPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("cxk") {
            doLast { println("cbqPlugin: NGM") }
        }

        target.tasks.register("ji") {
            doLast { println("cbqPlugin: AiYou") }
            dependsOn(target.tasks.named("cxk"))
        }
    }
}
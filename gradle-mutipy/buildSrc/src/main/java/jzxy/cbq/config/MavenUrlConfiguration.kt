package jzxy.cbq.config

import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.mavenALiBaBa() = maven {
    setUrl("https://maven.aliyun.com/repository/public/")
}
package com.github.kclay.intelljclickupplugin.services

import com.github.kclay.intelljclickupplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

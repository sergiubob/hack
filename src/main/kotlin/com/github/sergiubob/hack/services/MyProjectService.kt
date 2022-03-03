package com.github.sergiubob.hack.services

import com.intellij.openapi.project.Project
import com.github.sergiubob.hack.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

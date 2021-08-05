package io.github.grigala.plugins.ruta.services

import com.intellij.openapi.project.Project
import io.github.grigala.plugins.ruta.MyBundle

class RutaProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

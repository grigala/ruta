package io.github.grigala.plugins.ruta.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import io.github.grigala.plugins.ruta.services.RutaApplicationService

internal class RutaProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<RutaApplicationService>()
    }
}

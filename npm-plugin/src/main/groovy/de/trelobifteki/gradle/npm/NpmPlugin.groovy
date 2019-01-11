package de.trelobifteki.gradle.npm

import org.gradle.api.Plugin
import org.gradle.api.Project

import de.trelobifteki.gradle.npm.tasks.NodeSetupTask
import de.trelobifteki.gradle.npm.tasks.NpmTaskNames

class NpmPlugin implements Plugin<Project> {

	private Project project;
	private NpmExtension extension;
	
	@Override
	public void apply(final Project project) {
		this.project = project;
		
		extension = project.extensions.create(NpmExtension.NAME, NpmExtension, project);
		
		addTasks()
	}
	
	private void addTasks() {
		project.tasks.create(NpmTaskNames.NODE_SETUP, NodeSetupTask)
	}

}

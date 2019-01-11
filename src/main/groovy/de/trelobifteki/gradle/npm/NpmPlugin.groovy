package de.trelobifteki.gradle.npm

import org.gradle.api.Plugin
import org.gradle.api.Project

class NpmPlugin implements Plugin<Project> {

	private Project project;
	private NpmExtension extension;
	
	@Override
	public void apply(final Project project) {
		this.project = project;
		
		extension = project.extensions.create(NpmExtension.NAME, NpmExtension, project);
	}

}

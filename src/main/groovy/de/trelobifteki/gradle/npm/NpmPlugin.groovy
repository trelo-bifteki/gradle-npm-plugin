package de.trelobifteki.gradle.npm

import org.gradle.api.Plugin
import org.gradle.api.Project

class NpmPlugin implements Plugin<Project> {

	private Project project;
	
	@Override
	public void apply(final Project project) {
		this.project = project;
	}

}

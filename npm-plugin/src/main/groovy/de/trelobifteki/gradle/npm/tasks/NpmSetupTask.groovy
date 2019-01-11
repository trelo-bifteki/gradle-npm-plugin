package de.trelobifteki.gradle.npm

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class NpmSetupTask extends DefaultTask {
	
	NpmSetupTask() {
		this.group = 'npm'
		this.description = 'Setup a specific version of npm to be used by the build'
	}
	
	@TaskAction
	void run() {
		
	}
	
}

package de.trelobifteki.gradle.npm.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging
import org.gradle.api.tasks.TaskAction

/**
 * Task for setting up node, if required
 * @author lampros.papadimitrou
 *
 */
class NodeSetupTask extends DefaultTask {

	private static final Logger logger = Logging.getLogger(NodeSetupTask)	
	
	@TaskAction
	void setupNode() {
		logger.infoEnabled('Setting up')
	}
}

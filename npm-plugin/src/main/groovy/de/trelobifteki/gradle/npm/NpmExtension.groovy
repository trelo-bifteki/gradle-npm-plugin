package de.trelobifteki.gradle.npm

import org.gradle.api.Project

class NpmExtension {
  final static String NAME = 'npm'
  
  String nodeVersion = '10.6.0'
  
  String npmVersion = ''
  
  String npmCommand = 'npm'
  
  
  NpmExtension(final Project project) {
	  final File cacheDir = project.file('.gradle')
  }
  
}

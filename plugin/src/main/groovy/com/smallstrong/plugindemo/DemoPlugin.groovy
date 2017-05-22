package com.smallstrong.plugindemo

import org.gradle.api.Plugin
import org.gradle.api.Project

public class DemoPlugin implements Plugin<Project> {
        void apply(Project project){
                project.task('testTask') << {
                        println "Hello gradle plugin"
                }

        }
}
#!/usr/bin/env groovy

pipeline {
    agent any
    tools {
        maven 'maven3'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean test'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}
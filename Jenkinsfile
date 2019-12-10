pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '30', daysToKeepStr: '90'))
    }
    stages {
        stage('Clean and checkout project') {
            steps{
                deleteDir()
                checkout(changelog: false, scm: scm)
            }
        }
        stage('Build') {
            steps{
                sh 'mvn build'
            }
        }
        stage('Test') {
            steps{
                sh 'mvn test'
            }
        }
    }
}
pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        sh 'git clone https://github.com/morpheous27/java.git'
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

  }
  environment {
    dev = 'dev'
  }
}
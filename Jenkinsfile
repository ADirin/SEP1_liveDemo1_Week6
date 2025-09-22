pipeline {
    agent any
tools {
     maven 'Maven3'
}
stages {
    stage ('check'){
        steps {
        git branch: 'master', url:'https://github.com/ADirin/SEP1_liveDemo1_Week6.git'
        echo 'hello world'

        }
    }
    stage('build') {
        steps {
            bat 'mvn clean install' //test it
        }
    }

    stage ('report') {
        steps {
            bat  'mvn test jacoco:report' //
        }

    }
    stage('Test') { // new jacoco report
                steps {
                    bat 'mvn test'  // Run tests
                    // List all files in target directory to see what's generated
                    bat 'dir target /s'
                }
    }

}


}
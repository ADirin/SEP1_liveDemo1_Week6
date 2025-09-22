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
            bat 'mvn clean install'
        }
    }

    stage ('report') {
        steps {
            bat  'mvn test jacoco:report' //
        }

    }

}


}
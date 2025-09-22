pipeline {
    agent any
tools {
     maven 'Maven3'
}
stages {
    stage ('check'){
        steps {
        git branch 'master', url:''
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
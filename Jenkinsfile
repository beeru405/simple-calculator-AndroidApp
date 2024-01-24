pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                    // Check the test results and mark the build as failed if any test failed
                    currentBuild.result = currentBuild.resultIsBetterOrEqualTo('UNSTABLE') ? currentBuild.result : 'FAILURE'
                }
            }
        }
    }
}

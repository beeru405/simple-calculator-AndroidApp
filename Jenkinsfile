pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/beeru405/simple-calculator-AndroidApp.git'
            }
        }

        stage('Build APK') {
            steps {
                script {
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Run UI Tests') {
            steps {
                script {
                    sh './gradlew connectedAndroidTest'
                }
            }
        }
    }

    post {
        always {
            // Clean up or notify if needed
        }
    }
}

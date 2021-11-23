pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven 3.8.3"
    }

    stages { 
        stage('Clean'){
            steps{
                bat "mvn clean"
            }
        }
        
        stage('Compile') {
            steps {
                bat "mvn compile"
                bat echo "compilando"
            }
          
        stage('Test') {
            steps {
                bat "mvn test"
                bat echo "probando"
            }
        }
    }
}

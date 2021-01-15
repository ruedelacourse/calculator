pipeline {

	environment {
		imagename = 'agileforreal/calculator'
		dockerImage = ''
	}

    agent any

    stages {
    
        stage("Compile")  {
            steps  {
                sh "./gradlew compileJava"   
            }
        }
        stage("Unit Test")  {
            steps  {
                sh "./gradlew test"   
            }
        }
        stage("Package") {
               steps {
                    sh "./gradlew build"
               }
          }
          stage("Docker build") {
               steps {
               		script {
               			// build our docker image
        				sh "/usr/local/bin/docker build -t agileforreal/calculator ."
        			}
               }
          }
          stage("Docker push") {
               steps {
                    sh "/usr/local/bin/docker push agileforreal/calculator"
               }
          }
    }
}
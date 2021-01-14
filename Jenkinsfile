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
        				dockerImage = docker.build imagename
        			}
               }
          }
          stage("Docker push") {
               steps {
                    sh "docker push agileforreal/calculator"
               }
          }
    }
}
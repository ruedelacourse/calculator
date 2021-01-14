pipeline {
    agent any

    stages {
    
	     stage('Initialize'){
	     	steps  {
	        	def dockerHome = tool 'myDocker'
	        	env.PATH = "${dockerHome}/bin:${env.PATH}"
	       } 	
	    }
    
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
                    sh "docker build -t agileforreal/calculator ."
               }
          }
          stage("Docker push") {
               steps {
                    sh "docker push agileforreal/calculator"
               }
          }
    }
}
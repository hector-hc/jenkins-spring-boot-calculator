pipeline {
	agent any
	stages {
	    stage("Compile") {
	        steps {
	            sh "./mvnw compile"
	        }

	    }
	    stage("Unit test") {
	    	sh "./mvnw test"
	    }
	}

}
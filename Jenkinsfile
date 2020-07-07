pipeline {
	agent any
	stages {
	    stage("Compile") {
	        steps {
	            sh "./mvnw compile"
	        }

	    }
	    stage("Unit test") {
	    	steps {
	    		sh "./mvnw test"
	    		publishHTML (target: [
	    			reportDir: 'target/site/jacoco/',
                	reportFiles: 'index.html',
                	reportName: "JaCoCo Report"
            	])
	    	}
	    }
	    stage("Code coverage") {
	    	steps {
	    		sh "./mvnw verify"
	    	}
	    }
	}
}
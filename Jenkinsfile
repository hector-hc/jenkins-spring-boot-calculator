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
	    stage("Package") {
	        steps {
	            sh "./mvnw clean package -DskipTests"
	        }

	    }
	    stage("Docker build") {
	    	steps {
	    	     sh "docker build -t hector-hc/jenkins-spring-boot-calculator:1.0 ."
	    	}
	    }
	    stage("Docker push") {
	    	steps {
                 sh "docker push hector-hc/jenkins-spring-boot-calculator:1.0"
	    	}
                  
	    }


	    
	    /*stage("Static code analysis") {
	    	steps {
	    		sh "./mvnw checkstyle:checkstyle";
	    			publishHTML (target: [
        			reportDir: 'target/site/',
        			reportFiles: 'checkstyle.html',
        			reportName: "Checkstyle Report"
				])
	    	}
	    }*/
	}
}
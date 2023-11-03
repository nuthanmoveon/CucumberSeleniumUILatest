pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_9_5') {
                    bat 'mvn clean install'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_9_5') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Cucumber Reports') {
            steps {
                 cucumber buildStatus:"UNSTABLE",
                        fileIncludePattern:"**/cucumber.json",
                        jsonReportDirectory:'target'
                }
            }
        }
    }

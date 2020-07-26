pipeline {
    agent any 
    environment {
        SOME_VAR = "SOME VALUE"
    }
    stages {
        stage('Example') {
            steps {
                echo 'print example'
                echo "hello ${SOME_VAR}"
            }
        }
    }
}
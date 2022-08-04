def call() {
    dir("${env.JENKINS_HOME}/jobs/${env.JOB_NAME}/builds/${env.BUILD_NUMBER}/libs/jenkins-shared-lib/resources")
    sh '''
        docker build -t sample .
    '''
}

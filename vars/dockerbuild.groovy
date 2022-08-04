def call() {
    sh '''
        dockerImage = docker.build sample:0.1.0
    '''
}

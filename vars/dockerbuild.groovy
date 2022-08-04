def call() {
    sh '''
        docker.build sample:0.1.0
    '''
}

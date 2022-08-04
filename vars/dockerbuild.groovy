def call() {
    sh '''
        docker build resources/Dockerfile .
    '''
}

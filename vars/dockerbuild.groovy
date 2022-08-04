def call() {
    sh '''
        docker build -t resources/Dockerfile .
    '''
}

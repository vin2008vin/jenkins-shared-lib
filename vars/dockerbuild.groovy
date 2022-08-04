def call() {
    sh '''
        docker build -f resources/Dockerfile sample .
    '''
}

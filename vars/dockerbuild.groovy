def call() {
    sh '''
        docker build -t resource/Dockerfile .
    '''
}

def call() {
    sh '''
        docker build -t ${WORKSPACE}/resource/Dockerfile sample .
    '''
}

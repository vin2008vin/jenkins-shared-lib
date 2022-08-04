def call() {
    sh '''
        docker build sample .
    '''
}

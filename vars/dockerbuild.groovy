def call() {
    sh '''
        docker build -t sample:0.1.0
    '''
}

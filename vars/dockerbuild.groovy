def call() {
    sh '''
        docker build -t ${WORKSPACE}sample .
    '''
}

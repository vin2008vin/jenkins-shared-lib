def call() {
    sh '''
        docker build -t 647834768285.dkr.ecr.ap-south-1.amazonaws.com/sample .
    '''
}

def call(){
   sh '''
        docker tag sample:0.1.0 647834768285.dkr.ecr.ap-south-1.amazonaws.com/sample:0.1.0
        docker push 647834768285.dkr.ecr.ap-south-1.amazonaws.com/sample:0.1.0
    '''
}

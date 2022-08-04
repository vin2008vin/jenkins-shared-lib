def call(){
   sh '''
        docker tag nginx:0.1.0 647834768285.dkr.ecr.ap-south-1.amazonaws.com/nginx:latest
        docker push 647834768285.dkr.ecr.ap-south-1.amazonaws.com/nginx:latest
    '''
}

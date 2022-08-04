def call(){
   sh '''
        docker tag nginx:latest 647834768285.dkr.ecr.ap-south-1.amazonaws.com/nginx:latest
        docker push 647834768285.dkr.ecr.ap-south-1.amazonaws.com/nginx:latest
    '''
}

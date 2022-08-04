def call(){
   sh '''
        docker tag nginx:alpine
        docker push 647834768285.dkr.ecr.ap-south-1.amazonaws.com/nginx
    '''
}

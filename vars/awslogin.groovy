def call() {
            sh ''' 
			aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 647834768285.dkr.ecr.ap-south-1.amazonaws.com
			'''
        }
    
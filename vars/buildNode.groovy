#!/user/bin/env groov
def call(){
    echo "Building the application for branch $BRANCH_NAME"
    sh "npm install"
}
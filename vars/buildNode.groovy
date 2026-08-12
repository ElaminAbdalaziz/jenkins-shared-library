#!/user/bin/env groovy
package vars

def call(){
    echo "Building the application..."
    sh "npm install"
}

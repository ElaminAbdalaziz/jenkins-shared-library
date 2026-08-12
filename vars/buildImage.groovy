<<<<<<< HEAD
#!/user/bin/env groovy
import com.example.Docker

def call(String imageName){
    return new Docker(this).buildDockerImage(imageName)
=======
#!/user/bin/env groovy
import com.example.Docker

def call(String imageName){
    return new Docker(this).buildDockerImage(imageName)
>>>>>>> 6d99d25fb2f4127825a93cca57ce356883bf9b41
}
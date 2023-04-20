def call (){
    withCredentials([
        usernamePassword(credentialsId: 'docker', 
        passwordVariable: 'password', 
        usernameVariable: 'username')]) {
    sh "docker login -u '$username' -p '$password'"

}
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}
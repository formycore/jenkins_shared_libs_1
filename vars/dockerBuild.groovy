def call (String project, String hubUser, String ImageTag){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
        dockere image tag ${hubUser}/${project} ${hubUser}/${project}:latest

    """
}
# DatastoreService
## Server side code for the DatastoreService
This package contains the source code, deployment script, and Dockerfile for the server of this app, please complete the instructions at the top-level README before proceeding to this step.

### Project Structure
```bash
gRPC
│
├── DatastoreService.iml
├── deploy.sh
├── Dockerfile
├── pom.xml
├── README.md
├── src/main
│   ├── java/neu/edu
│   └── resources  
│
└── target
    └── DatastoreServerGrpc.jar
```

If you have completed the installation step correctly in the top-level README, you should now see a file called DatastoreServerGrpc.jar, please confirm this file was generated as it is needed to run the server.

### Running the Server in Docker (optional)
The easiest way to launch the server is with Docker. Once you have installed Docker launch the server by running the deploy.sh script in the **DatastoreService/gRPC** Terminal session:

`gRPC % ./deploy.sh`

You should see the following output to Terminal
![Terminal output](images/server-docker-output.png)

The deploy.sh script has created a network and a Docker image for the server. Next it runs the server in a container. Now you are ready to launch the the client. Skip ahead to the README in the  DatastoreClient subdirectory to use the service.

### Running the Server locally from the Terminal
In the **DatastoreService/gRPC** Terminal run the following command:

`java -jar target/DatastoreServerGrpc.jar <port>`

If no port is supplied, the server defaults to 9091. You should see the following output to Terminal:

`Oct 19, 2021 5:23:57:965 [INFO]: Server started on port <port> `

You are now ready to launch the client. Skip ahead to the README in the DatastoreClient subdirectory and follow the instructions under the **Running the Server locally from the Terminal** heading.

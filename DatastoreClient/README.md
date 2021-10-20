# DatastoreClient
## Client side code for the DatastoreService
This package contains the source code, run script, and Dockerfile for the client of this app, please complete the instructions at the top-level README and the DatastoreService/gRPC README before proceeding to this step.

### Project Structure
```bash
DatastoreClient
│
├── DatastoreClient.iml
├── Dockerfile
├── pom.xml
├── README.md
├── run_client.sh
├── src/main
│   ├── java/neu/edu
│   └── resources  
│
└── target
    └── DatastoreClientGrpc.jar
```

If you have completed the installation step correctly in the top-level README, you should now see a file called DatastoreClientGrpc.jar, please confirm this file was generated as it is needed to run the client.

### Running the Client in Docker (optional)
The easiest way to launch the client is with Docker. Once you have installed Docker launch the client by running the run_client.sh script in the **DatastoreClient** Terminal session:

`DatastoreClient % ./run_client.sh`

You should see the following output to Terminal
![Terminal output](images/client-docker-output.png)

The run_client.sh script has created a Docker image for the client. Next it runs the client in a container. If you completed the server build correctly in the previous README, the client connects to the server container and performs some test operations on the datastore. You are now ready to communicate with the server.

*NOTE if you used Docker to launch the server you must also use Docker to launch the client and vice versa, this is not strictly true always but this is how the run_client script in this project is configured

### Running the client locally from the Terminal
in the **DatastoreClient** Terminal run the following command: 

`DatastoreClient % java -jar target/DatastoreClientGrpc.jar <host> <port>`

You should see the following output to Terminal if the connection is successfully established:

`Oct 19, 2021 5:27:35:691 [INFO]: Client connected to <host> on port <port>`

The client will then run a test on the datastore, you are now ready to communicate with the server.

### Using the service
Whether you deployed the app in Docker containers or locally via Terminal, communicating with the server is exactly the same. Enter requests at the prompt. Requests arguments should be seperated by spaces in the form <operation> <key> <value>

Example:

```Oct 19, 2021 11:41:21:516 [INFO]: Enter your request:  
put Test HelloWorld
Oct 19, 2021 11:41:29:139 [INFO]: Request: PUT <Test, HelloWorld> 
Oct 19, 2021 11:41:29:157 [INFO]: Response: 200 OK  
```
When you are ready, enter `CLOSE` to exit the program

# DatastoreClient
## Client side code for the DatastoreService
This package contains the source code, run script, and Dockerfile for the client of this app, please complete the instructions at the top-level README and the DatastoreService/gRPC README before proceeding to this step.

#### Project Structure
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

#### Running the Client in Docker (optional)
The easiest way to launch the client is with Docker. Once you have installed Docker launch the client by running the run_client.sh script in the **DatastoreClient** Terminal session:

`DatastoreClient % ./run_client.sh`

You should see the following output to Terminal
![Terminal output](images/client-docker-output.png)

The run_client.sh script has created a Docker image for the client. Next it runs the client in a container. If you completed the server build correctly in the previous README, the client connects to the server container and performs some test operations on the datastore. You are now ready to store, retrieve, and delete keys from the datastore.

#### Running the client locally from the Terminal


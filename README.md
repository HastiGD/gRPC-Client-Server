# DatastoreService
## A Client-Server App for storing single <key, value> pairs via Remote Procedural Calls implemented with gRPC
### Author: Hasti Gheibi Dehnashi

#### Project Structure
```bash
gRPC-Client-Server
│
├── README.md
├── DatastoreClient
│   ├── DatastoreClient.iml
│   ├── Dockerfile
│   ├── pom.xml
│   ├── run_client.sh
│   └── src/main
│       ├── java/neu/edu
│       └── resources
│   
│
└── DatastoreServer/gRPC
    ├── DatastoreService.iml
    ├── deploy.sh
    ├── Dockerfile
    ├── pom.xml
    └── src/main
        ├── java/neu/edu
        └── resources
```
#### Requirements
- Java SDK
- [Maven](http://maven.apache.org/download.html)
- [Docker](https://docs.docker.com/get-docker/) (optional)

#### Installation
1. Download the repository to your desktop and unzip it
2. Open two Terminal session and navigate to the DatastoreClient directory in one, and to the DatastoreService/gRPC directory in the other like below:

`Desktop % cd gRPC-Client-Server-master/DatastoreClient`

`Desktop % cd gRPC-Client-Server-master/DatastoreService/gRPC`

3. In each Terminal session install the  package with Maven by issuing the following command

`DatastoreClient % mvn install clean`

`gRPC % mvn install clean`

That condludes the steps for installing the packages, continue on to the README's in each subdirectory,  DatastoreClient and DatastoreService/gRPC to run the service.

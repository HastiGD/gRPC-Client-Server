# DatastoreService
## A Client-Server App for storing single <key, value> pairs via Remote Procedural Calls implemented with gRPC
### Author: Hasti Gheibi Dehnashi
Scalable Distributed Systems - Northeastern University

#### Project Structure
```bash
gRPC-Client-Server
|
├── README.md
├── DatastoreClient
│   ├── DatastoreClient.iml
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/main
│       ├── java/neu/edu
|       └── resources
│   
|
└── DatastoreServer/gRPC
    ├── DatastoreService.iml
    ├── Dockerfile
    ├── pom.xml
    └── src/main
        ├── java/neu/edu
        └── resources
```
#### Requirements
- Maven
- JDK 1.8+

#### Installation
1. Download the repository to your desktop and unzip it
2. Open two Terminal session and navigate to the DatastoreClient directory in one, and to the DatastoreService/gRPC directory in the other

`cd DatastoreClient`
`cd DatastoreService/gRPC`

3. In each Terminal session install the  package with Maven by issuing the following command

`mvn install`

That condludes the steps for installing the packages, continue on to the README in each subdirectory to run the service



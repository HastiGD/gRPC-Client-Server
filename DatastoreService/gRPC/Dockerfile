FROM bellsoft/liberica-openjdk-alpine-musl:11 AS server-build
COPY target/DatastoreServerGrpc.jar /usr/server.jar
WORKDIR /usr
CMD ["java", "-jar", "server.jar", "9091"]
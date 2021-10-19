FROM bellsoft/liberica-openjdk-alpine-musl:11
COPY target/DatastoreServerGrpc.jar /usr/server.jar
WORKDIR /usr
CMD ["java", "-jar", "server.jar", "9091"]
FROM openjdk:11-jre-slim
MAINTAINER tebeling
COPY target/graphQLEndpoint-1.0.0.jar graphQLEndpoint-1.0.0.jar
ENTRYPOINT ["java","-jar","/graphQLEndpoint-1.0.0.jar"]
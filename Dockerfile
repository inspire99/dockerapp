FROM openjdk:8
ADD target/dock.jar dock.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dock.jar"]
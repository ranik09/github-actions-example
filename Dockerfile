FROM openjdk:17
EXPOSE 8080
ADD target/sprinboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]
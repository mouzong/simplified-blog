FROM maven:3.8.4-openjdk-17-slim AS build

#Repertoire de travail
WORKDIR  /simplified-blog

#copier les source dans le containeur
COPY pom.xml .
COPY src ./src

#construction du projet avec maven
RUN mvn clean package -DskipTests

#Utilisation de l'image Openjdk 17 comme base image pour l'execution du projet
FROM adoptopenjdk

WORKDIR /simplified-blog

COPY --from=build /simplified-blog/target/comment-service.jar .

EXPOSE 8080

CMD [ "java", "-jar", "comment-service.jar"]
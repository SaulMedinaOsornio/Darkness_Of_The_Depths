FROM maven:3.9.8-eclipse-temurin-17-alpine

#RUN ["mkdir ./opt/app/", "chmod -R 777 ./opt/app/", "cd ./opt/app/"]

COPY . .

RUN mvn -DskipTests=true clean compile package

EXPOSE 9090

CMD java -jar ./target/darkness-of-the-depths-0.0.1-SNAPSHOT.jar
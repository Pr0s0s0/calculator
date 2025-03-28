FROM eclipse-temurin:17-jdk as builder
WORKDIR /app
COPY . .
RUN ./gradlew clean build

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
COPY static /static
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

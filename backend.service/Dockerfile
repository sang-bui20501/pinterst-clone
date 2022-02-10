FROM gradle:7.3.3-jdk11 as builder
USER root
WORKDIR /builder
ADD . /builder
RUN gradle build --stacktrace

FROM openjdk:11
WORKDIR /app
EXPOSE 8080
COPY --from=builder /builder/build/libs/backend.service.jar .
CMD ["java", "-jar", "backend.service.jar"]
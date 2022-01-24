FROM gradle:7.3.3-jdk8 as builder
USER root
WORKDIR /builder
ADD . /builder
RUN gradle build --stacktrace

FROM openjdk:8-alpine
WORKDIR /app
EXPOSE 8080
COPY --from=builder /builder/build/libs/backend.service.jar .
CMD ["java", "-jar", "backend.service.jar"]
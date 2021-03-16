FROM openjdk:15.0.2-slim AS TEMP_IMAGE
ENV APP_HOME=/usr/app/
WORKDIR ${APP_HOME}
COPY gradlew build.gradle settings.gradle ${APP_HOME}
COPY gradle ${APP_HOME}/gradle
COPY . .
RUN ./gradlew build

FROM openjdk:15.0.2-slim
ENV APP_HOME=/usr/app/
ENV ARTIFACT_NAME=TextAdv-0.0.1-SNAPSHOT.jar
WORKDIR ${APP_HOME}
COPY --from=TEMP_IMAGE $APP_HOME/build/libs/$ARTIFACT_NAME .
EXPOSE 8080
CMD ["sh", "-c", "java -jar $ARTIFACT_NAME"]

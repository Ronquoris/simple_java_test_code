FROM eclipse-temurin:latest
WORKDIR /app
COPY . /app
RUN javac Test.java
CMD [ "java", "Test" ]

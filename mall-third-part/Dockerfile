FROM java:8
EXPOSE 30000

VOLUME /tmp
ADD target/mall-third-part-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

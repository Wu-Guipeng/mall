FROM java:8
EXPOSE 10001

VOLUME /tmp
ADD target/mall-product-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

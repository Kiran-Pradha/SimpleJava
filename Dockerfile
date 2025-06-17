FROM eclipse-temurin:17
RUN apt-get update && apt-get install -y jetty9
WORKDIR /var/lib/jetty9/webapps/root
COPY . /var/lib/jetty9/webapps/root
CMD ["jetty9"]

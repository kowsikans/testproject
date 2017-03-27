FROM frolvlad/alpine-oraclejdk8:slim
RUN mkdir -p /opt/mbt/classes
RUN mkdir -p /opt/mbt/
RUN touch /opt/mbt/xmi.uml
VOLUME /opt/mbt/classes
ADD target/Customer-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar /opt/mbt/xmi.uml /opt/mbt/classes/"]
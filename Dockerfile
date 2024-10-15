FROM ubuntu:22.04
LABEL authors="ISEKAI"

#复制jar包，建库文件,配置好mysql的环境变量
WORKDIR /app/
COPY target/User-Service-0.0.1-SNAPSHOT.jar database.sql ./
ENV MYSQL_ALLOW_EMPTY_PASSWORD=true
#ENV MYSQL_ROOT_PASSWORD=114514
#安装mysql,java环境，建库
RUN apt-get update &&\
    apt-get install -y openjdk-17-jre mysql-server-8.0 &&\
    apt clean &&\
    rm -rf /var/lib/apt/lists/* &&\
    mysql -uroot -p -e"source database.sql"

EXPOSE 8080

CMD ["java","-jar","User-Service-0.0.1-SNAPSHOT.jar"]

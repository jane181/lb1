
FROM openjdk:1.8
WORKDIR /myapp/
COPY . /myapp/
COPY src/.* ./

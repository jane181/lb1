
FROM openjdk:15
WORKDIR /myapp/
COPY . /myapp/
COPY src/.* ./

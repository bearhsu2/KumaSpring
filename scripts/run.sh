docker rm -f kuma-spring-container
docker run --name kuma-spring-container -p 8080:8080 -d bearhsu2/kuma-spring:default

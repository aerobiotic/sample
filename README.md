# sample
Some sample code to talk about.
```
Stand it up. 
docker network create --driver bridge app_network
docker volume create serviceB_volume
docker build -f Dockerfile.serviceA .
docker build -f Dockerfile.serviceB .

docker run -d -name serviceA --network app_network -p 8080:3000 serviceA
docker run -d -name serviceB --network app_network --mount source= serviceB_volume,target=/data serviceB

Then tear down.
docker stop serviceA serviceB
docker rm serviceA serviceB
docker volume rm serviceB_volume
docker network rm app_network
```

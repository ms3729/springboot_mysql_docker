this is an example of a java Application with mysql Db  
in docker and separate container with docker-compose 

`
default JDK 1.8
`
# **How to run this example**
1) go to the root directory of project
1) run command `mvn clean package`
2) then run command `docker build -t api-docker-image .`
3) after that run command `docker-compose up`
4) in the end open Postman Application or any Other tools send a **post** request 
with request body like: <br/>
`{"name":"Apple","color":"Yellow"}` <br/> 
to this url `http://localhost:9091/fruits`   <br/> 
for call application save method

kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$ docker images
REPOSITORY                                   TAG               IMAGE ID       CREATED         SIZE
ubuntu                                       latest            72297848456d   12 days ago     117MB
dpage/pgadmin4                               8.2               3b480788bfd8   13 months ago   715MB
postgres                                     16.1-alpine3.19   17eb369d9330   13 months ago   348MB
quay.io/kiegroup/kogito-management-console   latest            2cd618f5cf80   17 months ago   537MB
quay.io/keycloak/keycloak                    legacy            710ffffce4a0   2 years ago     1.15GB
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$ docker run -d --name postgres -e POSTGRES_PASSWORD=kogito-pass -p 5432:5432 postgres:16.1-alpine3.19
2757c40599c7f69a786acfc0329319b6f80a46c497b4cba30f39297ffcd2052b
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$ docker ps
CONTAINER ID   IMAGE                      COMMAND                  CREATED          STATUS          PORTS                    NAMES
2757c40599c7   postgres:16.1-alpine3.19   "docker-entrypoint.s…"   35 seconds ago   Up 34 seconds   0.0.0.0:5432->5432/tcp   postgres
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$
//

https://hub.docker.com/r/apache/incubator-kie-kogito-data-index-postgresql

//
docker run -d --name postgres -e POSTGRES_PASSWORD=kogito-pass -p 5432:5432 postgres:16.1-alpine3.19
docker run -d --name pgadmin -e PGADMIN_DEFAULT_EMAIL=admin@admin.com -e PGADMIN_DEFAULT_PASSWORD=admin -p 8055:80 dpage/pgadmin4:8.2
docker run -d --name keycloak -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin -p 8480:8080 quay.io/keycloak/keycloak:legacy
docker run -d --name kogito-management-console -p 8280:8080 quay.io/kiegroup/kogito-management-console
///

psql -U postgres
\du
CREATE ROLE kogito-user WITH LOGIN PASSWORD 'kogito-pass';
CREATE DATABASE kogito OWNER kogito-user;
CREATE DATABASE kogito;
GRANT CONNECT ON DATABASE kogito TO "kogito-user";


//
root@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture# psql -h localhost -U kogito-user -d kogito
Password for user kogito-user:
psql (14.15 (Ubuntu 14.15-0ubuntu0.22.04.1), server 16.1)
WARNING: psql major version 14, server major version 16.
         Some psql features might not work.
Type "help" for help.

kogito=>
kogito=>
kogito=> exit
root@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture#

//
PS C:\udi\kie-tools\examples\process-compact-architecture> docker exec -it --user root pgadmin /bin/sh
/pgadmin4 #
/pgadmin4 #
/pgadmin4 # id
uid=0(root) gid=0(root) groups=0(root),1(bin),2(daemon),3(sys),4(adm),6(disk),10(wheel),11(floppy),20(dialout),26(tape),27(video)
/////


curl -H "Content-Type: application/json" -H "Accept: application/json" -X POST http://localhost:8080/hiring -d "{\"candidateData\": { \"name\": \"Jon\", \"lastName\": \"Snow\", \"email\": \"jon@snow.org\", \"experience\": 5, \"skills\": [\"Java\", \"Kogito\", \"Fencing\"]}}"


///

kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/process-compact-architecture/docker-compose$ docker run -d --name kogito-data-index \
  -p 8180:8180 \
  -e QUARKUS_PROFILE=postgres \
  -e KOGITO_DATA_INDEX_STORAGE=postgres \
  -e KOGITO_DATA_INDEX_POSTGRESQL_CLIENT_HOST=postgres \
  -e KOGITO_DATA_INDEX_POSTGRESQL_CLIENT_PORT=5432 \
  -e KOGITO_DATA_INDEX_POSTGRESQL_CLIENT_DATABASE=data-index \
  -e KOGITO_DATA_INDEX_POSTGRESQL_CLIENT_USER=postgres \
  -e KOGITO_DATA_INDEX_POSTGRESQL_CLIENT_PASSWORD=postgres \
  quay.io/kiegroup/kogito-data-index-ephemeral:latest
Unable to find image 'quay.io/kiegroup/kogito-data-index-ephemeral:latest' locally
latest: Pulling from kiegroup/kogito-data-index-ephemeral
a5744295d79f: Downloading [=================================================> ]  276.8MB/277.6MB


/// this cause the jar to get locked and comile fail- 
    <quarkus.package.type>uber-jar</quarkus.package.type>


//
psql -h postgres -U kogito-user -d kogito
pass: kogito-pass    

//
kudi@US-PF3TFL55:/mnt/c$ psql -h localhost -p 5432 -U postgres
Password for user postgres:(postgres)
psql (14.15 (Ubuntu 14.15-0ubuntu0.22.04.1), server 16.1)
WARNING: psql major version 14, server major version 16.
         Some psql features might not work.
Type "help" for help.

postgres=#
kogito=# DELETE FROM tasks;
DELETE 63
kogito=#
kogito=#


////
kudi@US-PF3TFL55:/mnt/c/udi/kie-tools/examples/rpb124/docker-compose$ ./startContainers.sh

////
kudi@US-PF3TFL55:/mnt/c/Users/kudi$ curl -H "Content-Type: application/json" -H "Accept: application/json" -X POST http://localhost:8080/reject -d '{"rejectInputData": { "name": "Jon", "lastName": "Snow", "email": "jon@snow.org", "experience": 5, "skills": ["Java", "Kogito", "Fencing"]}}'^C
kudi@US-PF3TFL55:/mnt/c/Users/kudi$

// kafka zookeeper
C:\udi\kafka\kafka_2.12-3.9.0>bin\windows\zookeeper-server-start-short.bat config\zookeeper.properties


// kafka server
C:\udi\kafka\kafka_2.12-3.9.0>bin\windows\kafka-server-start-short.bat config\server.properties

/// kafka producer
C:\udi\kafka\kafka_2.12-3.9.0>bin\windows\kafka-console-producer-short.bat --broker-list localhost:9092 --topic test-topic
>jon,snow,jon@snow.org,8,missing middle name

// kafka consumer
C:\udi\kafka\kafka_2.12-3.9.0>bin\windows\kafka-console-consumer-short.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning

// rpb124 compile
PS C:\udi\kie-tools\examples\rpb124> mvn clean  package -Pcontainer

// rpb124 start containers

// rpb124 postgres
kudi@US-PF3TFL55:/mnt/c$ psql -h localhost -p 5432 -U postgres
Password for user postgres:
psql (14.15 (Ubuntu 14.15-0ubuntu0.22.04.1), server 16.1)
WARNING: psql major version 14, server major version 16.
         Some psql features might not work.
Type "help" for help.

postgres=#
postgres=#
postgres=# SELECT * FROM task
postgres-# SELECT * FROM task;
ERROR:  syntax error at or near "SELECT"
LINE 2: SELECT * FROM task;
        ^
postgres=# history
postgres-# ^C
postgres=# SELECT * FROM task;
ERROR:  relation "task" does not exist
LINE 1: SELECT * FROM task;
                      ^
postgres=# \dt
Did not find any relations.
postgres=# SELECT table_schema, table_name
FROM information_schema.tables
WHERE table_name = 'task';
 table_schema | table_name
--------------+------------
(0 rows)

postgres=# SELECT current_database();
 current_database
------------------
 postgres
(1 row)

postgres=# SELECT datname FROM pg_database;
  datname
-----------
 template1
 template0
 postgres
 kogito
 keycloak
(5 rows)

postgres=# \c kogito
psql (14.15 (Ubuntu 14.15-0ubuntu0.22.04.1), server 16.1)
WARNING: psql major version 14, server major version 16.
         Some psql features might not work.
You are now connected to database "kogito" as user "postgres".
kogito=# \dt
kogito=# \dt
kogito=# SELECT * FROM tasks;
kogito=# SELECT * FROM tasks WHERE status = 'Obsolete';
ERROR:  column "status" does not exist
LINE 1: SELECT * FROM tasks WHERE status = 'Obsolete';
                                  ^
HINT:  Perhaps you meant to reference the column "tasks.state".
kogito=# SELECT * FROM tasks;
kogito=#
kogito=#
kogito=#
kogito=# DELETE * from tasks;
ERROR:  syntax error at or near "*"
LINE 1: DELETE * from tasks;
               ^
kogito=# DELETE FROM tasks;
DELETE 63
kogito=#
kogito=#
PS C:\>


/// rpb123 KAFKA-CAMUNDA VScode consumer
PS C:\udi\kafka\kafka-camuda> java -cp .\target\camunda-hello-world-1.0-SNAPSHOT-jar-with-dependencies.jar com.example.KafkaConsumerExample 


// docker
vi ~/.docker/config.json
change "credsStore": "desktop" to "credsStore": ""


//

C:\Users\kudi>echo Simplebuild1! | docker login -u maildover@gmail.com --password-stdin
Login Succeeded

C:\Users\kudi>

//
C:\Windows\System32>docker pull httpd:latest
latest: Pulling from library/httpd
80350326cd93: Download complete
c29f5b76f736: Download complete
4f4fb700ef54: Download complete
a1a1b409f475: Download complete
830a84f99cc8: Download complete
35b1ecb71608: Download complete
Digest: sha256:3195404327ecd95b2fa0a5d4eac1f2206bb12996fb2561393f91254759e422b9
Status: Downloaded newer image for httpd:latest
docker.io/library/httpd:latest


///
C:\Users\kudi>echo Simplebuild1! | docker login -u maildover@gmail.com --password-stdin
Login Succeeded

// these need to use the ip address of wsl = 
kogito.service.url=http://172.26.231.209:8080
kogito.jobs-service.url=http://172.26.231.209:8080
kogito.data-index.url=http://172.26.231.209:8080

#!/bin/sh
bash apache-tomcat-9/bin/startup.sh &
java -cp hsqldb-2.4.0/hsqldb/lib/hsqldb.jar org.hsqldb.Server &


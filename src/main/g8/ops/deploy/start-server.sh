#!/bin/sh

#nohup java -cp `find . -name micro-service.jar`:\$1 \${JAVA_OPTS} \$2 Stub &> micro-service.log &

nohup java -cp `find . -name micro-service.jar` ardlema.web.Stub &> micro-service.log &

echo \$! > api.pid

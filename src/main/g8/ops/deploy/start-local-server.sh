#!/bin/sh

echo "Loading properties from \$PWD/ops/properties"

ops/deploy/start-server.sh \$PWD/ops/properties/ -Denv=local

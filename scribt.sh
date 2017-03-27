#!/bin/bash

cd MySQL
sudo docker build -t custom-mysql .
cd ..

cd Customer
mvn clean install
sudo docker run -v $(pwd)/src/test/resources/money.uml:/opt/mbt/xmi.uml -v $(pwd)/src/test/java:/opt/mbt/classes mbt-core
sudo docker build -t customer .
sudo docker run -v $(pwd)/src/test/resources/deploy.uml:/opt/mbt/xmi.uml mbt-deploy
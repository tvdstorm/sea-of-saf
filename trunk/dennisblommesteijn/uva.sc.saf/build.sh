#!/bin/bash

mvn assembly:assembly install:install-file \
	-Dfile=target/uva.sc.saf-0.0.1-SNAPSHOT-jar-with-dependencies.jar \
	-DgroupId=com.blommesteijn \
	-DartifactId=uva.sc.saf \
	-Dversion=0.0.1-SNAPSHOT \
	-Dpackaging=jar


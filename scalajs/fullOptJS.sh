#!/usr/bin/env bash

baseDir=`git rev-parse --show-toplevel`

cd ${baseDir}
sbt web/fullOptJS
rm ${baseDir}/web/public/compiledJs/*.js
rm ${baseDir}/web/public/compiledJs/*.map
cp ${baseDir}/web/target/scala-2.11/web-opt.js ${baseDir}/web/public/compiledJs/bundle.js

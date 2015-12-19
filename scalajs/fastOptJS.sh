#!/usr/bin/env bash

baseDir=`git rev-parse --show-toplevel`

cd ${baseDir}
sbt web/fastOptJS
rm ${baseDir}/web/public/compiledJs/*.js
rm ${baseDir}/web/public/compiledJs/*.map
cp ${baseDir}/web/target/scala-2.11/web-fastopt.js ${baseDir}/web/public/compiledJs/bundle.js
cp ${baseDir}/web/target/scala-2.11/web-fastopt.js.map ${baseDir}/web/public/compiledJs/web-fastopt.js.map
# cp ${baseDir}/web/target/scala-2.11/web-jsdeps.js ${baseDir}/web/public/compiledJs/web-jsdeps.js

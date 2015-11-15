#!/bin/bash 
cf push stopwatch -o kyletravis/stopwatch -c "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" -u none

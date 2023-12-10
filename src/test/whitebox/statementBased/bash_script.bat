REM To run this file go to this location in terminal, Then type: chmod +x bash_script.sh. Then run it by: ./bash_script.sh
rm -rf ../../../../classes/

REM Please replace ';' with ':' incase of Linux and MacOS (Remove double quotes "" if required)
javac -d ../../../../classes -cp "../../../../jars;../../../../src;../../../../junit-platform-console-standalone-1.10.1.jar" -g ../../../../src/main/java/placementApplicationTracker/mainMenu/*.java ../../../../src/main/java/placementApplicationTracker/adminMenu/*.java ../../../../src/main/java/placementApplicationTracker/model/*.java ../../../../src/main/java/placementApplicationTracker/repo/intf/*.java ../../../../src/main/java/placementApplicationTracker/service/*.java ../../../../src/main/java/placementApplicationTracker/studentMenu/*.java ../../../../src/test/whitebox/statementBased/*.java
java -cp ../../../../classes -javaagent:../../../../jacoco-0.8.11/lib/jacocoagent.jar -jar ../../../../junit-platform-console-standalone-1.10.1.jar execute --class-path ../../../../classes --scan-class-path
java -jar ../../../../jacoco-0.8.11/lib/jacococli.jar report jacoco.exec --classfiles ../../../../classes --sourcefiles ../../../../src --html report

## Installer la dépendance algs4.jar

mvn --% install:install-file -Dfile="C:\ftoumHub\algorithms-4th-edition\lib\algs4.jar" -DgroupId=edu.princeton.cs -DartifactId=algs4 -Dversion=1.0.2 -Dpackaging=jar

## Constuire l'archive

mvn clean package

## S'assurer que la lib est bien intégré au jar final

jar tf target/algorithms-4th-edition-1.0-SNAPSHOT.jar | findstr algs4

## Exécuter une classe

java -cp .\target\algorithms-4th-edition-1.0-SNAPSHOT.jar _hello.Main 

java -cp .\target\algorithms-4th-edition-1.0-SNAPSHOT.jar chap01.sect01.Ex_1_1_01
...
java -cp .\target\algorithms-4th-edition-1.0-SNAPSHOT.jar chap01.sect01.Ex_1_1_05

## Exécuter la lib

cmd /c "java -jar target\algorithms-4th-edition-1.0-SNAPSHOT.jar algs4-data\tinyW.txt < algs4-data\tinyT.txt"
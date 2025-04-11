How to run
============
1. run command mvn package in directory with pom.xml file
2. run program by executing  java -jar target/flower_planter-1.0-SNAPSHOT.jar {garden_file} {flower_file}. For example,
java -jar target/flower_planter-1.0-SNAPSHOT.jar garden1.txt flowers1.txt 

Solution overview
============

Program is based on backtracking algorithm with running complexity of O(n!). This means its performance degrades exponentially
with the size of the garden grid, however, it will do well for the size of gardens provided in the examples. 
My main goal was to keep the program simple and clean given the time provided. 

If the performance of the algorithm was of the essence I would probably consider using genetic algorithms as they achieved much 
better performance (O(gnm) g - generation number, n population size, m - individual size) for a similar type of problems like
N Queen Problem. This approach, on the other hand, is not deterministic and doesn't guarantee to find a solution if one exists. 
Also, implantation of that approach would add unnecessary complexity given problem constraints. 

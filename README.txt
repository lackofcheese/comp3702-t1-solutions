Tutorial 1 solutions by Dimitri Klimenko (tutor).


(1) Commands and arguments.
The runnable files and their arguments are
    navigation.NavigationSolver [input-file]
    eight.EightPuzzleSolver [input-file]


(2) Loading into Eclipse.
To view and run the solutions, create a new Eclipse project,
and add the contents of the ZIP archive to the project.

Just run the solvers from Eclipse to see the solutions. 
Also, by editing those two classes, you can change which algorithm
is used to find the solution - also present are all of the
search algorithms mentioned in the lectures so far.


(3) Manual compilation and execution.
Alternatively, to compile and run the solutions without Eclipse,
download and install Apache Ant, and then run the command
    ant
from the main project folder.

Then the solvers can be run via the following commands:
    java -cp bin navigation.NavigationSolver navigation.in
    java -cp bin eight.EightPuzzleSolver eight.in

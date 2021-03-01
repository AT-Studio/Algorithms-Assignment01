# Algorithms-Assignment01

# Algorithms-Assignment02

### Execution
Open the project using IntelliJ IDEA and run the program by right-clicking on **Main.kt** 
inside of the **assignment02** package and selecting the option to **Run 'MainKt'**.

### Input Files
* Keys: Files containing the keys are named **{# of keys}.keys.text**
* Probabilities: Files containing the probabilities of input keys and dummy keys
are named **{# of keys}.keys.probabilities.text**
  
### Output Files
There is one output files named **time.text** which contains the time taken to
execute the *getRoots()* method inside of **OptimalBST.kt** for the different input key sizes.

### Structure
When the program runs it will call upon the **FileUtils.kt** in order to generate
the necessary input files if they do not already exist. The program will then run
3 trials to test execution time for the optimal BST algorithm for different input key sizes. 
The results of these trials are then stored inside of **time.txt**.

### Visualizing the optimal BST
A visualization of the optimal BST is possible using the *buildOptimalBST()* method
inside of **OptimalBST.kt**. The method will return a string that can be printed to
the console and is of the form: **parent(L:leftChild,R:rightChild)**

### Testing
To test the implementation one can execute *testImplementation()* inside of **Main.kt**.
This test runs the implementation against the example in **Lecture07-OptimalBinarySearchTree.pdf**
and prints the resulting structure of the optimal BST to the console in format specified in the previous section.
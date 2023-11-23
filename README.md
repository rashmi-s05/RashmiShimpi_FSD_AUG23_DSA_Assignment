DSA Project Group 4

THIS ASSIGNMENT COMPLIES OF TWO PROGRAMS NAMELY:

SKYSCRAPER
TRANSACTION_BST
The guidelines provided in problem statement and further details of both the programs are as follows:

SKYSCRAPER
This assignment demonstrates a program that will help to analyze the construction process and validate the given coditions of a skyscraper building, to avoid manual work and errors. Implemented using basic concepts of Data Structure and Algorithms(DSA).

This program is for A chief architect, who is working on building a skyscraper, in Mumbai. The construction is in such a way that the floors will be constructed in other factories and they will be assembled. All the sizes will be distinct.

The skyscraper needs to be constructed in N days with the following conditions :
a) Every day a floor is constructed in a separate factory of distinct size.
b) The floor with the larger size must be placed at the bottom of the building.
c) The floor with the smaller size must be placed at the top of the building.

Note: A floor cannot be assembled in the building until all floors larger in size are placed. Architect wants us to build a small program that will help him analyze the construction process, to avoid manual work and errors.

Additional Information
The following conditions are fulfilled as mentioned in assignment


1) Can use any inbuilt java function/s to implement the above functionalities

2) Can choose any DataStructure(Stack, Queue, LinkedList) to implement the above functionality.

The program initially takes number of DAYS as input from the operator then takes the size of the floors as input and saves it in an array, this helps to compare the size of floors on each day. If invalid size of the floor is enterred the operator will get a message of the same and can continue with correct size of floors,otherwise the program will dispalay the size of floors which can be assembled on respective day.

TRANSACTION_BST
This assignment demonstrates a program for a scenerio where I am working in an MNC, which manages the Transactions, where only BST is used as a Data Structure. The company stores all the data of transactions in BST such that the tree is always a complete BST.
A new business requirement has arrived where the BST should not contain any left node.
I am required to modify the existing BST and display the node values present in ascending order.

PROGRAM INFORMATION This program's package consist of two classes namely:
Transaction_BST
TransactionDriver

Here in Transaction_BST class we the Binary Search Tree is converted into into a Skewed Tree and the values are hard coded as given in problem statement. Whereas TransactionDriver class works as the driver class for the program.

Additional Information
Given values to hardcode given in problem statement are as follows:
Main tree = new Main();
tree.node = new Node(50);
tree.node.left = new Node(30);
tree.node.right = new Node(60);
tree.node.left.left = new Node(10);
tree.node.right.left= new Node(55);

And the desired output is as follows:
10 30 50 55 60

Technology
Java

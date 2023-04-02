Youtube : Dinesh Varyani Data Structure and Algorithms

# Interview
HashMap(Non Synchronized,Non Thread Safe,High Performance,Null Key and Null values allowed) 
vs 
HashTable(Synchronized,Thread Safe, Slow Performance,No Null key or Null value allowed)

HashMap(Non Synchronized,Non Thread Safe,High Performance,Null Key and Null values allowed)
vs
ConcurrentHashMap(Synchronized, Thread Safe, Slow Performance, No ConcurrentModificationException thrown)

ConcurrentHashMap(Synchronized, Thread Safe, Slow Performance, No ConcurrentModificationException thrown)
(No locking at object level but at bucket level)
vs
synchronized HashMap(each method(get put) is synchronized using object level lock)

# Data Structure
- Way to organize data into memory, process that data
## Types of Data Structures
1. Linear
2. Non-Linear

# Linear (Single Level)
List : Array, LinkedList, Stack, Queue
# Non_Linear (Multi Level)
Tree, Graph

# Algorithms
- Set of instructions to solve a problem
- Perform average of 3 numbers
public int getAverage(int a,int b, int c){
    int sum = a+b+c;
    int average = sum/3;
    return average;
}

# Algorithm Analysis
1. Time Complexity
2. Space Complexity
- Find sum of first n natural numbers
- return n(n+1)/2;
or
public int findSum(int n){
int sum = 0;
for(int i=1;i<=n;i++){
    sum += i;
} 
return sum;
}

# Asymptotic Analysis / Notation (find performance based on size)
Omega (lower bound / best case)
Theta (average bound / average case)
Big O (upper bound / worst case)

# Rules to find Big O notation for Time Complexity
- Each operation (return / arithmetic / logical / assignment) takes 1 unit of time
- Sequential execution
- Drop lower order terms
- Drop Constants

# Linear
1. Singly Linked List
2. Doubly Linked List
3. Circular Singly Linked List
4. One Dimensional Array
5. Stack
6. Queue

# Non-Linear
1. Binary Tree (InOrder, PreOrder, PostOrder) (Iterative vs Recursive)
2. Complete Binary Tree (All levels are filled except last level where left side is always filled)
3. Binary Search Tree
4. Matrix
5. Priority Queue (Min/Max element in constant time)
6. Binary Heap (Min Heap / Max Heap)
7. Graph

# Search
1. Linear Search
2. Binary Search

# Sorting
1. Bubble Sort
2. Insertion Sort
3. Selection Sort
4. Merge Sort
5. Quick Sort

# Algorithm
1. DFS (Iterative and Recursive)
2. BFS

# Algorithm
1. Dynamic Programming
2. Divide and Conquer
3. Backtracking
4. Branch and Bound
5. Hashing
6. Hash Table

# Hashing
- Linear Search (O(n)) and Binary Search (Array is sorted and Problem Space is divided into Half everytime (O(log(n)))
- Without Sorting do Searching : Array O(1)
- Use Array Index store value at same index
- Problem : Array size is Huge, Storage Space Wastage
- Hashing is done using "Hash Function" where an arbitrary size key is converted into a small fixed sized value / index
- store() retrieve() remove() in O(1) complexity

# Hash Function
**Map Large Key to Index**
index = h(key) = key % size = remainder
size = 10

# Hash Table O(1)
Array and each index is a linked list of nodes
put(key,value)
get(key)
remove(key)

Problem:
Collision
Solution:
Separate Chaining
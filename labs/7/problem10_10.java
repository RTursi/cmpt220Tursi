/* 
Joe Tursi
Dr Rivas
cmpt220tursi
lab 7 

Design a class named Queue for storing itnegers. Like a stack, a queue holds elements.
In a stack, the elements are retrieved in a last-in-first out fashion. In a queue, the elements are retrieved
in a first-in-first-out fashion. The class contains :
-an int[] data field named elements that stores the int values in the queue
- a data field named size that stores the numbers of elements in the queue
-a constructor that creates a queue object with default capcity 8
-the method enqueue(int v) that adds v into the queue.
-the method dequeue() that removes and returns the element from the queue
- the method empty() that returns true if the queue is empty
- the method getSize() that returns the size of the queue
Draw an UML diagram for the class. Implement the class with the inital array size set to 8.
The array size will doubled once the number of the lements exceeds the size.
After an element is removed from the beginning of the array, you need to shift all elements in the array
one position to the left. Write a test program that adds 20 numbers from 1 to 20 and queue and removes these numbers 
and displays them.
*/ public class problem10_10 {
	/** Main method */
	public static void main(String[] args){
		// Create a Queue object
		Queue queue = new Queue();

		// Adds 20 numbers from 1 to 20 into the queue
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		// Removes these numbers and displays them
		while (!queue.empty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
	}
}

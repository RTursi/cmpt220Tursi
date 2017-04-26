/* Joe Tursi
Dr rivas
cmpt220
lab 7 
*/

public class Queue {	
private int[] elements;
private int size;
public static final int DEFAULT_CAPACITY = 8;
  Queue() {
  elements = new int[DEFAULT_CAPACITY];
}
/** Adds v into the queue */
public void enqueue(int a) {
if (size >= elements.length) {
  int[] temp = new int[elements.length * 2];
  System.arraycopy(elements, 0, temp, 0, elements.length);
  elements = temp;
}
  elements[size++] = a;
}
public int dequeue() {
  int a = elements[0];
  int[] temp = new int[elements.length];
  System.arraycopy(elements, 1, temp, 0, size);
  elements = temp;
  size--;
  return a;
}
public boolean empty(){
  return size == 0;
}
public int getSize(){
 return size;
	}

}
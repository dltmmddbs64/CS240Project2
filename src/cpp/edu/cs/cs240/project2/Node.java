/**
 * Cs240: Data Structures and Algorithms I
 * Instructor: Dr. Fan Tang
 * 
 * Programming Project #2
 * 
 * This project is about implementing Set ADT using nodes. 
 * It it based on a singly linked list. The program has characteristics of sets
 * such as subsets, equal sets, intersections, unions, and complements. Just like sets,
 * orders do not matter, no duplicates, and an empty set is a subset of every set. 
 * 
 * Seungyun Lee
 */
package cpp.edu.cs.cs240.project2;

/**
 * This class represents Node. It has an object and reference to the next node.
 * 
 * @author Seungyun
 *
 */
public class Node {

	/**
	 * This field represents an objects, an element of a node.
	 */
	private Object object;

	/**
	 * This field represents a next node(reference).
	 */
	private Node next;

	/**
	 * This constructor lets the user to create a node.
	 * 
	 * @param o
	 *            current object
	 * @param n
	 *            an element of next node
	 */
	public Node(Object o, Node n) {
		object = o;
		next = n;
	}

	/**
	 * This method returns the value of the current node.
	 * 
	 * @return current object(element)
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * This method returns the value of the next node.
	 * 
	 * @return object (element) of next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * This method sets a value of a node.
	 * 
	 * @param newObj
	 *            a new value of a node
	 */
	public void setObject(Object newObj) {
		object = newObj;
	}

	/**
	 * This method sets a next reference of a node.
	 * 
	 * @param newNext
	 *            a new value of next node
	 */
	public void setNext(Node newNext) {
		next = newNext;
	}

}

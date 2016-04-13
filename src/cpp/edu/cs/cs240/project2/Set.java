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
 * This class represents Set ADT. It has all the necessary methods and fields.
 * 
 * @author Seungyun
 *
 */
public class Set {

	/**
	 * This field represents the head node.
	 */
	private Node head;

	/**
	 * This field represents the size of a set. It does not include the dummy
	 * head.
	 */
	private int size;

	/**
	 * This constructor creates a set. It has a dummy head. It starts with size
	 * 0.
	 */
	public Set() {

		head = new Node(null, null);
		size = 0;
	}

	public Node headNode() {

		Node cur = head;

		return cur;
	}

	/**
	 * This method returns a node right after the dumy head.
	 * 
	 * @return next node
	 */
	public Node nextNode() {

		Node cur = head.getNext();

		return cur;

	}

	/**
	 * This method returns a boolean value. It checks if the given object input
	 * is in the set.
	 * 
	 * @param input
	 *            the value that wants to be tested
	 * @return either true or false; true, if the given object is in the set;
	 *         otherwise, false.
	 */
	public boolean contain(Object input) {

		boolean check = false;

		Node cur = head.getNext();

		// goes the set until it finds the same object or reaches the tail
		while (cur.getNext() != null & cur.getObject() != input) {

			cur = cur.getNext();

		}

		if (cur.getObject() == input) {

			check = true;

		}

		return check;
	}

	/**
	 * This method removes an element. However, the element has to be in the
	 * set. It returns true if the element is successfully removed; otherwise,
	 * false.
	 * 
	 * @param input
	 *            the value of an object to be deleted
	 * @return true or false. true, if the element is removed; otherwise, false.
	 */
	public boolean remove(Object input) {

		boolean check = false;

		Node prev = head;
		Node cur = head;

		while (cur.getNext() != null & cur.getObject() != input) {

			prev = cur;
			cur = cur.getNext();

		}

		if (cur.getObject() == input) {
			prev.setNext(cur.getNext());
			cur.setNext(null);
			--size;
			check = true;
		}

		return check;

	}

	/**
	 * This method adds an element to a set. It returns true, if it's
	 * successfully added; otherwise. false. However, no duplicates is allowed.
	 * 
	 * @param input
	 *            the value of an object to be added
	 * @return true or false
	 */
	public boolean addElement(Object input) {

		boolean check = false;

		Node cur = head.getNext();

		if (size == 0) {

			Node newNode = new Node(input, head.getNext());
			head.setNext(newNode);
			check = true;

			++size;

		} else if (size > 0) {

			while (cur.getNext() != null & cur.getObject() != input) {
				cur = cur.getNext();
			}
			if (cur.getObject() != input) {
				Node newNode = new Node(input, head.getNext());
				head.setNext(newNode);
				check = true;

				++size;

			}

		}

		return check;
	}

	/**
	 * This method returns the size of a set.
	 * 
	 * @return size of a set
	 */
	public int getSize() {
		return size;
	}

	/**
	 * This method checks if a set is a subset of the other set. For an example,
	 * A.subset(B), it's checking if A is subset of B, meaning if every element
	 * of A is in B. It returns true if it is a subset; otherwise, false.
	 * 
	 * @param B
	 *            set to check if it has all the elements of A
	 * @return true of false
	 */
	public boolean subsetOf(Set B) {

		boolean check = false;
		boolean isEqual = true;
		Node curA = head;

		if (size > 0 & B.getSize() > 0) {

			do {

				curA = curA.getNext();
				// checks if elements of A are in B
				if (!B.contain(curA.getObject())) {
					isEqual = false;

				} else {

					check = true;

				}

			} while (isEqual & curA.getNext() != null);

		} else if (size == 0) {

			check = true;

		}

		return check;

	}

	/**
	 * This method checks if two sets are equal. The order does not matter. If
	 * they are equal, it returns true; otherwise, fakse.
	 * 
	 * @param B
	 *            set to be tested
	 * @return true or false
	 */
	public boolean isEqual(Set B) {

		boolean check = false;
		boolean isEqual = true;
		Node curA = head;
		Node curB = B.headNode();

		if (size > 0 & B.getSize() > 0) {

			do {

				curA = curA.getNext();
				// checks if elements of A are in B
				if (!B.contain(curA.getObject())) {

					isEqual = false;
					check = false;

				} else {

					check = true;

				}

				curB = curB.getNext();
				// checks if elements of B are in A
				if (!contain(curB.getObject())) {

					isEqual = false;
					check = false;

				} else {

					check = true;

				}

			} while (isEqual & curA.getNext() != null & curB.getNext() != null);

		}

		return check;

	}

	/**
	 * This method returns a new set which contains every elements of two sets,
	 * but no duplicates.
	 * 
	 * @param B
	 *            set which its elements will be added
	 * @return a new set
	 */
	public Set union(Set B) {

		Set C = new Set();

		Node curA = head;

		// reuses addElement method to add elements
		while (curA.getNext() != null) {

			curA = curA.getNext();
			C.addElement(curA.getObject());

		}

		Node curB = B.headNode();

		// reuses addElement method to add elements
		while (curB.getNext() != null) {

			curB = curB.getNext();
			C.addElement(curB.getObject());

		}

		return C;

	}

	/**
	 * This method returns a new set which contains elements that are shared by
	 * two sets.
	 * 
	 * @param B
	 *            set that will be tested
	 * @return a new set
	 */
	public Set intersection(Set B) {

		Set C = new Set();

		Node curA = head;
		Node curB = B.headNode();

		while (curA.getNext() != null) {

			curA = curA.getNext();

			while (curB.getNext() != null) {

				curB = curB.getNext();

				// adds elements of B only if they are also in A
				if (contain(curB.getObject())) {

					C.addElement(curB.getObject());

				}

			}

		}

		return C;

	}

	/**
	 * This method returns a new set that has elements of A that are not in B.
	 * 
	 * @param B
	 *            set that will be tested
	 * @return a new set
	 */
	public Set complement(Set B) {

		Set C = new Set();
		Node curA = head;

		if (size > 0) {
			while (curA.getNext() != null) {

				curA = curA.getNext();

				if (B.getSize() == 0) {
					
					C.addElement(curA.getObject());
					
				}
				
				// adds elements of A if they are not in B
				else if (!B.contain(curA.getObject())) {

					C.addElement(curA.getObject());

				}

			}
		}

		return C;

	}

	/**
	 * This method prints out elements of a set.
	 */
	public void printString() {

		Node cur = head.getNext();

		while (cur != null) {

			System.out.print(" " + cur.getObject());
			cur = cur.getNext();

		}

		System.out.println(".");

	}

}

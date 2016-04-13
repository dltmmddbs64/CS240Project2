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
 * This class has the main method that will execute the program.
 * 
 * @author Seungyun
 *
 */
public class project2 {

	/**
	 * This maind method runs the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Set A = new Set();
		System.out.println("Add 1: " + A.addElement(1));
		System.out.println("Add 2: " + A.addElement(2));
		System.out.println("Add 3: " + A.addElement(3));
		System.out.println("Add 7: " + A.addElement(7));
		System.out.println("Remove 7: " + A.remove(7));
		System.out.print("Set A: "); 
		A.printString();
		System.out.println("The size of A: " + A.getSize() + ".");
		
		Set B = new Set();
		System.out.println("Add 3: " + B.addElement(3));
		System.out.println("Add 2: " + B.addElement(2));
		System.out.println("Add 1: " + B.addElement(1));
		System.out.println("Add 2: " + B.addElement(2));
		System.out.println("Remove 7: " + B.remove(7));
		System.out.print("Set B: "); 
		B.printString();
		System.out.println("The size of B: " + B.getSize() + ".");
		
		Set C = new Set();
		System.out.println("Add 2: " + C.addElement(2));
		System.out.println("Add 3: " + C.addElement(3));
		System.out.println("Add 4: " + C.addElement(4));
		System.out.println("Add 5: " + C.addElement(5));
		System.out.print("Set C: "); 
		C.printString();
		System.out.println("The size of C: " + C.getSize() + ".");
		
		Set D = new Set();
		System.out.println("Add 1: " + D.addElement(1));
		System.out.print("Set D: "); 
		D.printString();
		System.out.println("The size of D: " + D.getSize() + ".");
		
		Set E = new Set();
		System.out.println("Add 2: " + E.addElement(2));
		System.out.println("Add 3: " + E.addElement(3));
		System.out.println("Contain 3: " + E.contain(3));
		System.out.println("Contain 8: " + E.contain(8));
		System.out.print("Set E: "); 
		E.printString();
		System.out.println("The size of E: " + E.getSize() + ".");
		
		Set F = new Set();
		System.out.println("Add 1: " + F.addElement(1));
		System.out.println("Add 2: " + F.addElement(2));
		System.out.print("Set F: "); 
		F.printString();
		System.out.println("The size of F: " + F.getSize() + ".");
		
		Set G = new Set();
		System.out.print("Set G: "); 
		G.printString();
		System.out.println("The size of G: " + G.getSize() + ".");
		
		System.out.println("Subset Testing");
		System.out.println("Is A a subset of B? " + A.subsetOf(B));
		System.out.println("Is D a subset of F? " +D.subsetOf(F));
		System.out.println("Is B a subset of C? " +B.subsetOf(C));
		System.out.println("Is D a subset of E? " +D.subsetOf(E));
		System.out.println("Is C a subset of G? " +C.subsetOf(G));
		System.out.println("Is G a subset of C? " +G.subsetOf(C));
		
		System.out.println("Equal Testing");
		System.out.println("Is A equal to B? " + A.isEqual(B));
		System.out.println("Is D equal to F? " +D.isEqual(F));
		System.out.println("Is B equal to C? " +B.isEqual(C));
		System.out.println("Is D equal to E? " +D.isEqual(E));
		System.out.println("Is C equal to G? " +C.isEqual(G));
		System.out.println("Is G equal to C? " +G.isEqual(C));
		
		System.out.println("Union Testing");
		System.out.print("A union B: ");
		A.union(B).printString();
		System.out.print("D union F: ");
		D.union(F).printString();
		System.out.print("B union C: ");
		B.union(C).printString();
		System.out.print("D union E: ");
		D.union(E).printString();
		System.out.print("C union G: ");
		C.union(G).printString();
		System.out.print("G union C: ");
		G.union(C).printString();
		
		System.out.println("Intersection Testing");
		System.out.print("A intersection B: ");
		A.intersection(B).printString();
		System.out.print("D intersection F: ");
		D.intersection(F).printString();
		System.out.print("B intersection C: ");
		B.intersection(C).printString();
		System.out.print("D intersection E: ");
		D.intersection(E).printString();
		System.out.print("C intersection G: ");
		C.intersection(G).printString();
		System.out.print("G intersection C: ");
		G.intersection(C).printString();
		
		System.out.println("Complement Testing");
		System.out.print("A complement B: ");
		A.complement(B).printString();
		System.out.print("D complement F: ");
		D.complement(F).printString();
		System.out.print("B complement C: ");
		B.complement(C).printString();
		System.out.print("D complement E: ");
		D.complement(E).printString();
		System.out.print("C complement G: ");
		C.complement(G).printString();
		System.out.print("G complement C: ");
		G.complement(C).printString();
		
	}

}

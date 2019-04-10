import java.util.*;
// Java program to find middle element of linked list 
public class LinkedList 
{ 
	Node head; // head of linked list 

	/* Linked list node */
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to print middle element of linked list */
	void middle() 
	{ 
		Node slow = head; 
		Node fast = head; 
		if (head != null) 
		{ 
			while (fast!= null && fast.next != null) 
			{ 
				fast = fast.next.next; 
				slow = slow.next; 
			} 
			System.out.println("The middle element is  "+slow.data ); 
		} 
	} 

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+"->"); 
			tnode = tnode.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String [] args) 
	{ 
        Scanner sc= new Scanner (System.in);
		LinkedList llist = new LinkedList(); 
        int n= sc.nextInt();//number of nodes
		while(n--!=0 ) 
		{ 
			llist.push(sc.nextInt()); 
			
		} 
      llist.printList(); 
	  llist.middle(); 
	} 
} 
 
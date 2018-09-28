//  Anders Lykkehoy
//  10/20/2018
//  CMPT 435

public class LinkedList {
	// The LinkedList Node class
	private class Node{

		int data;
		Node next;

		Node(int gdata)
		{
			this.data = gdata;
			this.next = null;
		}

	}

	// The LinkedList fields
	Node head;

	// Constructor
	LinkedList(int gdata)
	{
		this.head = new Node(gdata);
	}

	public void Insertend(int gdata)
	{
		Node current = this.head;

		while(current.next!= null)
		{
			current = current.next;
		}

		Node newnode = new Node(gdata);
		current.next = newnode;

	}

	public void Listprint()
	{
		Node current = this.head;

		while(current!= null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();

	}

	public void Removemin() {
		// Complete this method to remove the minimum value in a linkedlist
		Node current = this.head;
		int min = current.data;
		while(current.next != null){
			if(min > current.data){
				min = current.data;
			}
			current = current.next;
		}

		Node prev = this.head;
		current = this.head;
		// first check if the node containing min is the head of the linked list
		if (current.data == min){
			this.head = current.next;
		}
		//continue through the list till you find the node containing the min
		while(current.next != null){
			if(current.data == min){
				prev.next = current.next;
			}
			prev = current;
			current = current.next;
		}
	}

	public static void main(String[] args) {

		LinkedList exlist = new LinkedList(0);

		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);

		exlist.Listprint();
		//output: 0 1 5 2 7 10 3

		exlist.Removemin();

		exlist.Listprint();
		//output should be: 0 1 5 2 7 3

	}
}

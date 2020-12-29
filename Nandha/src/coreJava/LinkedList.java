package coreJava;
/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class LinkedList {
	Node head;

class Node {
	int data;
	Node next;

	Node (int d) {
	data = d ;
	}

}

public static LinkedList insert (LinkedList list, int data){
	Node new_node = list.new Node(data);
	if (list.head==null){
		list.head = new_node;
	} else {
		Node last = list.head;
		while(last.next==null){
			last = new_node;
			
		}
	}
	return list;
	}
public static void printList(LinkedList list){
	Node currNode = list.head;
	System.out.println("LinkedList: ");
	while(currNode!=null){
	System.out.println(currNode.data);
	currNode = currNode.next;
	}

   }

public static void main(String[] args){
	LinkedList list = new LinkedList();
	list = insert(list,12);
	list =insert(list,20);
	list =insert(list,25);
	printList(list);
}
}


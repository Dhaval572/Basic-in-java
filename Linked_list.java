class Node
{
	int data;
	Node next;

	public static void traversalList(Node currNode)
	{
		System.out.print("Elements of linked list: ");
		while(currNode != null)
		{
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
	}
}

public class Linked_list
{
	public static void main(String args[])
	{
		Node head = new Node();
		Node second = new Node();
		Node third = new Node();
		Node fourth = new Node();

		head.data = 10;
		head.next = second;

		second.data = 20;
		second.next = third;

		third.data = 30;
		third.next = fourth;

		fourth.data = 40;
		fourth.next = null;

		Node.traversalList(head);
	}
}
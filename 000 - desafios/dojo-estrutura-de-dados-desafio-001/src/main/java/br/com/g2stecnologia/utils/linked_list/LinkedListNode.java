package br.com.g2stecnologia.utils.linked_list;

public class LinkedListNode<T> {

	protected T data;
	protected LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}

	public LinkedListNode(T data, LinkedListNode<T> nextNode) {
		this.data = data;
		this.next = nextNode;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public T getData() {
		return data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}
	
}

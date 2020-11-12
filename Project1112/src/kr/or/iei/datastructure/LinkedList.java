package kr.or.iei.datastructure;

public class LinkedList<T> implements List<T> {

	private Node<T> head;

	@Override
	public int size() {
		// 1. head가 없는 경우
		if (head == null) {
			return 0;
		}
		// 2. head가 있는 경우
		int size = 0;
		Node<T> pointer = head;
		while (pointer != null) {
			pointer = pointer.getNext();
			size++;
		}

		//        do {
		//        	size++;
		//        	pointer = pointer.getNext();
		//        } while (pointer != null);
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public T get(int index) {
		// 1. head가 없는 경우
		if (head == null) {
			return null;
		}
		// 2. head가 있는 경우
		int idx = 0;
		Node<T> pointer = head;
		while (pointer != null && idx != index) {
			pointer = pointer.getNext();
			idx++;
		}
		return pointer.data;
	}

	@Override
	public boolean contains(T element) {
		return false;
	}

	@Override
	public boolean add(T element) {
		final Node<T> newNode = new Node<>(element, null);
		// 1. head가 없는 경우
		if (head == null) {
			head = newNode;
			return true;
		}

		// 2. head가 있는 경우
		Node<T> pointer = head;
		while (pointer.getNext() != null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(newNode);
		return true;
	}

	@Override
	public boolean remove(T element) {
		return false;
	}

	@Override
	public void clear() {
		head = null;
	}

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
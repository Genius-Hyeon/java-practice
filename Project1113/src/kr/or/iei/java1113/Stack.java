package kr.or.iei.java1113;

public interface Stack<T> {
	
	/*
	 * @param value 값을 넣는다 
	 * */
	
	void push(T value);
	
	/*
	 * @return 꼭대기에 있는 값을 꺼낸다 
	 * */
	
	T pop();
	
	/*
	 * @return 비어 있으면 true
	 * */
	
	boolean isEmpty();
	
}

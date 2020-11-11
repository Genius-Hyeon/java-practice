package kr.or.iei.Generic;
//2. 제네릭 - 클래스, 인터페이스
//class 클래스이름<T> {
//}

//	interface 인터페이스이름<T>{	
//	}

//	3. 제네릭 - 메서드
//	<T1, T2, ..., TN> 반환타입 메소드이름(P1, P2, ..., PN);

//	4. type 제한

public interface GenericTest<P extends RandomType> {
	void method(); 
	
}

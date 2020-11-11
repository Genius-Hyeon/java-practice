package kr.or.iei.Generic;

import java.util.ArrayList;
import java.util.List;
//제네릭 쓰는 이유
//1. 타입 안정성
//1.1. 타입 안정성 X
public class Application01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("String");
		list.add(123);
		
		for (Object o: list) {
			System.out.println(o);
		}
	}
}

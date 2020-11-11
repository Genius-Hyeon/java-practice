package kr.or.iei.Generic;

import java.util.ArrayList;
import java.util.List;
//제네릭 쓰는 이유
//1. 타입 안정성
//1.1. 타입 캐스팅 필요 없음
//1.2. 강한 타입 체크
//2. 매개변수화 타입(Parameterized Type)
public class Application02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("String");
		list.add("test01");
		
		for (Object o: list) {
			System.out.println(o);
		}
	}
}

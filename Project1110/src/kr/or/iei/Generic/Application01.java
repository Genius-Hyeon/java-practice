package kr.or.iei.Generic;

import java.util.ArrayList;
import java.util.List;
//���׸� ���� ����
//1. Ÿ�� ������
//1.1. Ÿ�� ������ X
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

package kr.or.iei.Generic;

import java.util.ArrayList;
import java.util.List;
//���׸� ���� ����
//1. Ÿ�� ������
//1.1. Ÿ�� ĳ���� �ʿ� ����
//1.2. ���� Ÿ�� üũ
//2. �Ű�����ȭ Ÿ��(Parameterized Type)
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

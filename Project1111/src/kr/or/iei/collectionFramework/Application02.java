package kr.or.iei.collectionFramework;

import java.util.ArrayList;
import java.util.List;
//List
//�߸� ���, �ε����� ����
public class Application02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("��");
		list.add("���");
			
		for(String s : list) {
			System.out.println(s);
		}
		//�ε����� �����Ͽ� get
		System.out.println("==============");
		System.out.println(list.get(0));
		System.out.println(list.contains("����"));
	}
}

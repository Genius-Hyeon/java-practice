package kr.or.iei.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Application02 {

    public static void main(String[] args) {
        final List<String> list = List.of("����", "�ٳ���", "���", "�ƺ�ī��", "������");

        final List<String> filteredList =
                list.stream()   // 1. ��Ʈ�� ����
                        .filter(s -> s.length() <= 2)   // 2. ���� �ܰ�
                        .collect(Collectors.toList());  // 3. ���� �ܰ�

        for (String s : filteredList) {
            System.out.println(s);
        }

    }
}

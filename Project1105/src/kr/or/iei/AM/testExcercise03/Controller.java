package kr.or.iei.AM.testExcercise03;

public class Controller {
    public static void main(String[] args) {
        Dao dao = new Dao();
        Memo m = new Memo();
        m.setNo(101);
        m.setName("ȫ�浿");
        m.setMsg("ȯ���մϴ�");
        int result = dao.update(m);
        if (result < 1) { 
        	//if (result > 0)
        	//��� �κ� ���� ����
            System.out.println("���� ����");
        } else {
            System.out.println("���� ����");
        }
    }
}
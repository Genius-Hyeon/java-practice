package classPM;

// Ż�� �������̽�
interface iVehicle2
{
    void vShow();
}
// ���� �������̽�
interface iMaterial2
{
    void mShow();
}
// �ڵ��� Ŭ����
class Car2 implements iVehicle2, iMaterial2
{
    private int num;
    private double gas;
    
    public Car2(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " �̸�, ���� ���� " + gas + " �� �ڵ����� ����������ϴ�.");
    }
    public void vShow()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
    public void mShow()
    {
        System.out.println("�ڵ����� ������ ö�Դϴ�.");
    }
}
class Sample4
{
    public static void main(String[] args)
    {
    	Car2[] c2 = new Car2[2];
    	c2[0] = new Car2(1234, 20.5);
    	c2[1] = new Car2(123, 10.5);
    	
    	for (int i=0; i<c2.length; i++) {
    		c2[i].vShow();
    		c2[i].mShow();
    	}
    }
}

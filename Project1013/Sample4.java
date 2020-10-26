package classPM;

// 탈것 인터페이스
interface iVehicle2
{
    void vShow();
}
// 목재 인터페이스
interface iMaterial2
{
    void mShow();
}
// 자동차 클래스
class Car2 implements iVehicle2, iMaterial2
{
    private int num;
    private double gas;
    
    public Car2(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("차량 번호가 " + num + " 이며, 연료 양이 " + gas + " 인 자동차가 만들어졌습니다.");
    }
    public void vShow()
    {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("연료 양은 " + gas + " 입니다.");
    }
    public void mShow()
    {
        System.out.println("자동차의 재질은 철입니다.");
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

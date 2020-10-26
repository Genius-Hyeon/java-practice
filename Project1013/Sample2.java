package classPM;

class Sample2 {
    public static void main(String[] args)
    {
        Vehicle[] vc;
        vc = new Vehicle[2];
        
        vc[0] = new Car(1234, 20.5);
        vc[1] = new Plane(232);
    }
}

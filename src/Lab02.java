public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("Xiaomi","Pro",new double[]{300,300,689},"red");
        AirPurifier b = new AirPurifier();
        System.out.println(a.brand);
        a.turnOn();
        System.out.println(a.power);
        System.out.println(a.dust);
        System.out.println(a.mode);
        a.setMode(5);
        System.out.println(a.mode);
        a.connectBT(true);
        System.out.println(a.bluetooth);
        a.turnOff();
        System.out.println(a.mode);
        System.out.println(a.dust);
        System.out.println(a.bluetooth);
    }
}
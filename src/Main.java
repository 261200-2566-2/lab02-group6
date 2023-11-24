public class Main {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("Xiaomi","Pro",new double[]{300,300,689},"red");
        System.out.println(a.brand + " " + a.model + " " + a.dimension[0] + "x" + a.dimension[1] + " x "+ a.dimension[2] + " " + a.color);
        AirPurifier b = new AirPurifier();
        System.out.println(b.brand + " " + b.model + " " + b.dimension[0] + " x " + b.dimension[1] + " x " + b.dimension[2] + " " + b.color);
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
        System.out.println(AirPurifier.getTotalCount());
        String[] list = AirPurifier.getAirPurifierList();
        for(int i = 0; i < AirPurifier.getTotalCount(); i++){
            System.out.println((i+1) + ". " + list[i]);
        }

    }
}
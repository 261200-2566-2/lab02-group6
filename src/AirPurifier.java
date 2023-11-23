public class AirPurifier {
    private String model;
    private double powerCon;
    private final String color;
    private double price;
    private double[] dimension;
    private boolean power = false;
    private boolean bluetooth = false;
    private boolean availability = true;
    public AirPurifier(double price, String color){ // รับ offered price, สี
        this.color = color;
        if(price < 1000){ // ถ้าเสนอราคาต่ำกว่า 1000 ถือว่า AirPurifier นั้นไม่สมบูรณ์ (ดู spec, เรียกใช้ method ต่าง ๆ ไม่ได้)
            availability = false;
        }else if(price < 3000){
            this.model = "Model A";
            this.price = 1000;
            this.dimension = new double[]{240,240,533.5};
            this.powerCon = 0.8;
        }else if(price < 5000){
            this.model = "Model B";
            this.price = 3000;
            this.dimension = new double[]{250,250,555};
            this.powerCon = 1;
        }else{
            this.model = "Model C";
            this.price = 5000;
            this.dimension = new double[]{275,275,680};
            this.powerCon = 1.2;
        }
    }

    public void turnOn() {
        if(availability){
            power = true;
            System.out.println("Your air purifier is turned on.");
        } else System.out.println("The method is unavailable.");
    }

    public void turnOff() {
        if(availability){
            power = false;
            System.out.println("Your air purifier is turned off.");
        }else  System.out.println("The method is unavailable.");
    }

    public void connectBT() {
        if(availability){
            bluetooth = true;
            System.out.println("The Bluetooth is connected.");
        }else  System.out.println("The method is unavailable.");
    }

    public void disconnectBT() {
        if(availability){
            bluetooth = false;
            System.out.println("The Bluetooth is disconnected.");
        }else  System.out.println("The method is unavailable.");
    }

    public void showInfo() {
        if(availability){
            System.out.println("Model: " + model);
            System.out.println("Price: " + price + "Baht");
            System.out.println("Color: " + color);
            System.out.println("Dimension: " + dimension[0] + " x " + dimension[1] + " x " + dimension[2] + " mm");
            System.out.println("Power Consumption: " + powerCon + " kWh");
        }else System.out.println("The air purifier is unavailable.");
    }
}

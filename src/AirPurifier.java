// 1.
// 1.1) instance variables: brand, model, color, dimension, power, bluetooth, dust, mode
// 1.2) instance methods: turnOn, turnOff, setMode, connectBT
// 1.3) class variables: count, brand...Count, model...Count ,color...Count,
// 1.4) class methods: getAmountOfAP, popModel, popColor, popBrand

// 2.
// 2.1) instance methods
// - turnOn, turnOff: ไม่มี input ไม่ return ค่า
// - setMode: รับ int ไม่ return ค่า
// - connectBt: รับ boolean ไม่ return ค่า
// 2.2) class methods
// - getAmountOfAP: ไม่มี input return int
// - popModel, popColor, popBrand: รับ String return String

// 3.
public class AirPurifier {
    String brand;
    String model;
    String color;
    double[] dimension;
    boolean power = false;
    boolean bluetooth = false;
    int dust;
    int mode;

    public AirPurifier(String brand, String model, double[] dimension,String color){
        this.brand = brand;
        this.model = model;
        this.dimension = dimension;
        this.color = color;
    }

    public AirPurifier(){
        this("Xiaomi", "4 Lite", new double[]{250,250,540},"white");
    }

    public void turnOn(){
        power = true;
        mode = 1;
        int min = 0, max = 100;
        dust = (int) (Math.random()*(max-min+1)+min);
    }

    public void turnOff(){
        power = false;
        mode = 0;
        dust = 0;
        bluetooth = false;
    }

    public void setMode(int fs) {
        if (fs <= 1) mode = 1;
        else if (fs >= 5) mode = 5;
        else mode = fs;
    }

    public void connectBT(boolean b){
        bluetooth = b;
    }
}

package tuan06;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setcarColor("xanh");
        System.out.println("màu " + car.getcarColor());
        System.out.println("giá " + car.getcarPrice());
    }
    
}

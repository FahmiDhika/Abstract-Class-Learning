package AbstractClass;

public class Demo {
    public static void main(String[] args) {
        Triangle seg = new Triangle(10,20);
        Circle ling = new Circle(20);
        
        System.out.println("Luas Segitiga : " + seg.getArea());
        System.out.println("Luas Lingkaran : " + ling.getArea());
    }
}

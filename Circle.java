package AbstractClass;

public class Circle extends Shape{
    
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    
    
    @Override
    double getArea() {
        return (float) (Math.PI * radius * radius);
    }
}

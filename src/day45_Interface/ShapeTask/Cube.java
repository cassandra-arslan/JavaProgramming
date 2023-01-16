package day45_Interface.ShapeTask;

public class Cube extends Shape implements Volume{
    public Cube(String name) {
        super(name);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
        "volume" + volume() + '\'' +
                '}';
    }

}

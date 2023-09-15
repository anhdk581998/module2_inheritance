public class Circle {
    private String name;
    private double R;
    private String color;

    public Circle(String name, double r, String color) {
        this.name = name;
        R = r;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Area(){
        return this.R*this.R*3.14;
    }
}

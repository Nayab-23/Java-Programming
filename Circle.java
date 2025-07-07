public class Circle {
    private int radius ;
    public Circle(int radius) {
        this.radius = radius ;

    }

    public int getRadius() {
        return radius;
    }

    public double area(){
        final double pi = 3.141 ;
        double a = pi * (this.getRadius() * this.getRadius());
        return a;}

    public static void main(String[] args) {
        Circle rad1 = new Circle(4);
        System.out.println(rad1.area());
    }



}

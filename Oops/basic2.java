class circle{
    int radius;
    public void circumference(){
        System.out.println("the circumference of the circle are:"+(2*3.14*radius));
    }
    public void area(){
        System.out.println("the area of the circle are:"+(3.14*radius*radius));
    }
}

public class basic2 {
    public static void main(String[] args) {
        circle tyre=new circle();
        tyre.radius=4;
        tyre.circumference();
        tyre.area();
    }
}

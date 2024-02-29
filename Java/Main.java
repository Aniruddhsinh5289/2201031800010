import java.util.Scanner;
 class Area{
     area(double x, double y){
        double ans = x*y;
        System.out.println("Area of rectangle is:"+ans);
    }

     area (double r){
        double ans = 3.14*r*r;
        String.out.println("Area of circle is:"+ans);
    }
}


class Main{
    public static void main(String args[]){
        Area ob = new Area();
        ob.area(10,20);
        ob.area(15);
    }
}
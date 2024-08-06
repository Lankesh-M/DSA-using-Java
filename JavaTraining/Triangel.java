package JavaTraining;

import java.util.Scanner;

//Given Three side in cm, wap ot identify that the triangle is isoceles triangle or not
public class Triangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if( a+b >=c && b+c>=a && (int)Math.min(a, (int)Math.min(b, c)) != 0 ){
            if(a==b && b == c){
                System.out.print("Equivalent Triangel");
            }else if(a==b || b==c || c==a)
                System.out.print("Isoceles Triangel");
            else
                System.out.print("Scalene Triangle");
        }
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        if((int)Math.min(d1, (int)Math.min(d2, d3)) != 0 && d1+d2+d3 == 180){
            if(d1 == d2 && d1== d3)
                System.out.print("Equivalent Triangle");
            else if(d1 == d2 || d2 == d3 || d3 == d1)
                System.out.print("Isoceles Triangle");
            else{
                System.out.print("Scalene Triangle");
            }
        }
    }
    
}

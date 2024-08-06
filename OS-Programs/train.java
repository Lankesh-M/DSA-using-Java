import java.util.Scanner;
class train{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = s.next();
        // System.out.print(name);
        // int n = s.nextInt();
        // System.out.printf("%12d", n);
        // float f = s.nextFloat();

        //point1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        //point2
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int radius = sc.nextInt();
        int dist = (int)Math.sqrt( ((x2-x1)*(x2-x1)) - ((y2-y1)*(y2-y1)) );
        System.out.println("Radius: " +radius);
        System.out.println("Distance: " +dist);
        if(radius == dist){
            System.out.print("On the circle");
        }else if(dist > radius){
            System.out.print("Outside the circle");

        }else{
            System.out.print("Inside the circle");

        }



    }

    // private int
}
//Give two points x1, y1, x2, y2 where x1, y1 pointing the centre and x2, y2 points anywhere... Given the radius in cm, Identitify the point x1, y2 inside the circle or ouside the circle or On the circle

package lab2.for2labs;
import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        Point3d firstPoint = new Point3d();
        Point3d secondPoint = new Point3d(1,8,9);
        Point3d thirdPoint = new Point3d(9,4,3);
        Point3d distance = new Point3d();

        //ввод  координат firstPoint
        System.out.println("Введите значение x первой точки");
        double x = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение y первой точки");
        double y = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение z первой точки");
        double z = Double.parseDouble(in.nextLine());
// установление координат firstPoint
        firstPoint.setX(x);
        firstPoint.setY(y);
        firstPoint.setZ(z);

        //ввод  координат secondPoint
        System.out.println("Введите значение x второй точки");
        double x2 = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение y второй точки");
        double y2 = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение z второй точки");
        double z2 = Double.parseDouble(in.nextLine());
// установление координат secondPoint
        secondPoint.setX(x2);
        secondPoint.setY(y2);
        secondPoint.setZ(z2);

        //ввод  координат thirdPoint
        System.out.println("Введите значение x третей точки");
        double x3 = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение y третей точки");
        double y3 = Double.parseDouble(in.nextLine());
        System.out.println("Введите значение z третей точки");
        double z3 = Double.parseDouble(in.nextLine());
// установление координат thirdPoint
        thirdPoint.setX(x3);
        thirdPoint.setY(y3);
        thirdPoint.setZ(z3);
        

        // подсчет
        double a= distance.distase(firstPoint.getX(), firstPoint.getY(), firstPoint.getZ(), secondPoint.getX(), secondPoint.getY(), secondPoint.getZ());
        double b = distance.distase(secondPoint.getX(), secondPoint.getY(), secondPoint.getZ(), thirdPoint.getX(),thirdPoint.getY(),thirdPoint.getZ());
        double c = distance.distase(firstPoint.getX(), firstPoint.getY(), firstPoint.getZ(), thirdPoint.getX(),thirdPoint.getY(),thirdPoint.getZ());
        if (a==b || b==c || a==c){
            System.out.println("Две стороны равны");
        }
        else{
        System.out.printf("%.2f",computeArea(a, b, c));
        }
    }
    public static double computeArea(double a, double b, double c){
        double  p= (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

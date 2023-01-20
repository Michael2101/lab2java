package lab2.for2labs;
public class Point2d {
    private double XCord;
    private double YCord;
    // Конструктор инициализации 
    public Point2d(double x, double y){
        XCord=x;
        YCord=y;
    } 
    public Point2d(){
        this(0,0);
    }
    //Возвращение координаты X
    public double getX(){
        return XCord;
    }
    //Возвращение координаты Y
    public double getY(){
        return YCord;
    }
    //Установка значения координаты X
    public void setX(double val){
        XCord=val;
    }
    //Установка значения координаты Y
    public void setY(double val){
        YCord=val;
    }
    public static void main(String[] args){
        
        Point2d myPoint = new Point2d ();
        Point2d myOtherPoint = new Point2d (5,3);
        Point2d aThirdPoint = new Point2d ();
        System.out.print(myPoint.XCord + " ");
        System.out.println(myPoint.YCord);
        System.out.print(myOtherPoint.XCord + " ");
        System.out.println(myOtherPoint.YCord);
        System.out.print(aThirdPoint.XCord + " ");
        System.out.println(aThirdPoint.YCord);
        if (chek(myPoint.XCord, myPoint.YCord, aThirdPoint.XCord, aThirdPoint.YCord)){
            System.out.println("координаты  первой точки равны координатом второй точки");
        }
        else {
            System.out.println("координаты не равны");
        }
    }
    public static boolean chek(double x, double y, double x2, double y2){
        if (x==x2  && y==y2){
            return true;
        }
        return false;
     }
}


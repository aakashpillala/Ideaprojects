package stark;
class Point{
    double x;
    double y;
    Point(double a,double b){
        x=a;
        y=b;
    }
    void show(){
        System.out.println("point=("+x+","+y+")");
    }
}

public class Main {

    public static void main(String[] args) {
	 Point p=new Point(10,20);
	 p.show();
    }
}

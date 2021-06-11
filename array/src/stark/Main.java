package stark;
class RBRcourse{
    String  coursename;
    int noOflecturescovered;

}
public class Main {

    public static void main(String[] args) {
	// arraydeclaration
        RBRcourse[] course;
        course=new RBRcourse[3];
        course[0]=new RBRcourse();
        course[0].coursename="java";
        course[0].noOflecturescovered=30;
        course[1]=new RBRcourse();
        course[1].coursename="python";
        course[1].noOflecturescovered=20;
        course[2]=new RBRcourse();
        course[2].coursename="webtechnologies";
        course[2].noOflecturescovered=25;
        for(int i=0;i< course.length;i++){
            System.out.println("course launched and lectures covered"+i+":"+course[i].coursename+" "+ course[i].noOflecturescovered);

        }
    }
}

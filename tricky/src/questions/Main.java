package questions;

public class Main {
    public static void RBR_course2(int number_people_watching, Course courseNo){
        courseNo.coursenumber = courseNo.coursenumber+1;
        number_people_watching=number_people_watching+200;
    }
    public static void RBR_course1(){
        int number_people_watching=1000;
        Course course=new Course();
        course.coursenumber=1;
        RBR_course2(number_people_watching,course);
        System.out.println("number_people_watching"+number_people_watching+"RBR_course="+course.coursenumber);
    }
    public static void main(String[] args) {
	// two methods with same name
     RBR_course1();
    }
}
class Course{
    public int coursenumber;

}

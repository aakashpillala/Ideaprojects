package stark;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	String course ="javacourse";
	String coursenew="javacourse ";
	if(course==coursenew) {
        System.out.println("course and course new");
	}
	String mycourse=new String("javacourse");
	if (course==mycourse){
	    System.out.println("course and mycourse are same");
    }
    }
}

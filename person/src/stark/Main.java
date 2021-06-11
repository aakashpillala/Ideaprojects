package stark;
class Person{
    public String name;
    public static int birth;
    public static int death;
    public  int current_year;
    public static int sum;
    public static int age(int q, int j) {
        birth = q;
        death = j;
         sum = j - q;

        return sum;
    }

}
public class Main {

    public static void main(String[] args) {
    Person person1=new Person();
    person1.name="hhs";
    person1.age(1970,2010);
    System.out.println(person1.sum);

    }
}

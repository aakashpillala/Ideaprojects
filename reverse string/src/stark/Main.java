package stark;

public class Main {
private static String reverse(String str){
    char[] arr=new char[str.length()];
    for(int i= arr.length-1,j=0;i>=0;i--,j++){
        arr[j]=str.charAt(i);
    }
    return new String(arr);
}
    public static void main(String[] args) {
	String needrev=reverse("rbr is my mentor");
        System.out.println("reverse of given string is "+needrev);
        // with string buffered
        String s="im so cool";
        System.out.println(s);
        StringBuffer sb=new StringBuffer(s);
        System.out.println("reversed string is "+sb.reverse());
    }
}

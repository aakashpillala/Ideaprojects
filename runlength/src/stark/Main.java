package stark;

public class Main {
    public String encoding(String toencode){
        int consecutivecharcout=1;
        StringBuilder encodedString=new StringBuilder();
        for(int currentchar=1;currentchar<=toencode.length();++currentchar){
            if(currentchar==toencode.length()|| toencode.charAt(currentchar)!=toencode.charAt(currentchar-1))
            {
                encodedString.append(consecutivecharcout);
                encodedString.append(toencode.charAt(currentchar-1));
                consecutivecharcout=1;
            }
            else{
                ++consecutivecharcout;
            }
        }
        return encodedString.toString();
    }

    public static void main(String[] args) {
        Main runlength=new Main();
        String testcase1="Pillala Aakash";
        System.out.println("runlength 0f "+testcase1+":"+runlength.encoding(testcase1));

    }
}

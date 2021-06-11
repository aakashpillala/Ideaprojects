package stark;

public class Main {

    public static void main(String[] args) {
	// buffered vs builder
        StringBuffer ab=new StringBuffer("AAKASH");
        long starttime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            ab.append(" pillala");
        }
        System.out.println("compeletion time is"+(System.currentTimeMillis()-starttime)+"msec");
    StringBuilder ba=new StringBuilder("sam");
    long secondtime=System.currentTimeMillis();
    for(int i=0;i<100000;i++){
        ab.append("jam");
    }
        System.out.println("compilition time is "+(System.currentTimeMillis()-secondtime)+"msec");
    }
}

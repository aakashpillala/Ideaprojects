package stark;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // string buffer inial capacity is 16 chartacters size
        StringBuffer sb = new StringBuffer("aakash");
        System.out.println(sb.capacity());
        // append is used to combine the values in method type buffger
        StringBuffer aaj = new StringBuffer("java");
        aaj.append("course");
        aaj.append(1);
        aaj.append("rbr");
        System.out.println(aaj);
        StringBuffer var = new StringBuffer(" happy");
        var.append(" birthday").append(" ").append("to you");
        System.out.println(var);
        // string buffer is used when modification are made time after time
        StringBuffer sam = new StringBuffer();
        sam.insert(0, "java");
        sam.insert(2, true);
        sam.insert(3, 1);
        System.out.println(sam);
        //prints jat1rueva
        /**
         * java
         * jatrueva
         * jat1rueva
         */
        //replace from startindex to endindex-1
        StringBuffer replace = new StringBuffer("buffer");
        replace.replace(2, 4, "y");
        System.out.println(replace);
        StringBuffer reverse = new StringBuffer("coding");
        reverse.reverse();
        System.out.println(reverse);
        // in string buffered we can use append but not +
        /**
         * string builder is not thread-safe
         * it is used for faster single process
         */

    }
}

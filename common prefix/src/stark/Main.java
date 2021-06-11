package stark;

public class Main {
    public static String longestcommonprefix(String[] array) {
        /**
         * this method computes common prefix
         */
        if (0 == array.length) {
            return "";

        }
        for (int prefixlen = 0; prefixlen < array[0].length(); prefixlen++) {
            char tomatch = array[0].charAt(prefixlen);
            for (int i = 1; i < array.length; i++) {
            if(prefixlen>=array[i].length()||array[i].charAt(prefixlen)!= tomatch){
                return array[0].substring(0,prefixlen);
            }
            }

        }
          return array[0];
    }
        public static void main (String[]args){
            // common prefix  amomng testcases
            String[] case1 = {"flower", "flow", "flowinsight"};
            String[] case2 = {"dog", "cat", "bird"};
            String[] case3 = {"class", "classes", "ram"};
            System.out.println("common prefix of testcase1 :"+longestcommonprefix(case1));
            System.out.println("common prefix of testcase2 :"+longestcommonprefix(case2));
            System.out.println("common prefix of testcase3 :"+longestcommonprefix(case3));
        }
    }


package Coding;

public class Answer8 {

    public static int myAtoi(String str) {
        int start = 0, end = 0;
        String tempstr = "";
        boolean isfirst = true;


        for(;start<str.length(); start++) {
            int char_int = (int)str.charAt(start);

            if(isfirst) {
                if((char_int == 43 || char_int == 45 || (char_int>=48 && char_int <=57))) {
                    isfirst = !isfirst;
                } else {
                    if(char_int != 32)
                        break;
                }
            }


            if(char_int == 43 || char_int == 45 || (char_int>=48 && char_int <=57)) {
                if(start + 1 != str.length()) {
                    end = start + 1;
                    for(;end<str.length();end++) {
                        if((int)str.charAt(end)<48 || (int)str.charAt(end) > 57) {
                            break;
                        }
                    }

                    //if(end-start > tempstr.length())
                        tempstr = str.substring(start, end);
                    //start = end;
                    break;
                } else
                    tempstr = str.substring(start, str.length());

            }
        }

        if(tempstr.length() == 0)
            return 0;

        try {
            if(tempstr.length() == 1 && (tempstr.equals("+") || tempstr.equals("-"))) {
                return 0;
            }
            int i = Integer.parseInt(tempstr);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            if(tempstr.charAt(0) == 45)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
       // System.out.println(myAtoi("1231   23123wwwww-44444444  4444"));
        System.out.println(myAtoi("1"));
        //System.out.println((int)'-');
    }

}

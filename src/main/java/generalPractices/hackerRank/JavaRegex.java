package generalPractices.hackerRank;

import java.util.Scanner;

public class JavaRegex {
    /* Write a class called MyRegex which will contain a string pattern.
    You need to write a regular expression and assign it to the pattern
    such that it can be used to validate an IP address. Use the following definition of an IP address:
    IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
    Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3. */
    /*
     1--> it can contain single digit i.e ([0-9]);
     2--> It can contain two digits i.e ([0-9][0-9]);
     3--> Range is (099 to 199)i.e((0|1)[0-9][0-9]);
     4--> range is (200 - 249) i.e (2[0-9][0-9]) ;
     5--> range is (250-255) i.e (25[0-5]);
     Total :
     "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"
     */
    String num = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = num + "." +num + "." + num + "." + num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IP = sc.next();
        System.out.println(IP.matches(new JavaRegex().pattern));
    }
}
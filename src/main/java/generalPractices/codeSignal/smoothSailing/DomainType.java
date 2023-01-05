package generalPractices.codeSignal.smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
GoDaddy makes a lot of different top-level domains available to its customers.
A top-level domain is one that goes directly after the last dot ('.') in the domain name, for example .com in example.com.
To help the users choose from available domains, GoDaddy is introducing a new feature that shows the type of the chosen top-level domain.
You have to implement this feature.
To begin with, you want to write a function that labels the domains as "commercial", "organization", "network" or "information"
for .com, .org, .net or .info respectively.
For the given list of domains return the list of their labels.

Example

For domains = ["en.wiki.org", "codesignal.com", "happy.net", "code.info"], the output should be
solution(domains) = ["organization", "commercial", "network", "information"].


 */
public class DomainType {
    public static void main(String[] args){
        String[] strings = {"en.wiki.org", "codesignal.com", "happy.net", "code.info"};
        String[] strings1 = {
                "com.net.info",
                "org.com.net",
                "net.com.org",
                "info.net.com",
                "net.net.com",
                "com.com.org",
                "info.info.net",
                "org.org.info"};

        System.out.println(Arrays.toString(solution(strings1)));

    }

    public static String[] solution(String[] domains){
        List<String> stringList = new ArrayList<>();

        final String org = "organization";
        final String com = "commercial";
        final String net = "network";
        final String info = "information";


        for(String str : domains){
            if(str.endsWith(".com")){
                stringList.add(com);
            } else if (str.endsWith(".org")) {
                stringList.add(org);
            } else if (str.endsWith(".net")) {
                stringList.add(net);
            } else {
                stringList.add(info);
            }
        }

        return stringList.toArray(new String[0]);

    }
}

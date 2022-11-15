package generalPractices.codeSignal.theJourneyBegins;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(solution(101));
    }
    /*Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
     the second - from the year 101 up to and including the year 200, etc. */
    static int solution(int year) {
        return (year + 99 ) / 100;
    }
}

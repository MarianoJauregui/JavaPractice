package generalPractices.codewars;

public class CountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }
    /*
    Given a non-negative integer, 3 for example, return a string with a murmur:
     "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
     */
    public static String countingSheep(int num){
      StringBuilder stringBuilder = new StringBuilder();
      for(int i=1; i <num+1; i++){
          stringBuilder.append(i).append(" sheep...");
      }
      return stringBuilder.toString();

    }
}

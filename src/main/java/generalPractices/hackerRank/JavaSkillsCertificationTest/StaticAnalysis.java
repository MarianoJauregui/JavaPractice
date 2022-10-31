package generalPractices.hackerRank.JavaSkillsCertificationTest;

public class StaticAnalysis {
    public static void main(String[] args) {
        int i = 010; //8
        int j = 07; //7
        System.out.println(i);
        System.out.println(j);

        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        } catch (NumberFormatException e){
            System.out.println("bad number");
        }
    }
}

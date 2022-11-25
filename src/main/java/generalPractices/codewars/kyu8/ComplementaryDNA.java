package generalPractices.codewars.kyu8;

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna){
        StringBuilder complement = new StringBuilder(new String(""));
        for(int i=0; i<dna.length(); i++){
            switch (dna.charAt(i)) {
                case 'A' -> complement.append('T');
                case 'T' -> complement.append('A');
                case 'G' -> complement.append('C');
                case 'C' -> complement.append('G');
            }
        }
        return complement.toString();
    }
}

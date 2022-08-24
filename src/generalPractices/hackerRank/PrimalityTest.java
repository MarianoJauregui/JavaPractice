package generalPractices.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger primeOrNot = new BigInteger(n);
        System.out.println(primeOrNot.isProbablePrime(1) ? "Prime" :
                primeOrNot.isProbablePrime(0) || primeOrNot.isProbablePrime(-1) ? "Not prime" :
                        "Wrong number");

        bufferedReader.close();


    }
}

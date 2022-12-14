import java.io.IOException;
import java.math.BigInteger;

public class intBig {
    public static void main(String[] args) throws IOException {
        BigInteger bigInt = new BigInteger("1000000000000000000000000000000000022");

        int bigIntToInteger = bigInt.intValue();
        long bigIntToLong = bigInt.longValue();
        float bigIntToFloat = bigInt.floatValue();
        double bigIntToDouble = bigInt.doubleValue() * 9;
        String bigIntToString = bigInt.toString();

        System.out.println(bigIntToInteger);
        System.out.println(bigIntToLong);
        System.out.println(bigIntToFloat);
        System.out.println(bigIntToDouble);
        System.out.println(bigIntToString);
    }
}

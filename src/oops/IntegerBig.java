package oops;

import java.math.BigInteger;

public class IntegerBig {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12324232423232324232");
        BigInteger bigInteger1 = BigInteger.valueOf(2412312323242L);
        BigInteger bigInteger2 = BigInteger.TEN;

        System.out.println(bigInteger.multiply(new BigInteger("12121324")));
    }
}

package DataStructures1;

import java.util.Arrays;

public class DS1_array {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(30);
        numbers.removeAt(1);
        System.out.println(numbers.size);
        numbers.print();
        System.out.println();
        System.out.println(numbers.indexOf(20));

    }
}

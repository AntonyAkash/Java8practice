package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;

public class SumofnumbersinArray {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().reduce((a, b) -> a + b).get();
        System.out.println(sum);
    }
}

package StringHandling;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverseStringUsingForLoop("Pushkar"));
        System.out.println(obj.reverseStringUsingBytesArray("Chauhan"));
        System.out.println(obj.reverseStringUsingStringBuilder("Singh"));
        System.out.println(obj.reverseStringUsingJava8("Bangalore"));
    }

    private String reverseStringUsingJava8(String str) {
        int len = str.length();
        return IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j -> str.charAt(j))
                .map(Object::toString)
                .collect(Collectors.joining());

    }

    private String reverseStringUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private String reverseStringUsingBytesArray(String str) {
        byte[] arr1 = str.getBytes(StandardCharsets.UTF_8);
        byte[] arr2 = new byte[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - i - 1];
        }

        String reversed = new String(arr2);
        return reversed;
    }

    private String reverseStringUsingForLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}

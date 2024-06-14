import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysToCreatingStream {
    public static void main(String[] args) {
        // 1. Creating blank Stream
        Stream<Object> emptyStream = Stream.empty();

        // 2.Array, Object, Collection
        String names[] = { "Shivraj", "Sayali", "Shiv", "Saya" };
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(name -> {
            System.out.println(name);
        });

        // 3. By using builder
        Stream stream2 = Stream.builder().build();

        // 4. By passing Array into Stream
        IntStream stream3 = Arrays.stream(new int[] { 2, 3, 4, 5 });
        stream3.forEach(val -> {
            System.out.print(val + " ");
        });
        System.out.println();

        // 5. With Collection object{List,Set,etc..}
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);
        Stream<Integer> stream4 = list.stream();
        stream4.forEach(val -> {
            System.out.print(val + " ");
        });
    }
}

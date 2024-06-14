import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 4, 1, 6, 2);

        Stream<Integer> stream = list.stream();

        // Stream<Integer> finalStream=stream.filter(ele -> ele % 2 == 0);
        // Stream<Integer> sortedStream = filterStream.sorted();
        // Stream<Integer> mapedStream = sortedStream.map(val -> val * 2);

        Stream<Integer> finalStream = stream.filter(ele -> ele % 2 == 0).sorted().map(ele -> ele * 2);

        finalStream.forEach(ele -> System.out.println(ele));

    }
}

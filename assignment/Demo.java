package assignment;

import java.util.stream.Stream;

public class Demo {
public static void main(String[] args) {
	StringBuilder result = Stream.of("a", "b")
			 .parallel()
			 .collect(StringBuilder::new, StringBuilder::append, (a, b) ->
			b.append(b));
			System.out.println(result);
}
}

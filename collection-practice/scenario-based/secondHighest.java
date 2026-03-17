import java.util.*;
public class secondHighest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,1,4);
		System.out.print(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class LegnagyobbakStream {

	public static void main(String[] args) {
		Scanner olvas = new Scanner(System.in);
		while(olvas.hasNextLine()) {
			ArrayList<String> p = new ArrayList<>();
			p.addAll(Arrays.asList(olvas.nextLine().split("\\s+")));
			Optional<Integer> max = p.stream()
				.filter(s -> !s.isEmpty())
				.map(s -> Integer.parseInt(s))
				.filter(n -> n % 2 == 0)
				.max(Integer::compareTo);
			System.out.println(max.isPresent()?max.get():"unknown");
		}
	}

}

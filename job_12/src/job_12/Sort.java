package job_12;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		String[] sample = {"i","walk", "the","line"};
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}
}

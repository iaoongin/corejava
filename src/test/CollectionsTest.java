package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		
		int[] array = {1,3,2,5};
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(9);
		list.add(3);
		
		System.out.println(Collections.max(list));
	}
}

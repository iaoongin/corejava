package exercises;

public class TryFinallyReturnTest {

	public static void main(String[] args) {
		int a = new TryFinallyReturnTest().test();
		System.out.println(a);
	}
	
	public int test() {
		int i = 1;
		try {
			return i;
		}finally {
			i++;
			System.out.println(i);
//			return i;
		}
	}
}


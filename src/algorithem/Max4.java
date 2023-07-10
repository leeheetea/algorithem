package algorithem;

public class Max4 {
	
	static int max4(int a, int b, int c, int d) {
		int[] intArray = {a, b, c, d};
		int max = a;
		for(int i = 0; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		int[] intArray = {a , b, c};
		for(int i : intArray) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		int[] intArray = {a, b, c, d};
		for(int i: intArray) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Max4.max4(1, 2, 3, 4));
		System.out.println(Max4.max4(2, 3, 4, 5));
		
		System.out.println(Max4.min3(1, 2, 3));
		System.out.println(Max4.min4(6, 2, 3, 4));
	}
}

public class Demo {
public static void main(String[] args) {
	int[] x1 = {1,2,3,34};
	int[] x2 = {1,2};
	int[] x3 = {1,5,15,334,17,33};
	int[] x4 = {4};
	int[] x5 = {1,2,3,16,27};
	System.out.println(arrToString(x2));
}

public static String arrToString(int[] arr) {
	String arrstr = "{";
	for (int i = 0; i < arr.length; i++) {
		arrstr = arrstr + arr[i];
		if (i != arr.length - 1) {
			arrstr = arrstr + ", ";
		}
	}
	arrstr = arrstr + "}";
	return arrstr;
}



public static void printLoop(int a) {
	for (int x = 1; x <= a; x++) {
		for (int y = 0; y <= a - x; y++) {
			System.out.print(x);
		}
		System.out.println();
	}
}
}

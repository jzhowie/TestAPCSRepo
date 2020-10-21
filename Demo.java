public class Demo {
public static void main(String[] args) {
	if (args.length == 0) {
		//printLoop(5);
	}
	else {
		printLoop(Integer.parseInt(args[0]));
	}

	System.out.println(arrayDeepToString(create2DArray(5, 3, 3)).replace("}, ","}, \n "));
	/*
	   int[] x1 = {1,2,3,34};
	   int[] x2 = {1,2};
	   int[] x3 = {1,5,15,334,17,33};
	   int[] x4 = {4};
	   int[] x5 = {1,2,3,16,27};
	   int[][] x6 = {{1,2,3,16,27},{1,5,15,334,17,33}};
	   System.out.println(arrToString(x2));
	   System.out.println(arrayDeepToString(x6));
	 */
}

public static int[][] create2DArray(int rows, int cols, int maxValue) {
	int[][] newarr = new int[cols][rows];
	for (int col = 0; col < newarr.length; col++) {
		for (int row = 0; row < newarr[col].length; row++) {
			int randint = (int) Math.round(Math.random() * maxValue);
			newarr[col][row] = randint;
		}
	}
	return newarr;
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

public static String arrayDeepToString(int[][] arr) {
	String newstr = "{";
	for (int row = 0; row < arr.length; row++) {
		newstr += arrToString(arr[row]);
		if (row != arr.length - 1) {
			newstr += ", ";
		}
	}
	newstr += "}";
	return newstr;
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

public class Demo {
  public static void main(String[] args) {
    if (args.length == 0) {
      printLoop(5);
    }
    else {
      printLoop(Integer.parseInt(args[0]));
    }
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

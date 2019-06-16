package repl;

public class Repl142_MethodsSimplePrintPattern {

	public static void printHollowRect() {
//		int square = 5;
//		for (int i = 0; i < square; i++) {
//			if ((i % square == 0) || ((i + 1) % square == 0)) {
//				System.out.println("* * * * *");
//			} else {
//				System.out.println("*       *");
//			}
//
//		}
	      for (int j = 0; j < 5; j++) {
              System.out.print("* ");
          }
          System.out.println();
              for (int i = 0; i < 5 - 2; i++) {
                  System.out.print("* ");
                  for (int z = 0; z < 5 - 2; z++) {
                      System.out.print("  ");
                  }
                  System.out.println("*");
                  }

                  for (int k = 0; k < 5; k++) {
                      System.out.print("* ");
                  }

	}

	public static void main(String[] args) {

		printHollowRect();
	}

}

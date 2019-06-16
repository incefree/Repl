package repl;

import java.util.Arrays;

public class Repl135ArraysChessBoard {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE

		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				chessBoard[i][j] = (i + 1) + "" + ((char) (j + 'a'));
			}
		}
		
//		for (int i = 0; i < chessBoard.length; i++) {
//			String c = "a";
//			int x = 'a';
//			for (int j = 0; j < chessBoard[i].length; j++) {
//				chessBoard[i][j] = (i + 1) + c + "";
//				x++;
//				c = (char) (x) + "";
//			}
//		}
		
		System.out.println(Arrays.deepToString(chessBoard));
	}
}
		        
		        
//		        String name = "";
//		        String[] letters = { "a, ", "b, ", "c, ", "d, ", "e, ", "f, ", "g, ", "h" };
//		        for (int i = 0; i < chessBoard.length; i++) {
//		            for (int j = 0; j < chessBoard[i].length; j++) {
//		               name =  (i + 1) + letters[j];
//		               
//		               System.out.print(name);
//		            }
//		        }
/*
 * 
 * Given a 8x8 two-dimensional array of strings named chess board. Initialize
 * values inside an array accordingly to the chess board. So first element in
 * the array, chessboard[0][0] should have a value "1a", and last element in the
 * array, chessboard[7][7] should have a value "8h".
 * 
 */
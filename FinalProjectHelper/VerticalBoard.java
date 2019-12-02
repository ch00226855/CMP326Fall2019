// This program is to illustrate how to place pieces correctly when
// the board is verticle.

public class VerticalBoard {
	
	// 0 - empty square
	// 1 - player1's piece is placed
	// 2 - player2's piece is placed
	private int[][] pieces = new int[][] {
//col:   0  1  2  3  4  5  6
		{0, 0, 1, 0, 0, 0, 0}, // Row 0
		{0, 0, 2, 0, 0, 0, 0}, // Row 1
		{0, 0, 1, 0, 0, 0, 0}, // Row 2
		{0, 0, 2, 0, 0, 0, 0}, // Row 3
		{0, 1, 1, 2, 0, 0, 0}, // Row 4
		{1, 2, 2, 2, 1, 0, 0}  // Row 5
	};
	
	public int findNewRowIndex(int rowIndex, int colIndex) {
		/*
		 * Returns the row index of the square that 
		 * the piece falls to.
		 */
		// the square we are looking for must have a piece
		// under it. Also the square should be empty
		boolean isEmpty;
		boolean hasPieceBelow;
		for (int i = 5; i >= 0; i--) {//check pieces[i][colIndex]
			isEmpty = (pieces[i][colIndex] == 0);
			if (i != 5) {
				hasPieceBelow = (pieces[i+1][colIndex] == 1 ||
							pieces[i+1][colIndex] == 2);
			} else {// if i is 5, then it is already at the bottom.
				hasPieceBelow = true;
			}
			if (isEmpty && hasPieceBelow) {
				return i;
			}
		}
		return -1; // -1 indicates that the column is already full.	
	}

	public static void main(String[] args) {
		
		// Create a board object
		VerticalBoard board = new VerticalBoard(); 
		
		// Print out the new board
		System.out.println("Before:");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(board.pieces[i][j] + " ");
			}
			System.out.println("");
		}

		
		// Assume that we have obtained the row index and column
		// index of the piece
		int rowIndex = 3;
		int colIndex = 2;
		
		System.out.println("Row:" + rowIndex + 
							" Column: " + colIndex);
		
		// Update the board
		
//		// If the board is placed horizontally:
//		board.pieces[rowIndex][colIndex] = 1;
		
		// Since the board is placed vertically, we need
		// to find the square where the pieces falls to.
		
		int newRowIndex = board.findNewRowIndex(rowIndex, colIndex);
		int newColIndex = colIndex; // piece does not change column
		System.out.println("New Row Index: " + newRowIndex + 
						"New Column Index: " + newColIndex);
		// TODO determine the value based on whose turn it is.
		if (newRowIndex != -1) {// -1 means that columns is full
			board.pieces[newRowIndex][newColIndex] = 1;
		}
		
		// Print out the new board
		System.out.println("After:");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(board.pieces[i][j] + " ");
			}
			System.out.println("");
		}

	}

}

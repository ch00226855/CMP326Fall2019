
public class BoardWithVictoryChecking {
	
	private int[][] pieces = new int[][] {
		{1, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 1, 0},
		{1, 0, 2, 0, 2, 1, 0},
		{0, 0, 0, 1, 0, 1, 1},
		{0, 0, 1, 0, 0, 0, 1},
		{0, 0, 0, 0, 0, 0, 1}
	};

	public static void main(String[] args) {
		
		BoardWithVictoryChecking board = new BoardWithVictoryChecking();
		
		int victoryType = board.checkVictory();
		
		System.out.println("Victory Type: " + victoryType);

	}
	
	public int checkVictory() {
		/*
		 * Return the victory type given the board layout.
		 * 0 - the game is not ended.
		 * 1 - Player 1 wins.
		 * 2 - Player 2 wins. 
		 * 3 - the games ends with a tie.
		 */
		
		if(doesPlayer1Win()) {
			return 1;
		} else if (doesPlayer2Win()) {
			return 2;
		} else if (hasEmptySquare()) {
			return 0;
		} else {
			return 3;
		}
		
	}
	
	public boolean doesPlayer1Win() {
		// Player 1 wins if:
		// 1. there are 4 connected 1's in a row.
		for (int i = 0; i < 6; i++) {// check row i
			// a) first four squares are 1
			if (pieces[i][0] == 1 &&
				pieces[i][1] == 1 &&
				pieces[i][2] == 1 &&
				pieces[i][3] == 1) {
				return true;
			}
			// b) square 2-5 are all 1's.
			if (pieces[i][1] == 1 &&
				pieces[i][2] == 1 &&
				pieces[i][3] == 1 &&
				pieces[i][4] == 1) {
				return true;
			}
			// c) square 3-6 are all 1's.
			if (pieces[i][2] == 1 &&
				pieces[i][3] == 1 &&
				pieces[i][4] == 1 &&
				pieces[i][5] == 1) {
				return true;
			}
			// d) last four squares are 1
			if (pieces[i][3] == 1 &&
				pieces[i][4] == 1 &&
				pieces[i][5] == 1 &&
				pieces[i][6] == 1) {
				return true;
			}
		}
		
		// 2. there are 4 connected 1's in a column.
		for (int j = 0; j < 7; j++) {// check column j
			// a) top four squares are 1
			if (pieces[0][j] == 1 &&
				pieces[1][j] == 1 &&
				pieces[2][j] == 1 &&
				pieces[3][j] == 1) {
				return true;
			}
			
			// b) middle four squares are 1
			if (pieces[1][j] == 1 &&
				pieces[2][j] == 1 &&
				pieces[3][j] == 1 &&
				pieces[4][j] == 1) {
				return true;
			}
			
			// c) bottom four squares are 1
			if (pieces[2][j] == 1 &&
				pieces[3][j] == 1 &&
				pieces[4][j] == 1 &&
				pieces[5][j] == 1) {
				return true;
			}
		}
		
		// 3. there are 4 connected 1's in a downward diagonal.
		int startRowIndex;
		int endRowIndex;
		for (int k = -3; k <= 2; k++) {//k = rowIndex - colIndex
			 if (k <= 0) {
				 startRowIndex = 0;
			 } else {
				 startRowIndex = k;
			 }
			 
			 if (k >= 0) {
				 endRowIndex = 5;
			 } else {
				 endRowIndex = k + 5;
			 }
			 
			 for (int i = startRowIndex; i < endRowIndex - 3; i++) {
//				 System.out.println("" + i + " " + k);
				 if(pieces[i][i-k] == 1 &&
					pieces[i+1][i-k+1] == 1 &&
					pieces[i+2][i-k+2] == 1 &&
					pieces[i+3][i-k+3] == 1) {
					 return true;
				 }
			 }	
		}
		
		// 4. there are 4 connected 1's in an upward diagonal.
		for (int k = 3; k <= 8; k++) {//k = rowIndex + colIndex
			 if (k <= 6) {
				 startRowIndex = 0;
			 } else {
				 startRowIndex = k - 6;
			 }
			 
			 if (k >= 6) {
				 endRowIndex = 5;
			 } else {
				 endRowIndex = k;
			 }
			 
			 for (int i = startRowIndex; i < endRowIndex - 3; i++) {
				 if(pieces[i][k-i] == 1 &&
					pieces[i+1][k-i-1] == 1 &&
					pieces[i+2][k-i-2] == 1 &&
					pieces[i+3][k-i-3] == 1) {
					 return true;
				 }
			 }	
		}	
		return false;
	}
	
	public boolean doesPlayer2Win() {
		//TODO Complete this method
		return false;
		
	}
	
	public boolean hasEmptySquare() {
		// if there is a 0 in the first row, return true;
		// if there is no 0 in the first row, then all other
		//   rows must be full as well, so return false.
		for (int j = 0; j < 7; j++) {// check pieces[0][j]
			if (pieces[0][j] == 0) {
				return true;
			}
		}
		return false;		
	}

}

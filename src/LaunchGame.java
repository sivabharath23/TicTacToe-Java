
class TicTacToe{
	
	char board[][];
	
	public TicTacToe(){ // here is the constructor
		board =  new char[3][3];
		initBoard();
	}

	void placeMark(int row,int col,char mark) {
		if(row >=0 && row<=2 && col>=0 && col<=2) {
			board[row][col] = mark;
		}
		else {
			System.out.println("Enter a Valid Position");
		}
	}
	
	void initBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j] = ' ';
			}
		}
	}

	void display() {
		System.out.println("-----------");
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j] +" | ");
			}
			System.out.println();
			System.out.println("-----------");
		}
	}
	
//	boolean checkWin() {
//		for(int i=0;i<=2;i++) {
//			if(board[0][0]==board[0][1] && board[0][1]==board[0][2]) {
//				return true;
//			}
//			return false;
//		}
//	}

}

 
public class LaunchGame {
	
	public static void main(String[] args) {
		TicTacToe obj = new TicTacToe();
		obj.display();
		obj.placeMark(1, 1, 'X');
		obj.placeMark(0, 0, 'O');
		obj.placeMark(2, 2, 'O');
		obj.display();
	}

}

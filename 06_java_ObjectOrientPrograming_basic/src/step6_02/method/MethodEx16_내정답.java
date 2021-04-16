package step6_02.method;
//2021/04/16 15:19 ~ 15:48
import java.util.Scanner;

//# 틱택토

class TicTacToe_1{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	// game 배열을 공백(" ")으로 초기화 ( 초기화하지 않을 경우 null 값)
	void setGame() {
		
		for (int i=0; i<game.length; i++) {
			for (int j=0; j<game[i].length; j++) {
				game[i][j] = " ";
			}
		}
		
	}
	
	
	
	// 게임 화면 출력
	void showGame() {
		System.out.println("===틱택톡===");
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	
	// 인덱스 선택
	void choiceIdx() {
		if(turn % 2 == 1) {
			System.out.print("[turn1 차례] y좌표 입력: ");
			int y = scan.nextInt();
			System.out.print("[turn1 차례] x좌표 입력: ");
			int x = scan.nextInt();
			
			if(game[y][x].equals(" ")) {
				game[y][x] = "0";
				turn ++;
			}
			else {System.out.println("잘못입력하셨습니다.");}
		}
		else if(turn % 2 == 0) {
			System.out.print("[turn2 차례] y좌표 입력: ");
			int y = scan.nextInt();
			System.out.print("[turn2 차례] x좌표 입력: ");
			int x = scan.nextInt();
			
			if(game[y][x].equals(" ")) {
				game[y][x] = "X";
				turn ++;
			}
			else {System.out.println("잘못입력하셨습니다.");}
		}
	}
	
	
	void exitWidth() { // 가로확인
		for(int i=0; i<3; i++) {
			if(game[i][0].equals("0") &&  game[i][1].equals("0") && game[i][2].equals("0")) win = 1;
			if(game[i][0].equals("X") &&  game[i][1].equals("X") && game[i][2].equals("X")) win = 2;
		}
	}
	
	void exitHeight() { // 세로확인
		for(int i=0; i<3; i++) {
			if(game[0][i].equals("0") &&  game[1][i].equals("0") && game[2][i].equals("0")) win = 1;
			if(game[0][i].equals("X") &&  game[1][i].equals("X") && game[2][i].equals("X")) win = 2;
		}
	}
	

	void exitCross() { //대각선 확인
		if(game[0][0].equals("0") && game[1][1].equals("0") && game[2][2].equals("0")) win = 1;
		if(game[2][0].equals("0") && game[1][1].equals("0") && game[0][2].equals("0")) win = 1;
		if(game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) win = 2;
		if(game[2][0].equals("X") && game[1][1].equals("X") && game[0][2].equals("X")) win = 2;
	}
	
	void run() {
		setGame(); // 게임 세팅
		
		while(true) {
		showGame(); // 게임 화면 출력
			if(win ==1) {
				System.out.println("[turn1]의 승리"); 
				break;
			}
			else if(win ==2) {
				System.out.println("[turn2]의 승리"); 
				break;
			}
			choiceIdx(); // 게임 시작 인덱스 선택
			exitCross(); // 대각선 확인
			exitHeight(); // 세로 확인
			exitWidth(); //가로 확인
		}
		
	}
	
}


public class MethodEx16_내정답 {

	public static void main(String[] args) {
		
		TicTacToe_1 tic = new TicTacToe_1();
		tic.run();

	}

}

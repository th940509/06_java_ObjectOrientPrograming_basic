package step6_02.method;
//2021/04/16 15:04 ~ 15:18
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame_1{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;		// 정답을 맞춘 횟수
	
	void shuffle() {
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(front.length);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
	}
	
	void printCard() {
		//카드 앞면 출력
		System.out.print("front = [");
		for(int i=0; i<front.length; i++) {
			System.out.print(front[i] + " ");}
		System.out.print("]");
		
		//카드 뒷면 출력
		System.out.print("back = [");
		for(int i=0; i<back.length; i++) {
			System.out.println(back[i] + " ");}
		System.out.print("]");
	}
	
	void choiceCard() {
		System.out.print("카드1 입력: ");
		int card1 = scan.nextInt();
		card1 --;
		System.out.print("카드2 입력: ");
		int card2 = scan.nextInt();
		card2 --;
		
		//카드 맞추기
		if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			correctCnt ++;
		}
		
	}
	
	void run() {
		//카드 섞기(셔플)
		shuffle();
		
		while(true) {
			//카드 출력
			printCard();
			
			//종료하기
			if(correctCnt == 5) {
				System.out.println("게임종료");
				break;
			}
			
			//카드 선책하기
			choiceCard();
		}
	}
}
	

public class MethodEx15_내정답 {

	public static void main(String[] args) {

		MemoryGame_1 g = new MemoryGame_1();
		g.run();

	}

}

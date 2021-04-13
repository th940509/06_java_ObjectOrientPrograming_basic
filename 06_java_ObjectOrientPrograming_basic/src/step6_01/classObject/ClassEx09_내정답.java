package step6_01.classObject;
//2021/04/13 15:00 ~ 15:26

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_1{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;	
	int getIndex1 = 0;
	int getIndex2 = 0;
	
}


public class ClassEx09_내정답 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex09_1 e = new Ex09_1();
		
		for(int i=0; i<9; i++) {
			int tempRan = 0;
			tempRan = ran.nextInt(9);
			int temp = e.front[0];
			e.front[0] = e.front[tempRan];
			e.front[tempRan] = temp;
		}
		
		while(e.answerCnt<5) {
			for(int i=0; i<9; i++) {
				System.out.print(e.front[i] + " ");
			}
			System.out.println();
			for(int i=0; i<9; i++) {
				System.out.print(e.back[i] + " ");
			}
			System.out.println();
			System.out.print("인덱스1 입력: ");
			e.getIndex1 = scan.nextInt();
			System.out.print("인덱스2 입력: ");
			e.getIndex2 = scan.nextInt();
			
			if(e.front[e.getIndex1] == e.front[e.getIndex2]) {
				e.back[e.getIndex1] = e.front[e.getIndex1];
				e.back[e.getIndex2] = e.front[e.getIndex2];
			}
		}
		System.out.println("게임종료");

	}

}

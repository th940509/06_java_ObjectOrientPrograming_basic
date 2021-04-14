package step6_02.method;
//2021/04/14 17:25 ~ 

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Ex09_1 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for(int i=0; i<scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		System.out.println("배열의 요소: " + Arrays.toString(scores));
		System.out.println();
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {}
	
	//문제 3)
	void printWinner (int [] scores) {}
	
	//문제 4)
	void printScore1 (int [] scores) {}
	
	//문제 5)
	void printScore2 (int [] scores) {}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {}
	
}


public class MethodEx09_내정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_1 e = new Ex09_1();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)

	}

}

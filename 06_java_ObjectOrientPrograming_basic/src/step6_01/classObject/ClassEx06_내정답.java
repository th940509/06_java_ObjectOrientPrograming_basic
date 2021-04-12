package step6_01.classObject;
//2021/04/12 17:53 ~ 18:20

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


class Ex06_1{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	char[] list = new char[5];
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}




public class ClassEx06_내정답 {
	

	public static void main(String[] args) {
		Random ran = new Random();
		Ex06_1 test = new Ex06_1();
		
		for(int i=0; i<5; i++) {
			test.hgd[i] = ran.nextInt(5)+1;
			if(test.hgd[i] == test.answer[i]) {
				test.list[i] = 'O';
				test.answerCnt ++;
			}
			else if(test.hgd[i] != test.answer[i]) {
				test.list[i] = 'X';
			}
		}
		
		System.out.println(Arrays.toString(test.answer));
		System.out.println(Arrays.toString(test.hgd));
		System.out.println(Arrays.toString(test.list));
		System.out.print("성적 = " +  (test.answerCnt*20) + "점");
		
	}

}

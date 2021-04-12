package step6_01.classObject;
//2021/04/12 16:12 ~ 17:04

import java.util.Random;
import java.util.Scanner;

class Ex04_1 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_내정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex04_1 e = new Ex04_1();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for(int i=0; i<e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i] + " ");
		}
		
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int total = 0;
		double average = 0.0;
		for(int i=0; i<e.scores.length; i++) {
			total += e.scores[i];
		}
		average = total / (double) e.hakbuns.length;
		
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + average);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int count = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				count ++;
			}
		}
		System.out.println("합격생 수 = " + count + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.print("인덱스 입력: ");
		int index = scan. nextInt();
		
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[index] == e.scores[i]) {
				System.out.println("성적: " + e.scores[i]);
			}
		}
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력: ");
		int grade = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(grade == e.scores[i]) {
				System.out.println("인덱스: " + i);
			}
		}
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.print("학번 입력: ");
		int hakbun = scan.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == hakbun) {
				System.out.println("성적: " + e.scores[i]);
			}
		}
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번 입력: ");
		int hakbun02 = scan.nextInt();
		
		int check = -1;
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == hakbun02) {
				check = i;
			}
		}
		
		if(check == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		else {
			System.out.println(e.scores[check]);
		}
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int grade1st = 0;
		int hakbun1st = 0;
		for(int i=0; i<e.hakbuns.length; i++) {
			if(grade1st < e.scores[i]) {
				grade1st = e.scores[i];
				hakbun1st = i;
			}
		}
		System.out.println(hakbun1st+"번" + "(" + grade1st + ")");
		
	}

}

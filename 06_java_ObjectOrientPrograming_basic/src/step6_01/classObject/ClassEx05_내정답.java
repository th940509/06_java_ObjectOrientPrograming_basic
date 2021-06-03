package step6_01.classObject;
//2021/04/12 17:00 ~ 17:28

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_1{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_내정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_1 mega = new Ex05_1();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				for(int i=0; i<mega.arHakbun.length; i++) {
					System.out.println("학번: " + mega.arHakbun[i] + "/" + "성적: " + mega.arScore[i]);
				}
			}
			
			else if (choice == 2) {
				int maxidx = 0;
				int maxscore = 0;
				
				for(int i=0; i<mega.arScore.length; i++) {
					if(maxscore<mega.arScore[i]) {
						maxscore = mega.arScore[i];
						maxidx = i;
					}
				}
				System.out.println("1등 학생 성적: " + mega.arScore[maxidx]);
			}
			
			else if (choice == 3) {
				int minidx = 0;
				int minscore = mega.arScore[0];
				
				for(int i=1; i<mega.arScore.length; i++) {
					if(minscore>mega.arScore[i]) {
						minscore = mega.arScore[i];
						minidx = i;
					}
				}
				System.out.println("꼴등 학생 성적: " + mega.arScore[minidx]);
			}
			else if (choice == 4) {
				
				System.out.println("학번 입력: ");
				int hakbun = scan.nextInt();
				
				for(int i=0; i<mega.arScore.length; i++) {
					if(mega.arHakbun[i] == hakbun) {
						System.out.println("성적: " + mega.arScore[i]);
					}
				}
				
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}

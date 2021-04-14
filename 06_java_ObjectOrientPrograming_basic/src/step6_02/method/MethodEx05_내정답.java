package step6_02.method;
//2021/04/14 16:20 ~ 16:38
import java.util.Scanner;

class Ex05_1{

	void test1() {
		int total = 0;
		for(int i=0; i<=5; i++) {
			total +=i;
		}
		System.out.println("total =" + total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		for(int i=0; i<3; i++) {
			System.out.print( "정수 입력: ");
			arr[i] = scan.nextInt();
		}
		
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum =arr[i];
			}
		}
		
		System.out.println("최대값= " + maxNum );
	
		scan.close();
	}
	
}


public class MethodEx05_내정답 {

	public static void main(String[] args) {

		
			Ex05_1 e = new Ex05_1();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}

package step6_01.classObject;
//2021/04/12 16:00 ~16:11

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_1{
int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_내정답 {

	public static void main(String[] args) {
		
		Ex03_1 e = new Ex03_1();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for (int i=0; i<e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println("전체의 합 = " + total);
		System.out.println();
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		total = 0;
		for (int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 ==0) {
				total += e.arr[i];
			}
		}
		System.out.println("4의 배수의 합 = " + total);
		System.out.println();
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 4 ==0) {
				count ++;
			}
		}
		System.out.println("4의 배수의 개수 = " + count);
		System.out.println();
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				count ++;
			}
		}
		System.out.println("짝수의 개수 = " + count);

	}

}

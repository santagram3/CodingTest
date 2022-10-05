package Programers.LV0;

public class Namugiguhagi {
	// 나머지구하기 
	public static void main(String[] args) {
//		정수 num1, num2가 매개변수로 주어질 때,
//		num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
//		0 < num1 ≤ 100
//		0 < num2 ≤ 100
		Namugiguhagi na = new Namugiguhagi();
		int x = na.solution(99,50);
		System.out.println(x);
		
		// 정답 
//		int answer = num1%num2;
		
	}
	
	public int solution(int num1, int num2) {
		int answer = num1%num2;
        return answer;
    }


}

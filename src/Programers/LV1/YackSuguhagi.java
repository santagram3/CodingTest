package Programers.LV1;

// 약수의 합 
public class YackSuguhagi {


	public static void main(String[] args) {
		int x =YackSuguhagi.solution(12);
		System.out.println(x);
	}
	
	public static int solution(int a) {
		int sum = 0; 
		for (int i = 1; i <= a; i++) {
			if(a%i == 0) {
				sum+=i;
				System.out.println(i);
			}
			
		}
			System.out.println("sum = " + sum);
		return sum;
		
		
		
	}
	
	
	

}

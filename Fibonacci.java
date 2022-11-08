//2. 피보나치 수열 출력하기 (100이하의 정수)
//		0 1 1 2 3 5 8 13 21 34 ...
public class Fibonacci{
	public static void main(String[] args){
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
			
		for (int i = 0; i <= 100; i++){
			if (num1 +num2 == num3){
				num3 = num1 + num2;
				num1 = num3;
				System.out.println(num1);
			}
		}
	}
}
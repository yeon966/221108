// 사용자가 입력한 5개의 정수 중
// 가장 큰 값을 출력해보세요.
import java.util.Scanner;
public class ForTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num2 = 0;
		int num3 = 0;
		for (int i = 1; i <= 5; i++){
			System.out.print("5개의 정수 중 " + i + "번째 정수을 입력하세요.");
			int num = input.nextInt();
			if (num >= num2) {
				num2 = num;
			} else if () {
				
			}
		}
		System.out.println("가장 큰 정수는 : " + num3);
	}
}
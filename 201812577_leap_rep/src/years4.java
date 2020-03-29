import java.util.Scanner;

public class years4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("년도 입력 : ");
			int year = sc.nextInt();
			
			if(year < 0) {
				System.out.println("0보다 작은 숫자가 입력되어 종료");
				break;
			}
			
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "년은 윤년");
			} else {
				System.out.println(year + "년은 평년");
			}
		}
	}
}
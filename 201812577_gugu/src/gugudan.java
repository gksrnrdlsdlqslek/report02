import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.print("(1~9사이)단수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		System.out.println(dan + "단.");
		for(num=1; num<10; num++)
			System.out.println(dan + " x " + num + " = " + (dan * num));
	}

}

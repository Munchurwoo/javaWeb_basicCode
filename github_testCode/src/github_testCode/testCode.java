package github_testCode;

import java.util.Scanner;

public class testCode {
	public static void main(String[] args) {

		String name[] = { "문철우", "김명섭", "김인섭" };
		int score[] = new int[3];
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("다음중 원하는 출력 결과를 작성하세요.\n 1. 새로운 점수 입력\n 2. 평균출력\n 3. 종료");
			int select = scan.nextInt();
			if(select==3) {
				break;
			}
			switch (select) {
			case 1:
				System.out.println("점수 입력 창입니다.");
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i]+"님의 점수를 입력하세요.");
					score[i]=scan.nextInt();
				}
				break;
			case 2:
				System.out.println("평균 점수는 : " + (score[0]+score[1]+score[2])/3+"입니다.");
				break;
			default :
				break;
			}
		}
	
	}
}

package github_testCode;

import java.util.Scanner;

public class testCode {
	public static void main(String[] args) {

		String name[] = { "��ö��", "�����", "���μ�" };
		int score[] = new int[3];
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("������ ���ϴ� ��� ����� �ۼ��ϼ���.\n 1. ���ο� ���� �Է�\n 2. ������\n 3. ����");
			int select = scan.nextInt();
			if(select==3) {
				break;
			}
			switch (select) {
			case 1:
				System.out.println("���� �Է� â�Դϴ�.");
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i]+"���� ������ �Է��ϼ���.");
					score[i]=scan.nextInt();
				}
				break;
			case 2:
				System.out.println("��� ������ : " + (score[0]+score[1]+score[2])/3+"�Դϴ�.");
				break;
			default :
				break;
			}
		}
	
	}
}
package sandwich;

import java.util.Scanner;
import sandwich.MenuName;

public class SandwichOrder {

	public static void main(String[] args) {
		
		//������ġ �޴� ����
		System.out.println("<������ġ �޴�>");
		
//		MenuName mn=new MenuName();
//		mn.sandwichMenu();
		
		MenuName mn=new MenuName();
		mn.sandwichMenu("1.���� �ƺ�ī��", 4100, 7600);
		mn.sandwichMenu("2.�ν�Ʈ ġŲ �ƺ�ī��", 6400, 11600);
		mn.sandwichMenu("3.��Ű ������ �ƺ�ī��", 6900, 12200);
		mn.sandwichMenu("4.��Ƽ���� �ٺ�ť ġŲ", 6400, 11600);
		mn.sandwichMenu("5.������ũ&ġ��", 6900, 12200);
		mn.sandwichMenu("6.K-�ٺ�ť", 6400, 11600);
		mn.sandwichMenu("7.���� ��ũ �ٺ�ť", 6300, 11400);
		mn.sandwichMenu("8.������ Ŭ��", 6200, 11200);
		mn.sandwichMenu("9.������", 6200, 11200);
		mn.sandwichMenu("10.�����̽� ��Ż����", 6000, 11000);
		mn.sandwichMenu("11.ġŲ �����߳�", 6000, 11000);
		mn.sandwichMenu("12.��Ƽ", 5700, 10400);
		mn.sandwichMenu("13.��Ż���Ⱥ�Ƽ", 5700, 10400);
		mn.sandwichMenu("14.��Ʈ��", 5600, 10300);
		mn.sandwichMenu("15.��Ű", 5600, 10300);
		mn.sandwichMenu("16.��ġ", 4900, 9400);
		mn.sandwichMenu("17.���׸���", 4600, 8500);
		mn.sandwichMenu("18.����", 4100, 7600);
		
		for(; ;) {
			System.out.print("\n�޴��� �������ּ���. ");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			
			if(num1>18) {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}else { break; }
		}
		
		//�� ���� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("�� ���̸� �������ּ���.\n");
		Length len=new Length();
		len.selectLen(15, 30);
		
		for(; ;) {
			System.out.print("\n�� ���� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num2=sc.nextInt();
			
			if(num2>2) {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}else { break; }
		}
		
		//�� ���� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("���� �������ּ���.\n");
		Bread br=new Bread();
		br.breadName("1.ȭ��Ʈ");
		br.breadName("2.�ĸ��� ��������");
		br.breadName("3.��Ʈ");
		br.breadName("4.��Ͽ�Ʈ");
		br.breadName("5.��Ƽ");
		br.breadName("6.�÷��극��");
		
		for(; ;) {
			System.out.print("\n�� ���� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num3=sc.nextInt();
			
			if(num3>6) {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}else{ break; }
		}
		
		//�佺�� ���� Ȯ��
		System.out.println("\n--------------------------------------\n");
		System.out.println("�佺�� �Ͻðڽ��ϱ�?\n");
		System.out.print("1.�佺�� �Ѵ�  ");
		System.out.println("2.�佺�� �� �Ѵ�");
		for(; ;) {
			System.out.print("\n�佺�� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num4=sc.nextInt();
			
			if(num4>2) {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}else { break; }
		}
		
		
		//ġ�� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("ġ� �������ּ���.\n");
		Cheese ch=new Cheese();
		ch.selectCh("1.�Ƹ޸�ĭġ��");
		ch.selectCh("2.������ġ��");
		ch.selectCh("3.��������ġ��");
		ch.selectCh("4.ġ������");
		
		for(; ;) {
			System.out.print("\nġ�� ���� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num5=sc.nextInt();
			
			if(num5>4) {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}else { break; }
		}
		
		//��ä ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("���ϴ� ��ä�� �������ּ���\n");
		Vegetable ve=new Vegetable();
		System.out.print("<����ä> ");
		ve.vegetable("1.����� ");
		ve.vegetable("2.�丶�� ");
		ve.vegetable("3.���� ");
		ve.vegetable("4.�Ǹ� ");
		ve.vegetable("5.����\n");
		System.out.print("<���ӷ�> ");
		ve.vegetable("6.��Ŭ ");
		ve.vegetable("7.�ø��� ");
		ve.vegetable("8.�Ҷ��Ǵ�\n");
		System.out.print("<���þ���> ");
		ve.vegetable("9.��� ��ä ����\n");
		ve.vegetable("10.���ÿϷ�\n");
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int count = 1;
		while(count<=9) {
			System.out.print("��ä ���� "+count+" : ");
			int num6=sc.nextInt();
			if(num6==9 || num6==10) {
				break;
			}
			else if(num6>10) {
				System.out.println("\n�ٽ� �������ּ���.\n");
				continue;
			}
			else { count++; }
			System.out.println();
		}
		
		//�ҽ�&����� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("�ҽ�/������� �������ּ���.(3������ ���� ����)\n");
		Sauce sa=new Sauce();
		sa.sauce("1.�˽��� �ӽ�Ÿ��");
		sa.sauce("2.��ŭ�� ��Ż���ȵ巹��");
		sa.sauce("3.������ ������ν���");
		sa.sauce("4.������ ����Ʈ ��Ͼ�");
		sa.sauce("5.���޴����� ��� �ӽ�Ÿ��");
		sa.sauce("6. ���޴����� ������ ĥ��");
		sa.sauce("7.����ũ �� ����ũ �ٺ�ť");
		sa.sauce("8.ũ������ ��ġ");
		sa.sauce("9.����� �������");
		sa.sauce("10.ȭ���ϰ� �ſ� �� ĥ��");
		sa.sauce("11.�̱������� ������ ��콺 ����Ʈ ġ����");
		sa.sauce("12.�˽��� Ȧ������");
		sa.sauce("13.���¸� ����Ʈ����� �ø��� ����");
		sa.sauce("14.�ұ�");
		sa.sauce("15.����");
		sa.sauce("16.���þ���");
		sa.sauce("17.���ÿϷ�");
		
		System.out.println();
		Scanner scan=new Scanner(System.in);
		int count2 = 1;
		while(count2<=3) {
			System.out.print("�ҽ�/����� ���� "+count2+" : ");
			int num7=scan.nextInt();
			if(num7==16 || num7==17) {
				break;
			}
			else if(num7>17) {
				System.out.println("\n�ٽ� �������ּ���.\n");
				continue;
			}
			else { count2++; }
			System.out.println();
		}
		
		System.out.println("\n�ֹ��� �Ϸ�Ǿ����ϴ�.");
		
		
	}

}

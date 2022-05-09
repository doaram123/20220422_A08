package sandwich;

import java.util.Scanner;

public class SandwichOrder {

	public static void main(String[] args) {
		
		//������ġ �޴� ����
		System.out.println("<������ġ �޴�>");
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
			
			if(num1<19) {
				for(int mnum=1;mnum<19;mnum++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		//�� ���� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("�� ���̸� �������ּ���. ");
		Length len=new Length();
		len.selectLen(15, 30);
		
		for(; ;) {
			System.out.print("\n�� ���� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num2=sc.nextInt();
			
			if(num2<3) {
				for(int blen=1;blen<3;blen++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		//�� ���� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("���� �������ּ���.");
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
			
			if(num3<7) {
				for(int bkind=1;bkind<7;bkind++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		//�佺�� ���� Ȯ��
		System.out.println("\n--------------------------------------\n");
		System.out.println("�佺�� �Ͻðڽ��ϱ�?");
		System.out.print("1.�佺�� �Ѵ�  ");
		System.out.println("2.�佺�� �� �Ѵ�");
		for(; ;) {
			System.out.print("\n�佺�� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num4=sc.nextInt();
			
			if(num4<3) {
				for(int toast=1;toast<3;toast++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		
		//ġ�� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("ġ� �������ּ���.");
		Cheese ch=new Cheese();
		ch.selectCh("1.�Ƹ޸�ĭġ��");
		ch.selectCh("2.������ġ��");
		ch.selectCh("3.��������ġ��");
		ch.selectCh("4.ġ������");
		
		for(; ;) {
			System.out.print("\nġ�� ���� ���� : ");
			Scanner sc=new Scanner(System.in);
			int num4=sc.nextInt();
			
			if(num4<5) {
				for(int bkind=1;bkind<5;bkind++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		
		//��ä ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("���ϴ� ��ä�� �������ּ���");
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
		ve.vegetable("9.��� ��ä ����");
		
		for(; ;) {
			System.out.print("\n��ä ���� : ");
			Scanner sc=new Scanner(System.in);
			int num5=sc.nextInt();
			
			if(num5<10) {
				for(int veget=1;veget<10;veget++) {
				}
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				continue;
			}
		}
		
		//�ҽ�&����� ����
		System.out.println("\n--------------------------------------\n");
		System.out.println("�ҽ�/������� �������ּ���.");
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
		
		int num6 = 0;
		int i=1;
		while(i<4) {
			if(num6<17) {
				System.out.print("\n�ҽ�/����� ����"+i+" : ");
				Scanner sc=new Scanner(System.in);
				num6=sc.nextInt();
				num6=sc.nextInt();
			}else if(num6==16){
				break;
			}else {
				System.out.println("\n�ٽ� �������ּ���.");
				System.out.print("\n�ҽ�/����� ����"+i+" : ");
				Scanner sc=new Scanner(System.in);
			}
			i++;
		}
		
//		for(; ;) {
//			System.out.println("\n�ҽ�/����� ���� : ");
//			Scanner sc=new Scanner(System.in);
//			int num6=sc.nextInt();
//			int num7=sc.nextInt();
//			int num8=sc.nextInt();
//			
//			if(num6==16) {
//				break;
//			}else if(num6<15) {
//				for(int sauce=1;sauce<15;sauce++) {
//				}
//				break;
//			}else if(num7>num6 && num7<15) {
//				for(int sauce=1;sauce<15;sauce++) {
//					System.out.println();
//				}
//				break;
//			}
//			else if(num8>num7 && num8<15) {
//				for(int sauce=1;sauce<15;sauce++) {
//					System.out.println();
//				}
//				break;
//			}else {
//				System.out.println("\n�ٽ� �������ּ���.\n");
//				continue;
//			}
//		}
		
		
	}

}

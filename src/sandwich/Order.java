package sandwich;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		//������ġ �޴� ����
		System.out.println("<������ġ �޴�>");
		String[] mn=new String[] {"1.���� �ƺ�ī�� - 15cm:4,100�� 30cm:7,600��", "2.�ν�Ʈ ġŲ �ƺ�ī�� - 15cm:6,400�� 30cm:11,600��",
								"3.��Ű ������ �ƺ�ī�� - 15cm:6,900�� 30cm:12,200��", "4.��Ƽ���� �ٺ�ť ġŲ - 15cm:6,400�� 30cm:11,600��",
								"5.������ũ&ġ�� - 15cm:6,900�� 30cm:12,200��", "6.K-�ٺ�ť - 15cm:6,400�� 30cm:11,600��",
								"7.���� ��ũ �ٺ�ť - 15cm:6,300�� 30cm:11,400��", "8.������ Ŭ�� - 15cm:6,200�� 30cm:11,200��",
								"9.������ - 15cm:6,200�� 30cm:11,200��", "10.�����̽� ��Ż���� - 15cm:6,000�� 30cm:11,000��",
								"11.ġŲ �����߳� - 15cm:6,000�� 30cm:11,000��", "12.��Ƽ - 15cm:5,700�� 30cm:10,400��",
								"13.��Ż���Ⱥ�Ƽ - 15cm:5,700�� 30cm:10,400��", "14.��Ʈ�� - 15cm:5,600�� 30cm:10,300��",
								"15.��Ű - 15cm:5,600�� 30cm:10,300��", "16.��ġ - 15cm:4,900�� 30cm:9,400��",
								"17.���׸��� - 15cm:4,600�� 30cm:8,500��", "18.���� - 15cm:4,100�� 30cm:7,600��"};
		for(int i=0;i<mn.length;i++) {
			System.out.println(mn[i]);
		}
		
		System.out.println();
		
		for(; ;) {
			System.out.print("�޴��� �������ּ���. ");
			Scanner sc1=new Scanner(System.in);
			int num1=sc1.nextInt();
			
			if(num1<20) {
				for(int mnum=1;mnum<20;mnum++) {
					System.out.println();
				}
				break;
			}else {
				System.out.println();
				System.out.println("�ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			
		}
		
		//�� ���� ����
		System.out.println("�� ���� �������ּ���.");
		System.out.println("1. 15cm");
		System.out.println("2. 30cm");
		
		System.out.println();
		
		System.out.print("�� ���� ���� : ");
		Scanner sc2=new Scanner(System.in);
		int num2=sc2.nextInt();
		
		System.out.println();
		//�� ���� ����
		System.out.println("�� ������ �������ּ���");
		
		String[] br= {"1.ȭ��Ʈ", "2.�ĸ��� ��������", "3.��Ʈ", "4.��Ͽ�Ʈ", "5.��Ƽ", "6.�÷��극��"};
		
		for(int i=0;i<br.length;i++) {
			System.out.println(br[i]);
		}
		
		System.out.println();
		System.out.print("�� ���� : ");
		Scanner sc3=new Scanner(System.in);
		int num3=sc3.nextInt();
		
		System.out.println();
		//�佺�� ���� Ȯ��
		Scanner sc4=new Scanner(System.in);
		
		System.out.print("�佺�� �Ͻðڽ��ϱ�?(Y/N) ");
		String str1=sc4.nextLine();
		
		System.out.println();
		//ġ�� ����
		String[] ch = {"1.�Ƹ޸�ĭġ��", "2.������ġ��", "3.��������ġ��", "4.ġ�� ����"};
		
		System.out.println("ġ� �����ϼ���.");
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println();
		System.out.print("ġ�� ���� : ");
		Scanner sc5=new Scanner(System.in);
		int num5=sc5.nextInt();
		
		System.out.println();
		//��ä ����
		System.out.println("���ϴ� ��ä�� �����Ͽ� �ּ���.");
		
		String[][] vt1= {{"<����ä>"}, {"1.�����", "2.�丶��", "3.����", "4.�Ǹ�", "5.����"}};
		String[][] vt2= {{"<���ӷ�>"}, {"6.��Ŭ", "7.�ø���", "8.�Ҷ��Ǵ�"}};
		String[][] vt3= {{"<���� ����>"}, {"9.��� ��ä ����"}};
		
		for(int i=0;i<vt1.length;i++) {
			String[] inArr1=vt1[i];
			for(int j=0;j<inArr1.length;j++) {
				System.out.print(inArr1[j]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<vt2.length;i++) {
			String[] inArr2=vt2[i];
			for(int j=0;j<inArr2.length;j++) {
				System.out.print(inArr2[j]+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<vt3.length;i++) {
			String[] inArr3=vt3[i];
			for(int j=0;j<inArr3.length;j++) {
				System.out.print(inArr3[j]+" ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("��ä ����: ");
		Scanner sc6=new Scanner(System.in);
		int num6=sc6.nextInt();
		
		System.out.println();
		//�ҽ�, ����� ����
		System.out.println("�ҽ�/������� �����Ͽ� �ּ���.");
		String[] sauce= {"1.�˽��� �ӽ�Ÿ��", "2.��ŭ�� ��Ż���ȵ巹��", "3.������ ������� ����", "4.������ ����Ʈ ��Ͼ�",
						"5.���޴����� ��� �ӽ�Ÿ��", "6.���޴����� ����Ʈ ĥ��", "7.����ũ �� ����ũ �ٺ�ť", "8.ũ������ ��ġ",
						"9.����� �������", "10.ȭ���ϰ� �ſ� �� ĥ��", "11.�̱������� ������ ��콺 ����Ʈ ġ����", "12.�˽��� Ȧ������",
						"13.���¸� ����Ʈ����� �ø��� ����", "14.�ұ�", "15.����", "16.���þ���"};
		
		for(int i=0;i<sauce.length;i++) {
			System.out.println(sauce[i]);
		}
		
		System.out.println();
		System.out.print("�ҽ�/����� ���� : ");
		
		Scanner sc7=new Scanner(System.in);
		int num7=sc7.nextInt();
	}
}

package sandwich;

import java.util.Scanner;

public class SubwayOrder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.in�� Ű���带 �ǹ��Ѵ�!
		
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. ��Ű ������ �ƺ�ī�� - 15cm 6,900�� 30cm 12,200����");
		System.out.println("2. ��Ƽ���� �ٺ�ť ġŲ - 15cm 6,400�� 30cm 11,600��");
		System.out.println("3. ������ũ & ġ�� - 15cm 6,900�� 30cm 12,200��");
		System.out.println("4. K-�ٺ�ť - 15cm 6,400�� 30cm 11,600��");
		System.out.println("5. Ǯ�� ��ũ �ٺ�ť - 15cm 6,300�� 30cm 11,400��");
		System.out.println("6. ������ Ŭ�� - 15cm 6,200�� 30cm 11,200��");
		System.out.println("7. ������ - 15cm 6,200�� 30cm 11,200��");
		System.out.println("8. �����̽� ��Ż���� - 15cm 6,000�� 30cm 11,000��");
		System.out.println("9. ġŲ �����߳� - 15cm 6,000�� 30cm 11,000��");
		System.out.println("10. ��Ƽ - 15cm 5,700�� 30cm 10,400��");
		System.out.println("11. ��Ż���Ⱥ�Ƽ - 15cm 6,400�� 30cm 11,600��");
		System.out.println("12. ��Ʈ�� - 15cm 5,600�� 30cm 10,300��");
		System.out.println("13. ��Ű - 15cm 5,600�� 30cm 10,300��");
		System.out.println("14. ��ġ - 15cm 4,900�� 30cm 9,400��");
		System.out.println("15. �� - 15cm 4,900��	 30cm 9,400��");
		System.out.println("16. ���׸��� - 15cm 4,600�� 30cm 8,500��");
		System.out.println("17. ���� - 15cm 4,100�� 30cm 7,600��");
		System.out.println("18. �ν�Ʈ ġŲ - 15cm 6,400�� 30cm 11,600��");
		System.out.print("������ġ ����: ");
		int menuNo = sc.nextInt();
		
		System.out.println();
//		�ڹ� �ٹٲ�
		System.out.println("*** �� ���� ���� ***");
		System.out.println("1. 15cm");
		System.out.println("2. 30cm");
		System.out.print("�� ���� ����: ");
		int menuNo1 = sc.nextInt();
		String breadLength;
		if(menuNo1==1) {
			breadLength="15cm";
		}else {
			breadLength="30cm";
		}
//		�������� �߰����� �� 41~46
		
		System.out.println();
		System.out.println("*** �� ���� ***");
//		System.out.println("1. ȭ��Ʈ");
//		System.out.println("2. �ĸ��� ��������");
//		System.out.println("3. ��Ʈ");
//		System.out.println("4. ��Ͽ�Ʈ");
//		System.out.println("5. ��Ƽ");
//		System.out.println("6. �÷��귡��");
//		System.out.print("�� ����: ");
		String[] arr= {"1.ȭ��Ʈ", "2.�ĸ��� ��������", "3.��Ʈ", "4.��Ͽ�Ʈ", "5.��Ƽ", "6.�÷��극��"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("�� ����: ");
//		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
//		int menuNo2 = sc.nextInt();
		String bread="";
//		if else �� ���� String ���� ���İ� ���� �ٸ�!
		switch(num1) {
		case 1 : 
			bread = "ȭ��Ʈ";
			break;
		case 2 : 
			bread = "�ĸ��� ��������";
			break;
		case 3 : 
			bread = "��Ʈ";
			break;
		case 4 : 
			bread = "��Ͽ�Ʈ";
			break;
		case 5 : 
			bread = "��Ƽ";
			break;
		case 6 : 
			bread = "�÷��귡��";
			break;
		default :
			System.out.println("�����Ͻ� ���� ���� �޴��Դϴ�.");
//		�� ���̰� 30cm�� �� ������ ��� �����ϳ���?
	}
		
		System.out.println();
		System.out.println("*** �佺�� ���� ***");
		System.out.println("1. ����");
		System.out.println("2. �佺�� �ϱ�");
		System.out.print("�佺�� ����: ");
		int menuNo3 = sc.nextInt();
		String toasting;
		if(menuNo3==1) {
			toasting="����";
		}else {
			toasting="�佺�� �ϱ�";
		}
		
		System.out.println();
		System.out.println("*** ġ�� ���� ***");
//		System.out.println("1. �Ƹ޸�ĭġ��");
//		System.out.println("2. ������ġ��");
//		System.out.println("3. ��������ġ��");
//		System.out.println("4. ġ������");
//		System.out.print("ġ�� ����: ");
		String[] arr1 = {"1.�Ƹ޸�ĭġ��", "2.������ġ��", "3.��������ġ��", "4.ġ�� ����"};
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
		}
		System.out.print("ġ�� ����: ");
		int num2=sc.nextInt();
//		int menuNo4 = sc.nextInt();
		String cheese="";
//		if else �� ���� String ���� ���İ� ���� �ٸ�!
		switch(num2) {
		case 1 : 
			cheese = "�Ƹ޸�ĭġ��";
			break;
		case 2 : 
			cheese = "������ġ��";
			break;
		case 3 : 
			cheese = "��������ġ��";
			break;
		case 4 : 
			cheese = "ġ������";
			break;
		default :
			System.out.println("�����Ͻ� ġ��� ���� �޴��Դϴ�.");
	}
		
		System.out.println();
		System.out.println("*** ��ä ���� ***");
		System.out.println("1. �����");
		System.out.println("2. �丶��");
		System.out.println("3. ����");
		System.out.println("4. �Ǹ�");
		System.out.println("5. ����");
		System.out.println("6. ��Ŭ");
		System.out.println("7. �ø���");
		System.out.println("8. �Ҷ��Ǵ�");
		System.out.println("9. ��� ��ä ����");
		System.out.print("��ä ����: ");
		int menuNo5 = sc.nextInt();
		String vegetable;
		if(menuNo5==1)
			vegetable="�����";
		else if(menuNo5==2)
			vegetable="�丶��";
		else if(menuNo5==3)
			vegetable="����";
		else if(menuNo5==4)
			vegetable="�Ǹ�";
		else if(menuNo5==5)
			vegetable="����";
		else if(menuNo5==6)
			vegetable="��Ŭ";
		else if(menuNo5==7)
			vegetable="�ø���";
		else if(menuNo5==8)
			vegetable="�Ҷ��Ǵ�";
		else if(menuNo5==9)
			vegetable="��� ��ä ����";
		else
			vegetable="�����Ͻ� ��ä�� ���� �޴��Դϴ�.";
//		���� ������ ��� �ϳ���?
//		switch break �� ���ٴ� if else if else �� ��� ��õ
		
		System.out.println();
		System.out.println("*** �ҽ�/����� ���� ***");
		System.out.println("1. �˽��� �ӽ�Ÿ��");
		System.out.println("2. ��ŭ�� ��Ż���ȵ巹��");
		System.out.println("3. ������ ������ν���");
		System.out.println("4. ������ ����Ʈ ��Ͼ�");
		System.out.println("5. ���޴����� ��� �ӽ�Ÿ��");
		System.out.println("6. ���޴����� ����Ʈ ĥ��");
		System.out.println("7. ����ũ �� ����ũ �ٺ�ť");
		System.out.println("8. ũ������ ��ġ");
		System.out.println("9. ����� �������");
		System.out.println("10. ȭ���ϰ� �ſ� �� ĥ��");
		System.out.println("11. �̱������� ������ ��콺 ����Ʈ ġ����");
		System.out.println("12. �˽��� Ȧ������");
		System.out.println("13. ���¸� ����Ʈ����� �ø��� ����");
		System.out.println("14. �ұ�");
		System.out.println("15. ����");
		System.out.println("16. ���þ���");
		System.out.print("�ҽ�/����� ����: ");
		int menuNo6 = sc.nextInt();
		String sauce;
		if(menuNo5==1)
			sauce="�˽��� �ӽ�Ÿ��";
		else if(menuNo5==2)
			sauce="��ŭ�� ��Ż���ȵ巹��";
		else if(menuNo5==3)
			sauce="������ ������ν���";
		else if(menuNo5==4)
			sauce="������ ����Ʈ ��Ͼ�";
		else if(menuNo5==5)
			sauce="���޴����� ��� �ӽ�ŸƮ";
		else if(menuNo5==6)
			sauce="���޴����� ����Ʈ ĥ��";
		else if(menuNo5==7)
			sauce="����ũ �� ����ũ �ٺ�ť";
		else if(menuNo5==8)
			sauce="ũ������ ��ġ";
		else if(menuNo5==9)
			sauce="����� �������";
		else if(menuNo5==10)
			sauce="ȭ���ϰ� �ſ� �� ĥ��";
		else if(menuNo5==11)
			sauce="�̱������� ������ ��콺 ����Ʈ ġ����";
		else if(menuNo5==12)
			sauce="�˽��� Ȧ������";
		else if(menuNo5==13)
			sauce="���¸� ����Ʈ����� �ø��� ����";
		else if(menuNo5==14)
			sauce="�ұ�";
		else if(menuNo5==15)
			sauce="����";
		else if(menuNo5==16)
			sauce="���þ���";
		else
			sauce="�����Ͻ� �ҽ�/������� ���� �޴��Դϴ�.";
//		3������ ����/3�� �̻� ���ý� '�ҽ�/������� 3������ ���ð����մϴ�!' �˸�
		
		System.out.println();
		System.out.print("�ֹ� ���� >>> ");
		int amount = sc.nextInt();
		
		System.out.println();
		System.out.print("�Աݾ� >>> ");
		int money = sc.nextInt();
		
		System.out.println();
		
		String subwayStr = ""; // ������ġ ������ ����� ����
		int price = 0; // ������ġ �ܰ��� ����� ����
		
		switch(menuNo) {
			case 1 : 
				subwayStr = "��Ű ������ �ƺ�ī��";
				price = 6900 ;
				break;
			case 2 : 
				subwayStr = "��Ƽ���� �ٺ�ť ġŲ";
				price = 6400;
				break;
			case 3 : 
				subwayStr = "������ũ & ġ��";
				price = 6900;
				break;
			case 4 : 
				subwayStr = "K-�ٺ�ť";
				price = 6400;
				break;
			case 5 : 
				subwayStr = "Ǯ�� ��ũ �ٺ�ť";
				price = 6300;
				break;
			case 6 : 
				subwayStr = "������ Ŭ��";
				price = 6200;
				break;
			case 7 : 
				subwayStr = "������";
				price = 6200;
				break;
			case 8 : 
				subwayStr = "�����̽� ��Ż����";
				price = 6000;
				break;
			case 9 : 
				subwayStr = "ġŲ �����߳�";
				price = 6000;
				break;
			case 10 : 
				subwayStr = "��Ƽ";
				price = 5700;
				break;
			case 11 : 
				subwayStr = "��Ż���Ⱥ�Ƽ";
				price = 6400;
				break;
			case 12 : 
				subwayStr = "��Ʈ��";
				price = 5600;
				break;
			case 13 : 
				subwayStr = "��Ű";
				price = 5600;
				break;
			case 14 : 
				subwayStr = "��ġ";
				price = 4900;
				break;
			case 15 : 
				subwayStr = "��";
				price = 4900;
				break;
			case 16 : 
				subwayStr = "���׸���";
				price = 4600;
				break;
			case 17 : 
				subwayStr = "����";
				price = 4100;
				break;
			case 18 : 
				subwayStr = "�ν�Ʈ ġŲ";
				price = 6400;
				break;
			
			default :
				System.out.println("�����Ͻ� ������ġ�� ���� �޴��Դϴ�.");
//			�� ���̰� 30cm�� �� ������ ��� �����ϳ���?
		}
	
	// ���ް��� ���(�ܰ�*����)
		int sum = (price * amount);
		
		// �ΰ����� ���((�ܰ�*����) * 0.1)
		int vat = (int) (sum * 0.1);
		
		// �ѱݾ� ���(���ް��� + �ΰ�����)
		int total = sum + vat;
		
		// �ܾ�(�Ž�����) ���(�Աݾ� - �ѱݾ�)
		int change = money - total;
		
		// ȭ�鿡 ����� ����.
		System.out.println("�޴� : " + subwayStr);
		System.out.println("�� ���� : " + breadLength);
		System.out.println("�� : " + bread);
		System.out.println("�佺�� : " + toasting);
		System.out.println("ġ�� : " + cheese);
		System.out.println("��ä : " + vegetable);
		System.out.println("�ҽ�/����� : " + sauce);
		System.out.printf("������ġ�ܰ� : %,d��\n", price);
		System.out.printf("�ֹ����� : %,d\n", amount);
		System.out.printf("�Աݾ� : %,d��\n", money);
		System.out.printf("���ް��� : %,d��\n", sum);
		System.out.printf("�ΰ����� : %,d��\n", vat);
		System.out.printf("�ѱݾ� : %,d��\n", total);
		System.out.printf("�Ž����� : %,d��\n", change);
		
		sc.close();
	}
}

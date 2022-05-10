package sandwich;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		//샌드위치 메뉴 선택
		System.out.println("<샌드위치 메뉴>");
		String[] mn=new String[] {"1.베지 아보카도 - 15cm:4,100원 30cm:7,600원", "2.로스트 치킨 아보카도 - 15cm:6,400원 30cm:11,600원",
								"3.터키 베이컨 아보카도 - 15cm:6,900원 30cm:12,200원", "4.로티세리 바비큐 치킨 - 15cm:6,400원 30cm:11,600원",
								"5.스테이크&치즈 - 15cm:6,900원 30cm:12,200원", "6.K-바비큐 - 15cm:6,400원 30cm:11,600원",
								"7.폴드 포크 바비큐 - 15cm:6,300원 30cm:11,400원", "8.써브웨이 클럽 - 15cm:6,200원 30cm:11,200원",
								"9.쉬림프 - 15cm:6,200원 30cm:11,200원", "10.스파이시 이탈리안 - 15cm:6,000원 30cm:11,000원",
								"11.치킨 데리야끼 - 15cm:6,000원 30cm:11,000원", "12.비엘티 - 15cm:5,700원 30cm:10,400원",
								"13.이탈리안비엠티 - 15cm:5,700원 30cm:10,400원", "14.미트볼 - 15cm:5,600원 30cm:10,300원",
								"15.터키 - 15cm:5,600원 30cm:10,300원", "16.참치 - 15cm:4,900원 30cm:9,400원",
								"17.에그마요 - 15cm:4,600원 30cm:8,500원", "18.베지 - 15cm:4,100원 30cm:7,600원"};
		for(int i=0;i<mn.length;i++) {
			System.out.println(mn[i]);
		}
		
		System.out.println();
		
		for(; ;) {
			System.out.print("메뉴를 선택해주세요. ");
			Scanner sc1=new Scanner(System.in);
			int num1=sc1.nextInt();
			
			if(num1<20) {
				for(int mnum=1;mnum<20;mnum++) {
					System.out.println();
				}
				break;
			}else {
				System.out.println();
				System.out.println("다시 선택해주세요.");
				System.out.println();
				continue;
			}
			
		}
		
		//빵 길이 선택
		System.out.println("빵 길이 선택해주세요.");
		System.out.println("1. 15cm");
		System.out.println("2. 30cm");
		
		System.out.println();
		
		System.out.print("빵 길이 선택 : ");
		Scanner sc2=new Scanner(System.in);
		int num2=sc2.nextInt();
		
		System.out.println();
		//빵 종류 선택
		System.out.println("빵 종류를 선택해주세요");
		
		String[] br= {"1.화이트", "2.파마산 오레가노", "3.위트", "4.허니오트", "5.하티", "6.플랫브레드"};
		
		for(int i=0;i<br.length;i++) {
			System.out.println(br[i]);
		}
		
		System.out.println();
		System.out.print("빵 선택 : ");
		Scanner sc3=new Scanner(System.in);
		int num3=sc3.nextInt();
		
		System.out.println();
		//토스팅 여부 확인
		Scanner sc4=new Scanner(System.in);
		
		System.out.print("토스팅 하시겠습니까?(Y/N) ");
		String str1=sc4.nextLine();
		
		System.out.println();
		//치즈 선택
		String[] ch = {"1.아메리칸치즈", "2.슈레드치즈", "3.모차렐라치즈", "4.치즈 제외"};
		
		System.out.println("치즈를 선택하세요.");
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println();
		System.out.print("치즈 선택 : ");
		Scanner sc5=new Scanner(System.in);
		int num5=sc5.nextInt();
		
		System.out.println();
		//야채 선택
		System.out.println("원하는 야채를 선택하여 주세요.");
		
		String[][] vt1= {{"<생야채>"}, {"1.양상추", "2.토마토", "3.오이", "4.피망", "5.양파"}};
		String[][] vt2= {{"<절임류>"}, {"6.피클", "7.올리브", "8.할라피뇨"}};
		String[][] vt3= {{"<선택 안함>"}, {"9.모든 야채 제외"}};
		
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
		
		System.out.print("야채 선택: ");
		Scanner sc6=new Scanner(System.in);
		int num6=sc6.nextInt();
		
		System.out.println();
		//소스, 시즈닝 선택
		System.out.println("소스/시즈닝을 선택하여 주세요.");
		String[] sauce= {"1.알싸한 머스타드", "2.상큼한 이탈리안드레싱", "3.과일향 레드와인 식초", "4.달콤한 스위트 어니언",
						"5.새콤달콤한 허니 머스타드", "6.매콤달콤한 스위트 칠리", "7.스모크 향 스모크 바비큐", "8.크리미한 렌치",
						"9.고소한 마요네즈", "10.화끈하게 매운 핫 칠리", "11.이국적으로 매콤한 사우스 웨스트 치폴레", "12.알싸한 홀스래디쉬",
						"13.이태리 엑스트라버진 올리브 오일", "14.소금", "15.후추", "16.선택안함"};
		
		for(int i=0;i<sauce.length;i++) {
			System.out.println(sauce[i]);
		}
		
		System.out.println();
		System.out.print("소스/시즈닝 선택 : ");
		
		Scanner sc7=new Scanner(System.in);
		int num7=sc7.nextInt();
	}
}

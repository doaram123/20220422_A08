package sandwich;

import java.util.Scanner;
import sandwich.MenuName;

public class SandwichOrder {

	public static void main(String[] args) {
		
		//샌드위치 메뉴 선택
		System.out.println("<샌드위치 메뉴>");
		
		
//		MenuName mn=new MenuName();
//		mn.sandwichMenu();
		
//		MenuName mn=new MenuName();
//		mn.sandwichMenu("1.베지 아보카도", 4100, 7600);
//		mn.sandwichMenu("2.로스트 치킨 아보카도", 6400, 11600);
//		mn.sandwichMenu("3.터키 베이컨 아보카도", 6900, 12200);
//		mn.sandwichMenu("4.로티세리 바비큐 치킨", 6400, 11600);
//		mn.sandwichMenu("5.스테이크&치즈", 6900, 12200);
//		mn.sandwichMenu("6.K-바비큐", 6400, 11600);
//		mn.sandwichMenu("7.폴드 포크 바비큐", 6300, 11400);
//		mn.sandwichMenu("8.써브웨이 클럽", 6200, 11200);
//		mn.sandwichMenu("9.쉬림프", 6200, 11200);
//		mn.sandwichMenu("10.스파이스 이탈리안", 6000, 11000);
//		mn.sandwichMenu("11.치킨 데리야끼", 6000, 11000);
//		mn.sandwichMenu("12.비엘티", 5700, 10400);
//		mn.sandwichMenu("13.이탈리안비엠티", 5700, 10400);
//		mn.sandwichMenu("14.미트볼", 5600, 10300);
//		mn.sandwichMenu("15.터키", 5600, 10300);
//		mn.sandwichMenu("16.참치", 4900, 9400);
//		mn.sandwichMenu("17.에그마요", 4600, 8500);
//		mn.sandwichMenu("18.베지", 4100, 7600);
		
		for(; ;) {
			System.out.print("\n메뉴를 선택해주세요. ");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			
			if(num1>18) {
				System.out.println("\n다시 선택해주세요.");
				continue;
			}else { break; }
		}
		
		//빵 길이 선택
		System.out.println("\n--------------------------------------\n");
		System.out.println("빵 길이를 선택해주세요.\n");
		Length len=new Length();
		len.selectLen(15, 30);
		
		for(; ;) {
			System.out.print("\n빵 길이 선택 : ");
			Scanner sc=new Scanner(System.in);
			int num2=sc.nextInt();
			
			if(num2>2) {
				System.out.println("\n다시 선택해주세요.");
				continue;
			}else { break; }
		}
		
		//빵 종류 선택
		System.out.println("\n--------------------------------------\n");
		System.out.println("빵을 선택해주세요.\n");
		Bread br=new Bread();
		br.breadName("1.화이트");
		br.breadName("2.파마산 오레가노");
		br.breadName("3.위트");
		br.breadName("4.허니오트");
		br.breadName("5.하티");
		br.breadName("6.플랫브레드");
		
		for(; ;) {
			System.out.print("\n빵 종류 선택 : ");
			Scanner sc=new Scanner(System.in);
			int num3=sc.nextInt();
			
			if(num3>6) {
				System.out.println("\n다시 선택해주세요.");
				continue;
			}else{ break; }
		}
		
		//토스팅 여부 확인
		System.out.println("\n--------------------------------------\n");
		System.out.println("토스팅 하시겠습니까?\n");
		System.out.print("1.토스팅 한다  ");
		System.out.println("2.토스팅 안 한다");
		for(; ;) {
			System.out.print("\n토스팅 선택 : ");
			Scanner sc=new Scanner(System.in);
			int num4=sc.nextInt();
			
			if(num4>2) {
				System.out.println("\n다시 선택해주세요.");
				continue;
			}else { break; }
		}
		
		
		//치즈 선택
		System.out.println("\n--------------------------------------\n");
		System.out.println("치즈를 선택해주세요.\n");
		Cheese ch=new Cheese();
		ch.selectCh("1.아메리칸치즈");
		ch.selectCh("2.슈레드치즈");
		ch.selectCh("3.모차렐라치즈");
		ch.selectCh("4.치즈제외");
		
		for(; ;) {
			System.out.print("\n치즈 종류 선택 : ");
			Scanner sc=new Scanner(System.in);
			int num5=sc.nextInt();
			
			if(num5>4) {
				System.out.println("\n다시 선택해주세요.");
				continue;
			}else { break; }
		}
		
		//야채 선택
		System.out.println("\n--------------------------------------\n");
		System.out.println("원하는 야채를 선택해주세요\n");
		Vegetable ve=new Vegetable();
		System.out.print("<생야채> ");
		ve.vegetable("1.양상추 ");
		ve.vegetable("2.토마토 ");
		ve.vegetable("3.오이 ");
		ve.vegetable("4.피망 ");
		ve.vegetable("5.양파\n");
		System.out.print("<절임류> ");
		ve.vegetable("6.피클 ");
		ve.vegetable("7.올리브 ");
		ve.vegetable("8.할라피뇨\n");
		System.out.print("<선택안함> ");
		ve.vegetable("9.모든 야채 제외\n");
		ve.vegetable("10.선택완료\n");
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int count = 1;
		while(count<=9) {
			System.out.print("야채 선택 "+count+" : ");
			int num6=sc.nextInt();
			if(num6==9 || num6==10) {
				break;
			}
			else if(num6>10) {
				System.out.println("\n다시 선택해주세요.\n");
				continue;
			}
			else { count++; }
			System.out.println();
		}
		
		//소스&시즈닝 선택
		System.out.println("\n--------------------------------------\n");
		System.out.println("소스/시즈닝을 선택해주세요.(3개까지 선택 가능)\n");
		Sauce sa=new Sauce();
		sa.sauce("1.알싸한 머스타드");
		sa.sauce("2.상큼한 이탈리안드레싱");
		sa.sauce("3.과일향 레드와인식초");
		sa.sauce("4.달콤한 스위트 어니언");
		sa.sauce("5.새콤달콤한 허니 머스타드");
		sa.sauce("6. 매콤달콤한 스위츠 칠리");
		sa.sauce("7.스모크 향 스모크 바비큐");
		sa.sauce("8.크리미한 랜치");
		sa.sauce("9.고소한 마요네즈");
		sa.sauce("10.화끈하게 매운 핫 칠리");
		sa.sauce("11.이국적으로 매콤한 사우스 웨스트 치폴레");
		sa.sauce("12.알싸한 홀스래디쉬");
		sa.sauce("13.이태리 엑스트라버진 올리브 오일");
		sa.sauce("14.소금");
		sa.sauce("15.후추");
		sa.sauce("16.선택안함");
		sa.sauce("17.선택완료");
		
		System.out.println();
		Scanner scan=new Scanner(System.in);
		int count2 = 1;
		while(count2<=3) {
			System.out.print("소스/시즈닝 선택 "+count2+" : ");
			int num7=scan.nextInt();
			if(num7==16 || num7==17) {
				break;
			}
			else if(num7>17) {
				System.out.println("\n다시 선택해주세요.\n");
				continue;
			}
			else { count2++; }
			System.out.println();
		}
		
		System.out.println("\n주문이 완료되었습니다.");
		
		System.out.println("<주문 확인>");
		
		
	}

}

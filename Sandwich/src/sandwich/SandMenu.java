package sandwich;

public class SandMenu {
	public String[] name= {"1.베지 아보카도", "2.로스트 치킨 아보카도", "3.터키 베이컨 아보카도", "4.로티세리 바비큐 치킨", 
							"5.스테이크&치즈", "6.K-바비큐", "7.폴드 포크 바비큐", "8.써브웨이 클럽", "9.쉬림프",
							"10.스파이스 이탈리안", "11.치킨 데리야끼", "12.비엘티", "13.이탈리안비엠티", "14.미트볼",
							"15.터키", "16.참치", "17.에그마요", "18.베지"};
	public int price1;
	public int price2;
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int getPrice1() {
		return price1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	@Override
	public String toString() {
		System.out.println(super.toString());
		return name+" - 15cm: "+price1+"원 30cm: "+price2+"원";
	}
	
	
}

package GodOfChicken;

public class ManageM { // 돈 관리
	timeSleep sleep = new timeSleep();
	private static int money = 1000000; // class 내에서만 변경할 수 있는 money로 금고의 잔고를 의미. 초기 100만원
	
	int earnMoney(int money, int surplusMoney) {
		this.money += money; // 받은 돈
		this.money -= surplusMoney; // 거슬러줘야하는 돈

		return this.money;
	}

	void totalMoney() {
		System.out.println("오늘의 총 수익은 " + (this.money - 1000000) + "원 입니다.");
	}
	
	void receipt() {
		System.out.println("▶▶▶▶▶▶▶영수증◀◀◀◀◀◀◀");
	}
}

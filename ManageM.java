package GodOfChicken;

public class ManageM { // �� ����
	timeSleep sleep = new timeSleep();
	private static int money = 1000000; // class �������� ������ �� �ִ� money�� �ݰ��� �ܰ� �ǹ�. �ʱ� 100����
	
	int earnMoney(int money, int surplusMoney) {
		this.money += money; // ���� ��
		this.money -= surplusMoney; // �Ž�������ϴ� ��

		return this.money;
	}

	void totalMoney() {
		System.out.println("������ �� ������ " + (this.money - 1000000) + "�� �Դϴ�.");
	}
	
	void receipt() {
		System.out.println("����������������������������������");
	}
}

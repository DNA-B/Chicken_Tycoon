package GodOfChicken;

public class Chicken { // Chicken�� Ư�� ������ ���� Ŭ����

	int fryDegree;
	int seasonDegree;
	int soySeasonDegree;
	
	void youKnowMyField(int fryDegree) {
		System.out.println("���Ķ��̵� ġŲ��");
		System.out.println("�Ķ��̵� ġŲ ���� ���� : " + fryDegree);
	}
}

class seasonChicken extends Chicken {

	void youKnowMyField(int fryDegree, int seasonDegree) {
		System.out.println("����� ġŲ��");
		System.out.println("��� ġŲ ���� ���� : " + fryDegree);
		System.out.println("��� ġŲ ��� ���� : " + seasonDegree);
	}
}

class soySeasonChicken extends Chicken {

	void youKnowMyField(int fryDegree, int soySeasonDegree) {
		System.out.println("������ ġŲ��");
		System.out.println("���� ġŲ ���� ���� : " + fryDegree);
		System.out.println("���� ġŲ ������ ���� : " + soySeasonDegree);
	}
}

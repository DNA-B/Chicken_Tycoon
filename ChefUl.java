package GodOfChicken;

public class ChefUl {
	
	int i;
	
	Chicken degree = new Chicken();
	
	int fryDegree;
	int seasonDegree;
	int soySeasonDegree;
	
	Customer order = new Customer();
	
	public int fry(int order) { // ���� ������ �����ϰ� �����ϴ� �޼ҵ�
		for (i = 1; i <= order; i++) {
			degree.fryDegree = i;
		}
		return degree.fryDegree;
	}
}

class ChefJinSoo extends ChefUl{ //���ġŲ ���

	public int seasoning(int order) {
		for (i = 1; i <= order; i++) {
			degree.seasonDegree = i;
		}
		return degree.seasonDegree;
	}
}

class ChefJoon extends ChefUl{ //����ġŲ ���

	public int soySeasoning(int order) {
		for (i = 1; i <= order; i++) {
			degree.soySeasonDegree = i;
		}
		return degree.soySeasonDegree;
	}
}

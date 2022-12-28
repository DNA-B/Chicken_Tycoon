package GodOfChicken;

public class ChefUl {
	
	int i;
	
	Chicken degree = new Chicken();
	
	int fryDegree;
	int seasonDegree;
	int soySeasonDegree;
	
	Customer order = new Customer();
	
	public int fry(int order) { // 굽기 정도를 저장하고 리턴하는 메소드
		for (i = 1; i <= order; i++) {
			degree.fryDegree = i;
		}
		return degree.fryDegree;
	}
}

class ChefJinSoo extends ChefUl{ //양념치킨 담당

	public int seasoning(int order) {
		for (i = 1; i <= order; i++) {
			degree.seasonDegree = i;
		}
		return degree.seasonDegree;
	}
}

class ChefJoon extends ChefUl{ //간장치킨 담당

	public int soySeasoning(int order) {
		for (i = 1; i <= order; i++) {
			degree.soySeasonDegree = i;
		}
		return degree.soySeasonDegree;
	}
}

package GodOfChicken;

public class Chicken { // Chicken의 특성 저장을 위한 클래스

	int fryDegree;
	int seasonDegree;
	int soySeasonDegree;
	
	void youKnowMyField(int fryDegree) {
		System.out.println("▶후라이드 치킨◀");
		System.out.println("후라이드 치킨 굽기 정도 : " + fryDegree);
	}
}

class seasonChicken extends Chicken {

	void youKnowMyField(int fryDegree, int seasonDegree) {
		System.out.println("▶양념 치킨◀");
		System.out.println("양념 치킨 굽기 정도 : " + fryDegree);
		System.out.println("양념 치킨 양념 정도 : " + seasonDegree);
	}
}

class soySeasonChicken extends Chicken {

	void youKnowMyField(int fryDegree, int soySeasonDegree) {
		System.out.println("▶간장 치킨◀");
		System.out.println("간장 치킨 굽기 정도 : " + fryDegree);
		System.out.println("간장 치킨 간장양념 정도 : " + soySeasonDegree);
	}
}

package GodOfChicken;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Vector;

class timeSleep // 시간 차 출력을 위한 메소드를 담은 클래스
{
	void sleeping(int time) // 시간 차 출력 메소드
	{
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		timeSleep sleep = new timeSleep(); // 타임 객체 생성

		Scanner sc = new Scanner(System.in);

		Chicken chic = new Chicken();
		seasonChicken seasonChic = new seasonChicken();
		soySeasonChicken soyChic = new soySeasonChicken();
		
		ChefUl chef1 = new ChefUl();
		ChefJinSoo chef2 = new ChefJinSoo();
		ChefJoon chef3 = new ChefJoon();
		
		Stock orderStock = new Stock();

		String customerName;
		String customerOrder;
		
		int orderCount = 1;
		int i = 1;
		
		int fryDegree = 0;
		int seasonDegree = 0;
		int soySeasonDegree = 0;
		
		System.out.println("재고 소진 시 오늘 영업 종료할그야");

		sleep.sleeping(1);

		System.out.print("치킨 재고 : "); // 개수
		orderStock.stockChicken = sc.nextInt();

		Customer customer = new Customer();
		ManageM iLikeMoney = new ManageM();

		sleep.sleeping(2);

		while (true) {
			
			while(customer.order.size() < orderStock.stockChicken)
			{
				System.out.println("\n\n" + "안녕하세요 " + orderCount +  "번째 손님 성함이 어떻게되시죠?");
	
				customerName = customer.talkMyName();

				
				System.out.println("\n후라이드, 양념치킨, 간장치킨 중 어떤것으로 주문하시겠어요?");
				
				customerOrder = customer.choiceMenu();
				
				if(!customer.chicLover.containsKey(customer.myName))
				{
					customer.chicLover.put(customer.myName, 1); // 키값이 없으면 새로 추가
					customer.order.add(customerOrder);
				}
				else {
					customer.chicLover.put(customer.myName, customer.chicLover.get(customer.myName) + 1); // 만약 키값이 있으면 값을 1 증가
					
					if(customer.chicLover.get(customer.myName) > 10)
					{
						customer.order.add(0, customerOrder);
					}
				}			
				orderCount += 1;
			}

			
			if (customer.order.get(i - 1).contains("후라이드")) 
			{
				System.out.println("\n" + i + "번째 손님 후라이드 굽기는 어느정도로 할까요?");

				fryDegree = customer.choiceFry();
				chic.youKnowMyField(chef1.fry(fryDegree));
				
				System.out.println("\n\n" + i + "번째 손님 주문하신 치킨 나왔습니다~");
				
				orderStock.stockChicken -= 1;
				i++;
			} 
			else if (customer.order.get(i - 1).contains("양념")) 
			{
				System.out.println("\n" + i + "번째 손님 양념치킨의 굽기와 양념은 어느정도로 할까요?");
				
				fryDegree = customer.choiceFry();
				seasonDegree = customer.choiceSeason();

				seasonChic.youKnowMyField(chef2.fry(fryDegree), chef2.seasoning(seasonDegree));
				
				System.out.println("\n\n" + i + "번째 손님 주문하신 치킨 나왔습니다~");
				
				orderStock.stockChicken -= 1;
				i++;
			} 
			else if (customer.order.get(i - 1).contains("간장"))
			{
				System.out.println("\n" + i + "번째 손님 간장치킨의 굽기와 간장양념은 어느정도로 할까요?");
				
				fryDegree = customer.choiceFry();
				soySeasonDegree = customer.choiceSoySeason();
				
				soyChic.youKnowMyField(chef3.fry(fryDegree), chef3.soySeasoning(soySeasonDegree));
				
				System.out.println("\n\n" + i + "번째 손님 주문하신 치킨 나왔습니다~");
				
				orderStock.stockChicken -= 1;
				i++;
			}
		
			if (orderStock.stockChicken <= 0) 
			{ // 치킨이 없을 경우, 영업 종료
				break;
			}
		}

		System.out.println("\n 닭이 다 떨어져서 나 오늘 장사 안할그야~~~~~~\n");

		sleep.sleeping(1);

		iLikeMoney.totalMoney();

		sc.close();
	}
//while로 반복하다가 재고 떨어지면 끝(break) & 수익 출력
}

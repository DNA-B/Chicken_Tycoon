package GodOfChicken;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Vector;

class timeSleep // �ð� �� ����� ���� �޼ҵ带 ���� Ŭ����
{
	void sleeping(int time) // �ð� �� ��� �޼ҵ�
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
		timeSleep sleep = new timeSleep(); // Ÿ�� ��ü ����

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
		
		System.out.println("��� ���� �� ���� ���� �����ұ׾�");

		sleep.sleeping(1);

		System.out.print("ġŲ ��� : "); // ����
		orderStock.stockChicken = sc.nextInt();

		Customer customer = new Customer();
		ManageM iLikeMoney = new ManageM();

		sleep.sleeping(2);

		while (true) {
			
			while(customer.order.size() < orderStock.stockChicken)
			{
				System.out.println("\n\n" + "�ȳ��ϼ��� " + orderCount +  "��° �մ� ������ ��Եǽ���?");
	
				customerName = customer.talkMyName();

				
				System.out.println("\n�Ķ��̵�, ���ġŲ, ����ġŲ �� ������� �ֹ��Ͻðھ��?");
				
				customerOrder = customer.choiceMenu();
				
				if(!customer.chicLover.containsKey(customer.myName))
				{
					customer.chicLover.put(customer.myName, 1); // Ű���� ������ ���� �߰�
					customer.order.add(customerOrder);
				}
				else {
					customer.chicLover.put(customer.myName, customer.chicLover.get(customer.myName) + 1); // ���� Ű���� ������ ���� 1 ����
					
					if(customer.chicLover.get(customer.myName) > 10)
					{
						customer.order.add(0, customerOrder);
					}
				}			
				orderCount += 1;
			}

			
			if (customer.order.get(i - 1).contains("�Ķ��̵�")) 
			{
				System.out.println("\n" + i + "��° �մ� �Ķ��̵� ����� ��������� �ұ��?");

				fryDegree = customer.choiceFry();
				chic.youKnowMyField(chef1.fry(fryDegree));
				
				System.out.println("\n\n" + i + "��° �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�~");
				
				orderStock.stockChicken -= 1;
				i++;
			} 
			else if (customer.order.get(i - 1).contains("���")) 
			{
				System.out.println("\n" + i + "��° �մ� ���ġŲ�� ����� ����� ��������� �ұ��?");
				
				fryDegree = customer.choiceFry();
				seasonDegree = customer.choiceSeason();

				seasonChic.youKnowMyField(chef2.fry(fryDegree), chef2.seasoning(seasonDegree));
				
				System.out.println("\n\n" + i + "��° �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�~");
				
				orderStock.stockChicken -= 1;
				i++;
			} 
			else if (customer.order.get(i - 1).contains("����"))
			{
				System.out.println("\n" + i + "��° �մ� ����ġŲ�� ����� �������� ��������� �ұ��?");
				
				fryDegree = customer.choiceFry();
				soySeasonDegree = customer.choiceSoySeason();
				
				soyChic.youKnowMyField(chef3.fry(fryDegree), chef3.soySeasoning(soySeasonDegree));
				
				System.out.println("\n\n" + i + "��° �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�~");
				
				orderStock.stockChicken -= 1;
				i++;
			}
		
			if (orderStock.stockChicken <= 0) 
			{ // ġŲ�� ���� ���, ���� ����
				break;
			}
		}

		System.out.println("\n ���� �� �������� �� ���� ��� ���ұ׾�~~~~~~\n");

		sleep.sleeping(1);

		iLikeMoney.totalMoney();

		sc.close();
	}
//while�� �ݺ��ϴٰ� ��� �������� ��(break) & ���� ���
}

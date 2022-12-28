package GodOfChicken;

import java.util.Scanner;
import java.util.Vector;
import java.util.InputMismatchException;
import java.util.HashMap;

public class Customer {
	Scanner menu = new Scanner(System.in);
	Scanner pay = new Scanner(System.in);
	
	Vector<String> order = new Vector<String>();
	HashMap<String, Integer> chicLover= new HashMap<String, Integer>();
	
	int fryDegree;
	int seasonDegree;
	int soySeasonDegree;
	
	String myName = new String();
	String choice = new String();
	
	int payment;
	
	int sangMyungPay() {
		payment = pay.nextInt();
		
		return payment;
	}

	public String choiceMenu() {
		while(true)
		{
			try {
				this.choice=menu.nextLine();
				return this.choice;
			}
			catch(InputMismatchException e)
			{
				menu = new Scanner(System.in);
				System.out.println("\n지금 치킨이 장난같아? 다시 골라");
				continue;
			}
		}
	}

	public String talkMyName() {
		while(true)
		{
			try 
			{
				this.myName =menu.nextLine();
				return this.myName;
			}
			catch(InputMismatchException e)
			{
				menu = new Scanner(System.in);
				System.out.println("\n다시 말씀해 주시겠어요?");
				continue;
			}
		}
	}
	
	int choiceFry()
	{
		this.fryDegree = menu.nextInt();
		return this.fryDegree;
	}
	
	int choiceSeason()
	{
		this.seasonDegree = menu.nextInt();
		return this.seasonDegree;
	}
	
	int choiceSoySeason()
	{
		this.soySeasonDegree = menu.nextInt();
		return this.soySeasonDegree;
	}
}

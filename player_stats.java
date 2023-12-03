import java.util.Scanner;

public class player_stats {

	public int random_value;
	public String name;
	private int territory_count;
	private int army_count;
	private int money;
	private int army_skill_level;
	private int passive_income_level;
	
	public player_stats() {
		territory_count = 2;
		army_count = 5;
		money = 50000;
		army_skill_level = 0;
		passive_income_level = 0;
	}
	
	public void name(String name) {
		this.name = name;
	}
	
	public void expand_territory() {
		if(money > 10000) {
			money -= 10000;
			territory_count ++;
			System.out.println(name + " expands their territory! [-$10,000]");
		}else {
			System.out.println("YOU ARE POOR");
		}
	}
	
	public void recruit_army() {
		if(money > 8000) {
			money -= 8000;
			army_count ++;
		}
	}
	
	public void upgrade_technology() {
		if(money > 8000) {
			Scanner keyboard = new Scanner(System.in);

			System.out.println(name + ", what technology would you like to upgrade?\n[1] Army Skll [$8,000]\n[2] Passive Income Level [$8,000]");
			int choice = keyboard.nextInt();
			if(choice == 1 && money >= 8000) {
				money -=8000;
				army_skill_level ++;
			}else if(choice == 2) {
				money -= 8000;
				passive_income_level ++;
			}else {
				System.out.println("idiot");
			}
		}
	}
	
	public String setName(String input) {
		input = name;
		return input;
	}
	
	public String toString() {
		return "["+ name + "'s stats]\nTerritories: "+ territory_count + "\nArmies: "+ army_count +"\nMoney: "+ money +"\nArmy Skill Level: "+ army_skill_level +"\nPassive Income Level: "+ passive_income_level;
	}
	
	public int getMoney() {
		return money;
	}

	public int getArmyCount(){
		return army_count;
	}

	public int player_battle(){
		int rand1 = (int)(Math.random()*100)+1;
		int bonus = army_count+army_skill_level*territory_count+passive_income_level;
		int battle_total = rand1+bonus;
		return battle_total;
	}
		
}

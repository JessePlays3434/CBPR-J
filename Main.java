import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		//Creates 2 Players
		player_stats p1 = new player_stats();		
		player_stats p2 = new player_stats();
		
		//Asks for Player Names
		System.out.println("Player 1, enter your name:");
		String p1name = k.next();
		p1.name(p1name);
		
		System.out.println("Player 2, enter your name:");
		String p2name = k.next();
		p2.name(p2name);

		//Prints Stats
		System.out.println("\n"+p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		

		//"Game Loop"
		while(p1.getMoney() > 0 && p2.getMoney() > 0) {
			System.out.println("It is your turn "+ p1.name +". Here are your options: \n[1] Expand Territory [$10,000]\n"
					+ "[2] Upgrade Technology\r\n"
					+ "[3] Recruit Army [$8,000]\r\n"
					+ "[4] Battle");
			int p1choice = k.nextInt();
			
			//Player Options
			if(p1choice == 1) {
				p1.expand_territory();
			}
			if(p1choice == 2) {
				p1.upgrade_technology();
			}
			if(p1choice == 3) {
				p1.recruit_army();
			}
			if(p1choice == 4) {
				int p1battlenum = p1.player_battle(p1.getTerritory(), p1.getArmyCount(), p1.getArmySkillLevel(), p1.getPassiveIncomeLevel());
				int p2battlenum = p2.player_battle(p2.getTerritory(), p2.getArmyCount(), p2.getArmySkillLevel(), p2.getPassiveIncomeLevel());

				//Player 1's Battle Num is Greater; Adds Money to P1 acct and subtracts from P2 army count
				if(p1battlenum > p2battlenum){
					
					p1.setMoney(true);
					p2.setMoney(false);
					p2.setArmy(false);

					System.out.println(p1battlenum + " > " + p2battlenum + "\n" + p1.name + " Wins!");
				
				//Same as above, but for P2
				}else if(p2battlenum > p1battlenum){

					p2.setMoney(true);
					p1.setMoney(false);
					p1.setArmy(false);

					System.out.println(p2battlenum + " > " + p1battlenum + "\n" + p2.name + " Wins!");
			}else{
				System.out.println("Nobody Wins!");
			}
		}

			//Prints Stats Again
			System.out.println(p1.toString()+"\n");
			System.out.println(p2.toString()+"\n");
			

			//Start of P2's turn
			System.out.println("It is your turn "+ p2.name +". Here are your options: \n[1] Expand Territory [$10,000]\r\n"
					+ "[2] Upgrade Technology\r\n"
					+ "[3] Recruit Army [$8,000]\r\n"
					+ "[4] Battle");
			int p2choice = k.nextInt();
			
			//Choices
			if(p2choice == 1) {
				p2.expand_territory();
			}
			if(p2choice == 2) {
				p2.upgrade_technology();
			}
			if(p2choice == 3) {
				p2.recruit_army();
			}
			
			//Same as P1
			if(p2choice == 4) {
				int p1battlenum = p1.player_battle(p1.getTerritory(), p1.getArmyCount(), p1.getArmySkillLevel(), p1.getPassiveIncomeLevel());
				int p2battlenum = p2.player_battle(p2.getTerritory(), p2.getArmyCount(), p2.getArmySkillLevel(), p2.getPassiveIncomeLevel());

				if(p1battlenum > p2battlenum){

					p1.setMoney(true);
					p2.setMoney(false);
					p2.setArmy(false);

					System.out.println(p1battlenum + " > " + p2battlenum + "\n" + p1.name + " Wins!");
				
				}else if(p2battlenum > p1battlenum){

					p2.setMoney(true);
					p1.setMoney(false);
					p1.setArmy(false);
					
					System.out.println(p2battlenum + " > " + p1battlenum + "\n" + p2.name + " Wins!");
				}
			}
			
			//Prints Out Stats at the End of the Game Loop
			System.out.println(p1.toString()+"\n");
			System.out.println(p2.toString()+"\n");
			
		}

			//If P1/P2 Money Balance is 0, Game Over
			if(p1.getMoney() <= 0){
				System.out.println(p1name+" is out of money! "+p2name+" is the winner!");
			}else if(p2.getMoney() <= 0){
				System.out.println(p2name+" is out of money! "+p1name+" is the winner!");
			}else if(p1.getMoney() <= 0 && p2.getMoney() <= 0){
				System.out.println("You both are out of money! You both lose!");
			}
		
		}
	
}


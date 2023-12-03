import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		
		player_stats p1 = new player_stats();		
		player_stats p2 = new player_stats();
		
		System.out.println("Player 1, enter your name:");
		String p1name = k.next();
		p1.name(p1name);
		
		System.out.println("Player 2, enter your name:");
		String p2name = k.next();
		p2.name(p2name);

		
		System.out.println("\n"+p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		
		while(p1.getMoney() > 0 || p2.getMoney() > 0) {
			System.out.println("It is your turn "+ p1.name +". Here are your options: \n[1] Expand Territory [$10,000]\r\n"
					+ "[2] Upgrade Technology\r\n"
					+ "[3] Recruit Army [$8,000]\r\n"
					+ "[4] Battle");
			int p1choice = k.nextInt();
			if(p1choice == 1) {
				p1.expand_territory();
			}else if(p1choice == 2) {
				p1.upgrade_technology();
			}else if(p1choice == 3) {
				p1.recruit_army();
			}else if(p1choice == 4) {
				int p1battlenum = p1.player_battle();
				int p2battlenum = p2.player_battle();

				if(p1battlenum > p2battlenum){
					
					int p2money = p1.getMoney();
					p2money -= 10000;
					int p2army = p1.getArmyCount();
					if(p2army > 0){
						p2army --;
					}

					int p1money = p1.getMoney();
					p1money += 10000;

					System.out.println(p1battlenum + " > " + p2battlenum + "\n" + p1.name + " Wins!");
				}else if(p2battlenum > p1battlenum){

					int p1money = p1.getMoney();
					p1money -= 10000;
					int p1army = p1.getArmyCount();
					if(p1army > 0){
						p1army --;
					}

					int p2money = p1.getMoney();
					p2money += 10000;
					
					System.out.println(p2battlenum + " > " + p1battlenum + "\n" + p2.name + " Wins!");
			}else{
				System.out.println("What");
			}
			
			System.out.println(p1.toString()+"\n");
			System.out.println(p2.toString()+"\n");
			
			System.out.println("It is your turn "+ p2.name +". Here are your options: \n[1] Expand Territory [$10,000]\r\n"
					+ "[2] Upgrade Technology\r\n"
					+ "[3] Recruit Army [$8,000]\r\n"
					+ "[4] Battle");
			int p2choice = k.nextInt();
			if(p2choice == 1) {
				p2.expand_territory();
			}else if(p2choice == 2) {
				p2.upgrade_technology();
			}else if(p2choice == 3) {
				p2.recruit_army();
			}else if(p2choice == 4) {
				if(p1battlenum > p2battlenum){
					
					int p2money = p1.getMoney();
					p2money -= 10000;
					int p2army = p1.getArmyCount();
					if(p2army > 0){
						p2army --;
					}

					int p1money = p1.getMoney();
					p1money += 10000;

					System.out.println(p1battlenum + " > " + p2battlenum + "\n" + p1.name + " Wins!");
				}else if(p2battlenum > p1battlenum){

					int p1money = p1.getMoney();
					p1money -= 10000;
					int p1army = p1.getArmyCount();
					if(p1army > 0){
						p1army --;
					}

					int p2money = p1.getMoney();
					p2money += 10000;
					
					System.out.println(p2battlenum + " > " + p1battlenum + "\n" + p2.name + " Wins!");
			}
			}
			
			System.out.println(p1.toString()+"\n");
			System.out.println(p2.toString()+"\n");

		}
	
	}

	}
	
}

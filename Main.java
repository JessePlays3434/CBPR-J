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

		
		System.out.println(p1.toString()+"\n");
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
				System.out.println("not finished yet, idiot"); //Finish setting up battle asp
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
			}else if(p1choice == 3) {
				p2.recruit_army();
			}else if(p1choice == 4) {
				System.out.println("not finished yet, idiot"); //Finish setting up battle asp
			}
			
			System.out.println(p1.toString()+"\n");
			System.out.println(p2.toString()+"\n");

		}
	
	}
		
}

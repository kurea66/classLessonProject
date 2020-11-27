import java.util.*;
public class Main{
	public static void main(String[] args){
		String heroName=new Scanner(System.in).nextLine();
		int heroLv=new Scanner(System.in).nextInt();
		Hero hero1=new Hero(heroName,heroLv);
		String monsterName=new Scanner(System.in).nextLine();
		int monsterLv=new Scanner(System.in).nextInt();
		Monster mon1=new Monster(monsterName,monsterLv);
	}
}

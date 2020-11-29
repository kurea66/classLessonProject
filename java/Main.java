import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("ヒーローの名前を入力>");
		String heroName=new Scanner(System.in).nextLine();
		System.out.print("ヒーローのLvを入力>");
		int heroLv=new Scanner(System.in).nextInt();
		Hero hero1=new Hero(heroName,heroLv);
		System.out.print("モンスターの名前を入力>");
		String monsterName=new Scanner(System.in).nextLine();
		System.out.print("モンスターのLvを入力>");
		int monsterLv=new Scanner(System.in).nextInt();
		Monster mon1=new Monster(monsterName,monsterLv);
		for(int i=0;true;i++){
			System.out.print("ヒーローのターン、行動を選択してください1...戦う、2...逃げる>");
			int heroAction=new Scanner(System.in).nextInt();
			if(heroAction==1){
				if((i+1)%5==0){
					System.out.print("ヒーローの攻撃を選択してください1...叩く、2...昇竜拳、3...メガトンパンチ、4...えくすかりばーーーーーーーーーーーー！！！！>");
					int atackAction= new Scanner(System.in).nextInt();
					int heroAtackDamages = Hero.heroAtackDamages(hero1.heroName,hero1.heroAtack,mon1.monsterName,atackAction);
					mon1.monsterHp -= heroAtackDamages;
					System.out.printf("%sのHPは%d%n",mon1.monsterName,mon1.monsterHp);
				}else{
					System.out.print("ヒーローの攻撃を選択してください1...叩く、2...昇竜拳、3...メガトンパンチ>");
					int atackAction= new Scanner(System.in).nextInt();
					int heroAtackDamages = Hero.heroAtackDamages(hero1.heroName,hero1.heroAtack,mon1.monsterName,atackAction);
					mon1.monsterHp -= heroAtackDamages;
					System.out.printf("%sのHPは%d%n",mon1.monsterName,mon1.monsterHp);
				}
			}else if(heroAction==2){
				System.out.println(hero1.heroName + "は逃げ出した!!");
				System.out.println("GameOver");
				return;
			}else{
				System.out.println("1か2を入力してください");
			}
			if(mon1.monsterHp > 0){
				System.out.println("モンスターのターン!!");
				int monAction=new Random().nextInt(4);
				int monAtackDamages= Monster.monAtackDamages(hero1.heroName,mon1.monsterName,mon1.monsterAtack,monAction);
				hero1.heroHp -= monAtackDamages;
				System.out.printf("%sのHPは%d%n",hero1.heroName,hero1.heroHp);
			}else{
				System.out.printf("おめでとう！！%sを倒した！！！%n",mon1.monsterName);
				return;
			}
			if(hero1.heroHp <=0){
				System.out.printf("%sは倒れた…%n",hero1.heroName);
				System.out.println("GameOver");
				return;
			}
		}
	}
}

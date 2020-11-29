import java.util.*;
public class Hero{
	int heroLv;
	int heroHp;
	int heroMp;
	int heroAtack;
	String heroName;
	public Hero(String name,int lv){
		this.heroName=name;
		this.heroLv=lv;
		this.heroHp=calcHeroHitPoints(lv);
		this.heroMp=calcHeroManaPoints(lv);
		this.heroAtack=calcHeroAtack(lv);
		//デバック行
		//System.out.printf("%s:%d:%d:%d:%d",this.heroName,this.heroLv,this.heroHp,this.heroMp,this.heroAtack);
	}
	public int calcHeroHitPoints(int lv){
		int hp=new Random().nextInt(11) + (lv - 5);
		hp= hp > 0 ? hp*10 : 10;
		return hp;
	}
	public int calcHeroManaPoints(int lv){
		int mp=new Random().nextInt(11) + (lv - 5);
		mp= mp > 0 ? mp*5 : 5;
		return mp;
	}
	public int calcHeroAtack(int lv){
		int atack=(new Random().nextInt(30) + lv)*15;
		return atack;
	}
	static int heroAtackDamages(String heroName,int heroAtack,String monName,int atackAction){
		int heroAtackDamages = 0;
		switch(atackAction){
			case 1:
				System.out.printf("%sは叩いた%n",heroName);
				heroAtackDamages=(int)((new Random().nextInt(20)+heroAtack)*0.6);
				System.out.println(monName + "に"+ heroAtackDamages + "のダメージ");
				break;
			case 2:
				System.out.printf("%sの昇竜拳%n",heroName);
				heroAtackDamages=(int)((new Random().nextInt(20)+heroAtack));
				System.out.println(monName + "に"+ heroAtackDamages + "のダメージ");
				break;
			case 3:
				System.out.printf("%sのメガトンパンチ%n",heroName);
				heroAtackDamages=(int)((new Random().nextInt(20)+heroAtack)*1.2);
				System.out.println(monName + "に"+ heroAtackDamages + "のダメージ");
				break;
			case 4:
				System.out.printf("%sのえくすかりばーーーーーーーーーーーー！！！",heroName);
				heroAtackDamages=(int)((new Random().nextInt(20)+heroAtack)*2.5);
				System.out.println(monName + "に"+ heroAtackDamages + "のダメージ");
				break;
		}
	return heroAtackDamages;
	}
}

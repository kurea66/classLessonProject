import java.util.*;
public class Monster{
	int monsterLv;
	int monsterHp;
	int monsterMp;
	int monsterAtack;
	String monsterName;
	public Monster(String name,int lv){
		this.monsterName=name;
		this.monsterLv=lv;
		this.monsterHp=calcMonsterHitPoints(lv);
		this.monsterMp=calcMonsterManaPoints(lv);
		this.monsterAtack=calcMonsterAtack(lv);
		//デバック行
		//System.out.printf("%s:%d:%d:%d:%d",this.monsterName,this.monsterLv,this.monsterHp,this.monsterMp,this.monsterAtack);
	}
	public int calcMonsterHitPoints(int lv){
		int hp=new Random().nextInt(11) + (lv - 5);
		hp= hp > 0 ? hp*100 : 100;
		return hp;
	}
	public int calcMonsterManaPoints(int lv){
		int mp=new Random().nextInt(11) + (lv - 5);
		mp= mp > 0 ? mp*10 : 10;
		return mp;
	}
	public int calcMonsterAtack(int lv){
		int atack=(int)((new Random().nextInt(30) + lv)*1.5);
		return atack;
	}
	static int monAtackDamages(String heroName,String monName,int monAtack,int atackAction){
		int monAtackDamages = 0;
		switch(atackAction){
			case 0:
				System.out.printf("%sは叩いた%n",monName);
				monAtackDamages=(int)((new Random().nextInt(20)+monAtack)*0.3);
				System.out.println(heroName + "に"+ monAtackDamages + "のダメージ");
				break;
			case 1:
				System.out.printf("%sのファイアブレス%n",monName);
				monAtackDamages=(int)((new Random().nextInt(20)+monAtack)*0.8);
				System.out.println(heroName + "に"+ monAtackDamages + "のダメージ");
				break;
			case 2:
				System.out.printf("%sの拡散する波動%n",monName);
				monAtackDamages=(int)((new Random().nextInt(20)+monAtack)*1);
				System.out.println(heroName + "に"+ monAtackDamages + "のダメージ");
				break;
			case 3:
				System.out.printf("%sのティロフィナーレ%n",monName);
				monAtackDamages=(int)((new Random().nextInt(20)+monAtack)*2.1);
				System.out.println(heroName + "に"+ monAtackDamages + "のダメージ");
				break;
		}
	return monAtackDamages;
	}
}

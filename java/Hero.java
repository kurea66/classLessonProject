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
		System.out.printf("%s:%d:%d:%d:%d",this.heroName,this.heroLv,this.heroHp,this.heroMp,this.heroAtack);
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
		int atack=new Random().nextInt(30) + 480;
		return atack;
	}
}

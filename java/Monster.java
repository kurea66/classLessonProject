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
		System.out.printf("%s:%d:%d:%d:%d",this.monsterName,this.monsterLv,this.monsterHp,this.monsterMp,this.monsterAtack);
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
		int atack=new Random().nextInt(30) + 100;
		return atack;
	}
}

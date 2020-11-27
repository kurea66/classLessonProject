import java.util.*;
public class Calc{
	static int calcMonsterHitPoints(int lv){
		int hp=new Random().nextInt(11) + (lv - 5);
		hp= hp > 0 ? hp*100 : 100;
		return hp;
	}
	static int calcMonsterManaPoints(int lv){
		int mp=new Random().nextInt(11) + (lv - 5);
		mp= mp > 0 ? mp*10 : 10;
		return mp;
	}
	static int calcMonsterAtack(int lv){
		int atack=new Random().nextInt(30) + 100;
		return atack;
	}
}

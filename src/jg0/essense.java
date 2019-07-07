package jg0;

public class essense {

	int str, dext, intl, vol, hp0, exp, hp; 	// сила ловкость интеллект воля хп опыт
	char symb; //символ сущности
	
	essense(char symb, int str, int dext, int intl, int vol, int hp0, int exp){
		
		this.symb = symb;
		this.str = str;
		this.dext = dext;
		this.intl = intl;
		this.vol = vol;
		this.hp0 = hp0;
		this.exp = exp;
		this.hp = hp0;
		
	}
	
	public char getSymb() {
		return this.symb;
	}
	public int getStr() {
		return this.str;
	}
	public int getDext() {
		return this.dext;
	}
	public int getIntl() {
		return this.intl;
	}
	public int getVol() {
		return this.vol;
	}
	public int getHp0() {
		return this.hp0;
	}
	public int getExp() {
		return this.exp;
	}
	public int getHp() {
		return this.hp;
	}
	
	
	
	public void MPunch(essense target) {
	
	}
	
	
	public void DPunch(essense target) {
		
	}
	
	
	public void Move(int x, int y) {
		
	}
	
	
	
}

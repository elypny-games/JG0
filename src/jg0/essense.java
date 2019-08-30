package jg0;

public class essense {

	int str, dext, intl, vol, hp0, exp, hp; 	
	char symb; 
	int x, y;
	int init;
	
	essense(char symb, int str, int dext, int intl, int vol, int hp0, int exp, int init, int x, int y){
		
		this.symb = symb;
		this.str = str;
		this.dext = dext;
		this.intl = intl;
		this.vol = vol;
		this.hp0 = hp0;
		this.exp = exp;
		this.hp = hp0;
		this.init = init;
		this.x = x;
		this.y = y;
		
	}
	
	essense(char symb, int str, int dext, int intl, int vol, int hp0, int exp, int init){
		
		this(symb, str, dext, intl, vol, hp0, exp, init, 0, 0);
		
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
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public static void damage(essense target, int x) {
		
		target.hp -= x;
		
	}
	
	public void Punch(essense target) {
	
		int r = (int) Math.random()*100;
		if (r>=getStr()) damage(target, 0);
		else damage(target, (getStr()-r)/10);
		
	}
	
	
	public boolean isNear(essense target) {
		
		return (Math.abs(this.x-target.x)==1||Math.abs(this.y-target.y)==1)?true:false;
		
	}

	
	public void MoveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void Move(String way, int s) {
				
		switch(way) {
		
		case "Right":
			this.x += s; break;
		case "Left":
			this.x -= s; break;
		case "Down":
			this.y -= s; break;
		case "Up":
			this.y += s; break;
		
		}
	}

	
	public void Move(String way) {

		switch(way) {
		
		case "Right":
			this.x += 1; break;
		case "Left":
			this.x -= 1; break;
		case "Down":
			this.y -= 1; break;
		case "Up":
			this.y += 1; break;
		
		}
		
	}
	
	
	//нужно что-то вроде деструктора
	//или наконец изучить и юзать указатели
}

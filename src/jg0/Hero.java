package jg0;

public class Hero extends essense {
	
	int str, dext, intl, vol, hp0, exp, hp;
	
	Hero(int str, int dext, int intl, int vol, int hp0, int exp, int init){
		
		super('@', str, dext, intl, vol, hp0, exp, init);			
		//вызов разных классов будет производится при самом вызове героя в engine или поле (скорее всего engine)
	}

	
	public void Move() {	//ужно прикрутить как аргумент события keylistenera или подобного
		
		
	}

	
	
}

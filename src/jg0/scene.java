package jg0;

public class scene {

	int lvl;
	char sc[][] = new char[100][100];
	char sc0[][] = new char[100][100];
	
	public scene(int lvl) {
		
		this.lvl = lvl;
		
		//��������� ������ ����������
		
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	
	public boolean isEmpty(int x, int y) {
		
		if (sc[x][y]=='�') return true;
		else return false;
		
	}
	
	public void refresh() {
		
	}
}

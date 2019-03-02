public class Terning {
	private int verdi;
	
	public Terning() {
		verdi = 0;
	}
	
	public int trill() {
		verdi = (int)((Math.random()* 6 ) + 1 );
		return verdi;
		
	}

	public int getVerdi() {
		return verdi;
	}
}


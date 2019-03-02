
public class Kopp {
	Terning terning = new Terning();
	Terning terning2 = new Terning();
	int sum;
	public Kopp() {

	}

	public void trill() {
		terning.trill();	
		terning2.trill();
	}
	public int getSum(){
		sum = terning.getVerdi() + terning2.getVerdi();
		return sum;
	}

}

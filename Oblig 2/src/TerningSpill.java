import java.util.ArrayList;
import java.util.List;


public class TerningSpill {
	
	Kopp koppen = new Kopp();
	List<Spiller> spillere = new ArrayList<>();
	{
		spillere.add(new Spiller("John"));
		spillere.add(new Spiller("Eirik"));
		spillere.add(new Spiller("Sindre"));
		spillere.add(new Spiller("Ranveig"));
	}
	
	public void  Spill() {
		
		for (Spiller spiller : spillere) {
			koppen.trill();
			int score = koppen.getSum();
			System.out.print(spiller);
			System.out.println(score);
		}
	}
}

import Coinable.Coinable;
import Dispensable.Dispensable;


public class GumballMachine implements Coinable, Dispensable {
	
	int gumball = 0;
	
	public GumballMachine() 
	{
		this.gumball = 4;
	}
	
	public boolean insertCoin()
	{
		
		if (this.gumball > 0) {
			this.dispense();
			return true;
		}
		System.out.println("Return Coin");
		return false;
	}
	
	public void dispense()
	{
		this.gumball--;
		System.out.println("1 Gum dispensed.");
	}
	public void reload(int count) 
	{
		this.gumball+=count;
	}


}

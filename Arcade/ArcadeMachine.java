

public class ArcadeMachine implements Coinable, Dispensable {
	int coins;
	
	public ArcadeMachine()
	{
		this.coins = 0;
	}

	@Override
	public void dispense() 
	{
		// TODO Auto-generated method stub
		System.out.println("Ready to play");
		System.out.println("playing");
		System.out.println("GAME END");
		coins++;
	}

	@Override
	public void reload(int count)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertCoin() 
	{
		// TODO Auto-generated method stub
		System.out.println("Coin Inserted");
		this.dispense();
		return false;
	}
	

}
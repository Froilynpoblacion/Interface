public class Person {
	private int coins;
	
	public Person(int coins) {
		this.coins = coins;
	}
	public void insertCoin(Coinable coinable) {
		 System.out.println("Remaining coins: " + coins + "\n");
		//condition
		if(!coinable.insertCoin()) 
			coins --;
		
		if (coins == 0)
		 System.out.println("\nInsufficient Balance");
		
	}

}

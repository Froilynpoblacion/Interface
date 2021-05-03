public class Person<Coinable>{
      private int coins;
      
      public Person(int coins) 
      {
    	  this.coins = coins;
      }
	
      public void insertCoin( Coinable coinable)
      {
    	  System.out.println("Coin inserted");
    	  coins--;
    	  
    	  if(!((GumballMachine) coinable).insertCoin()) 
    	  {
    		  
    		  coins++;
    		  System.out.println("Coin refunded");
    	  }
    	  System.out.println("Coint count :" + coins);
      }

	public void insertCoin(GumballMachine gumballMachine) {
		// TODO Auto-generated method stub
		
	}

}

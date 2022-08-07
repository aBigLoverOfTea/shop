package shop;

public class User {
	private Long id;
	private String username;
	private float balance;

	public User(String username, float balance, Long id) { 
		this.username = username; this.balance = balance; this.id = id;
	} /* in future it's will connect to users DB and gets all the fields on record with given username,
	but on this stage I'll just hardcode the values. */

	public void getId() {return this.id;}
	public void getUsername() {return this.username;}
	public void getBalance() {return this.balance;}
	public void changeBalance(Object value, char operation) { 
		value = (Float) value;
		switch (operation) {
			case '+':
				this.balance += value;
				break;
			case '-':
				this.balance -= value;
				break;
			case '=':
				this.balance = value;
				break;
		} // I did this method like that just because if I were write setter, code in App.java might look scary
	}
}

public class Keyboard {
	
	Key[] keys;
	
	//***************************
	public static class Key{
		char symbol;
		
		public Key(char symbol) {
			this.symbol = symbol;
		}
		
		@Override
		public String toString() {
			return String.format("%c", symbol);
		}
	}
	//***************************
	
	public Keyboard() {
		keys = new Key[104];
	}
	
	public void addKey(int idx, Key key) {
		keys[idx] = key;
		System.out.println("Key " + key + " is assigned to position " + idx + ".");
	}

}

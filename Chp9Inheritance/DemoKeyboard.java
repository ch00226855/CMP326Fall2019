
public class DemoKeyboard {

	public static void main(String[] args) {
		
		Keyboard k1 = new Keyboard();
		
		Keyboard.Key key1 = new Keyboard.Key('A');
		Keyboard.Key key2 = new Keyboard.Key('B');
		
		k1.addKey(0, key1);
		k1.addKey(1,  key2);
		
		

	}

}

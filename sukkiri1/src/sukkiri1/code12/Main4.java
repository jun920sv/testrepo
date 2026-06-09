package sukkiri1.code12;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		
		Character [] c = new Character[5];
		
		c[0]=new Hero();
		c[1]=new Hero();
		c[2]=new Thief();
		c[3]=new Wizard();
		c[4]=new Wizard();
		
		List<Character> list = new ArrayList <Character>();
		list.add(new Hero());
		
		for(Character v :c) {
			v.hp +=50;
		}
		
		Matango m = new Matango();
		
		for(Character v:c) {
			if(v instanceof Wizard w) {
			w.fireball(m);
		}
		
		
	}
		
	}
}



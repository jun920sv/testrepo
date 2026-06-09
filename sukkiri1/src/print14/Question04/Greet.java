package print14.Question04;

public interface Greet {

	public abstract void greeting();
	
	public static  Greet createInstance(int hour) {
		if(hour >=5 && 11>hour) {
			return new MorningGreet();
		}
		else if(hour >11 && 17>hour) {
			return new AfternoonGreet();
		
		}else {
			return new EveningGreet();
		}
		
		
		
	}
	
	
}

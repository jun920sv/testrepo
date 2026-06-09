package test;

public class ShiftType {
	public static final int MORNING = 1;
	public static final int DAY = 2;
	public static final int NIGHT = 3;
	public static final int start = 7;
	public static final int end = 22;
	public static int total = 0;
	private int type;
	private int capacity;
	private String str;
	public static ShiftType morning; 
	public static ShiftType day; 
	public static ShiftType night; 
	public ShiftType() {
		morning = new ShiftType(MORNING,2,"7-15時");
		day = new ShiftType(DAY,2,"12-20時");
		night = new ShiftType(NIGHT,2,"14-22時");
	}
	public ShiftType(int type,int capacity,String str) {
		this.type = type;
		this.capacity = capacity;
		this.str = str;
		total += capacity;
	}
	
	public int getType() {
		return this.type;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public void reduceCapacity() {
		this.capacity--;
	}
	public void addCapacity() {
		this.capacity++;
	}
	public String getStr() {
		return this.str;
	}
}

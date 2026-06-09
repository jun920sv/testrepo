package print11.Question03;

public class GoldMember extends Member {

	public GoldMember(String name) {
		super(name);
		
	}
	
	@Override
	public int getPoint(int price) {
        return price / 5;
    }
   
}

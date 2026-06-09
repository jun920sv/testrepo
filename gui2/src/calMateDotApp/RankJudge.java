package calMateDotApp;

public class RankJudge {
	private String rank;
	
	public RankJudge(int attend, int heart) {
		
		if(attend >= 250 && heart >= 300)this.rank = "一流メイド";
		else if(attend >= 100 && heart >= 100)this.rank = "ベテランメイド";
		else if(attend >= 30 && heart >= 20)this.rank = "正メイド";
		else this.rank = "見習いメイド";
	}
	
	public String getRank() {
		return this.rank;
	}
}

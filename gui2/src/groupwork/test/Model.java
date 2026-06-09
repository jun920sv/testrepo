package groupwork.test;

public class Model {
	
	public void culc(CreatePanel cp) {
		cp.sm.setStatus1(cp.sm.getStatus1()+(cp.sm.getStory().getChangeStatus1()));
		cp.sm.setStatus2(cp.sm.getStatus2()+(cp.sm.getStory().getChangeStatus2()));
		cp.sm.setStatus3(cp.sm.getStatus3()+(cp.sm.getStory().getChangeStatus3()));
		cp.sm.setStatus4(cp.sm.getStatus4()+(cp.sm.getStory().getChangeStatus4()));
	}

}

package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		int ret = 0;
		while (!callCheck()) {
			temp.countIn(super.countOut());
		
			ret = temp.countOut();
		
			while (!temp.callCheck()) {
				countIn(temp.countOut());
			}
		}
		return ret;
	}
}

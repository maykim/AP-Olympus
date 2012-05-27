package kr.ac.cau.cse.dodekatheon.olympus;


public final class OPApplicationDelegate {
	
	public void applicationDidFinishLaunching() {
		OPApplication.sharedApplication().GUI().setVisible(true);
	}
	
}
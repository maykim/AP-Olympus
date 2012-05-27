package kr.ac.cau.cse.dodekatheon.olympus;

import javax.swing.UIManager;
import kr.ac.cau.cse.dodekatheon.olympus.gui.OPMainWindow;


public class OPApplication {
	
	private static OPApplication OPApp=null;
	private static final String AppName="Olympus";
	
	private OPMainWindow mainWindow=null;
	private OPApplicationDelegate delegate=null;
	
	
	private OPApplication() {
		delegate=new OPApplicationDelegate();
		mainWindow=new OPMainWindow();
	}
	
	public OPApplicationDelegate delegate() {
		return delegate;
	}
	
	public OPMainWindow GUI() {
		return mainWindow;
	}
	
	public static OPApplication sharedApplication() {
		if(OPApp==null)
			OPApp=new OPApplication();
		
		return OPApp;
	}
	
	@Override
	public String toString() {
		return AppName;
	}
	
	
	public static void OPApplicationMain(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {}
		
		OPApp=new OPApplication();
	}
	
}
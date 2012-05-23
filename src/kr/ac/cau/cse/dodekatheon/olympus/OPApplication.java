package kr.ac.cau.cse.dodekatheon.olympus;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class OPApplication {
	
	private static OPApplication OPApp=null;
	//private static final String AppName="Olympus";
	
	private ResourceBundle appProperties=null;
	
	
	private OPApplication() {
		try {
			appProperties=ResourceBundle.getBundle("kr.ac.cau.cse.dodekatheon.olympus.config.Info");
		} catch(MissingResourceException mre) {
			System.err.println("Failed to load application property file.");
			System.exit(1);
		}
	}
	
	public static OPApplication sharedApplication() {
		if(OPApp==null)
			OPApp=new OPApplication();
		
		return OPApp;
	}
	
	/*
	@Override
	public String toString() {
		return AppName;
	}
	//*/
	
	public static void OPApplicationMain(String[] args) {
		OPApp=new OPApplication();
	}
	
}
package kr.ac.cau.cse.dodekatheon.olympus.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import kr.ac.cau.cse.dodekatheon.olympus.OPApplication;


public final class OPMainWindow extends JFrame {
	
	public OPMainWindow() {
		super(OPApplication.sharedApplication().toString());
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				drawGUI();
				OPApplication.sharedApplication().delegate().applicationDidFinishLaunching();
			}
			
		});
	}
	
	public void drawGUI() {
		//
		//
		//
	}
	
}
package week5;

import java.util.Date;

public class AsterikLogger implements Logger {

	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	
		
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("****************");
		System.out.println("***Error" + error + "***");
		System.out.println("****************");
				
		// TODO Auto-generated method stub
		
	}

}

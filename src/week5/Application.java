package week5;

public class Application {

	public static void main(String[] args) {

		AsterikLogger logger = new  AsterikLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
		
		SpacedLogger spacedlogger = new SpacedLogger();
		
		spacedlogger.log("Hello");
		spacedlogger.error("Hello");
		
		
	}

}

 			
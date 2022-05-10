package chainOfResponsibilityDesignPattern;

public class Driver {
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		fileLogger.setNextLogger(consoleLogger);
		errorLogger.setNextLogger(fileLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain=getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "Info level");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "Debug level");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "Error level");
	}
}

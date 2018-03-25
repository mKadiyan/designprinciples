package indexouofbound.designprinciples.ocp;

import indexouofbound.designprinciples.ocp.logger.handler.LoggingHandler;
import indexouofbound.designprinciples.ocp.logger.type.Logger;
import indexouofbound.designprinciples.ocp.logger.type.LoggerFactory;

public class Start {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.getConsoleLogger();
        Logger fileLogger = LoggerFactory.getFileLogger();

        LoggingHandler loggerHandler = new LoggingHandler(consoleLogger);

        loggerHandler.logMessage("first message");
        loggerHandler = new LoggingHandler(fileLogger);
        loggerHandler.logMessage("second message");
    }
}

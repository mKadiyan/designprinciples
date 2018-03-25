package indexouofbound.designprinciples.ocp;

import indexouofbound.designprinciples.ocp.logger.handler.LoggingHandler;
import indexouofbound.designprinciples.ocp.logger.type.Logger;
import indexouofbound.designprinciples.ocp.logger.type.LoggerFactory;

import static indexouofbound.designprinciples.ocp.logger.handler.LoggingHandlerFactory.getLoggerHandler;

public class Start {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.getConsoleLogger();
        Logger fileLogger = LoggerFactory.getFileLogger();

        LoggingHandler loggerHandler = getLoggerHandler(consoleLogger);

        loggerHandler.logMessage("first message");
        loggerHandler = getLoggerHandler(fileLogger);
        loggerHandler.logMessage("second message");
    }
}

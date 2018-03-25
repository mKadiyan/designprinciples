package indexouofbound.designprinciples.ocp;

import indexouofbound.designprinciples.ocp.logger_dontdo.handler.LoggingHandler;
import indexouofbound.designprinciples.ocp.logger_dontdo.type.Logger;
import indexouofbound.designprinciples.ocp.logger_dontdo.type.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.getConsoleLogger();
        Logger fileLogger = LoggerFactory.getFileLogger();
        LoggingHandler loggingHandler = new LoggingHandler(consoleLogger);
        loggingHandler.logMessage("first Message");
        loggingHandler = new LoggingHandler(fileLogger);
        loggingHandler.logMessage("second Message");

    }
}

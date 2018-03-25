package indexouofbound.designprinciples.ocp.logger.handler;

import indexouofbound.designprinciples.ocp.logger.type.Logger;

public class LoggingHandlerFactory {
    public static LoggingHandler getLoggerHandler(Logger logger){
        return new LoggingHandlerImpl(logger);
    }
}

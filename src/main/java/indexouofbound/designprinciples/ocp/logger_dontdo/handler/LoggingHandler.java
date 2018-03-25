package indexouofbound.designprinciples.ocp.logger_dontdo.handler;

import indexouofbound.designprinciples.ocp.logger_dontdo.type.ConsoleLogger;
import indexouofbound.designprinciples.ocp.logger_dontdo.type.FileLogger;
import indexouofbound.designprinciples.ocp.logger_dontdo.type.Logger;

public class LoggingHandler {

    private Logger logger;

    public LoggingHandler(Logger logger){
        this.logger = logger;
    }

    public void logMessage(String message){
        if(logger instanceof ConsoleLogger)
            ((ConsoleLogger)logger).logInConsole(message);
        else if(logger instanceof FileLogger)
            ((FileLogger)logger).logInFile(message);

    }
}

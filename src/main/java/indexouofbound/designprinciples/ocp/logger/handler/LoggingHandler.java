package indexouofbound.designprinciples.ocp.logger.handler;

import indexouofbound.designprinciples.ocp.logger.type.Logger;

public class LoggingHandler {
    private Logger logger;

    public LoggingHandler(Logger logger){
        this.logger = logger;
    }
    public void logMessage(String message) {
        //doing some internal formatting to message
        this.logger.log(message);
    }
}

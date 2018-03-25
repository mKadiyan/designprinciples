package indexouofbound.designprinciples.ocp.logger.handler;

import indexouofbound.designprinciples.ocp.logger.type.Logger;

class LoggingHandlerImpl implements LoggingHandler{
    private Logger logger;

    LoggingHandlerImpl(Logger logger){
        this.logger = logger;
    }
    @Override
    public void logMessage(String message) {
        //doing some internal formatting to message
        this.logger.log(message);
    }
}

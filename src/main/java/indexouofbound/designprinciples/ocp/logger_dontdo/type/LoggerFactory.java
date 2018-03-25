package indexouofbound.designprinciples.ocp.logger_dontdo.type;

public class LoggerFactory {

    public static Logger getFileLogger(){
        return new FileLogger();
    }

    public static Logger getConsoleLogger(){
        return new ConsoleLogger();
    }
}

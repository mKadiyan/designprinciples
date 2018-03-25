package indexouofbound.designprinciples.ocp.logger_dontdo.type;

public class ConsoleLogger implements Logger {

    public void logInConsole(String message) {
        System.out.println("ConsoleLogger : logging message: "+ message);
    }
}

package indexouofbound.designprinciples.ocp.logger_dontdo.type;

public class FileLogger implements Logger {

    public void logInFile(String message) {
        System.out.println("FileLogger : logging message: "+ message);
    }
}

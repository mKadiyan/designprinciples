package indexouofbound.designprinciples.ocp.logger.type;

class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("FileLogger : logging message: "+ message);
    }
}

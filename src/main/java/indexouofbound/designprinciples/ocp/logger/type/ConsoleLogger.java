package indexouofbound.designprinciples.ocp.logger.type;

class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger : logging message: "+ message);
    }
}

package ocja;

interface ILogger {
    void log();
}
 
public class ArrayInterfaceInitialization {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        for(ILogger logger : loggers)
            logger.log(); //Line n2
    }
}

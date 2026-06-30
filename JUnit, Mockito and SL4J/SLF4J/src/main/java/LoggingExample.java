import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    static Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        System.out.println("Logging example started");

        logger.warn("Warning: Low memory detected.");
        logger.error("Error: Unable to connect to the database.");

        System.out.println("Logging example finished");
    }
}
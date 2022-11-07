package casestudy.utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log {
    public static Logger log = LogManager.getLogger();

    public static void info(String msg){
        log.info(msg);
    }
}

package training.core.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class JavaLogger {
    private Logger logger;
    private String logPath = "appFile.log";

    public JavaLogger() throws IOException {
        logger = Logger.getLogger(JavaLogger.class.getSimpleName());
        FileHandler fh = new FileHandler(logPath);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.info("I'm created");
        logger.setUseParentHandlers(false); // disable console output
    }

    void writeDownDebug(String msg) {
        logger.log(Level.CONFIG, msg);
    }

    void writeDownInfo(String msg) {
        logger.log(Level.INFO, msg);
    }

    void writeDownWarning(String msg) {
        logger.log(Level.WARNING, msg);
    }

    void writeDownError(String msg) {
        logger.log(Level.SEVERE, msg);
    }

    public static void main(String[] args) throws IOException {
        JavaLogger log = new JavaLogger();
        log.writeDownInfo("I like summer");
        log.writeDownDebug("Configuration is available");
        log.writeDownWarning("Permission denied");
        log.writeDownError("Shit happen");
    }

}

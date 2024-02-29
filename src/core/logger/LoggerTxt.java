package core.logger;

public class LoggerTxt implements Logger{
    String filePath;
    public LoggerTxt(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public void log(String message) {

    }
}

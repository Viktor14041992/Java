package HW_5;

public class DataLogger implements IDataLogger {

    String message;
    int errorCode;
    Object tag;
  
    public DataLogger(String message, int errorCode, Object tag) {
      this.message = message;
      this.errorCode = errorCode;
      this.tag = tag;
    }
  
    public DataLogger(String message, int errorCode) {
      this(message, errorCode, null);
    }
  
    public DataLogger(String message) {
      this(message, 0, null);
    }
  
    @Override
    public String getMessage() {
      return message;
    }
  
    @Override
    public Integer getErrorCode() {
      return errorCode;
    }
  
    @Override
    public Object getTag() {
      return tag;
    }
  }
  
  interface ILogger {
    void log(IDataLogger model);
  }

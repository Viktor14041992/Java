package HW_6;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ThisLogger implements ILogger{

    @Override
    public void log(IDataLogger model) {
        
        try (FileWriter writer = new FileWriter("log.log", true)) {

            writer.write(LocalDate.now() + ": ");
            writer.write(model.getMessage());
      
            writer.append('\n');
      
          } catch (IOException ex) {
          }
        }
      }
      
      
interface IDataLogger {
    String getMessage();
  
    Integer getErrorCode();
  
    Object getTag();

}

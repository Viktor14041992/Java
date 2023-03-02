package HW_5;

public class Calc {

    ILogger logger;
  
    public void setLogger(ILogger logger) {
      this.logger = logger;
    }
  
    public Calc(ILogger logger) {
      this.logger = logger;
    }
  
    Integer sum(Operand op1, Operand op2) {
      Integer result = op1.value + op2.value;
      logger.log(new DataLogger(String.format("%d + %d = %d", op1.value, op2.value, result)));
      return result;
    }
  
    Integer div(Operand op1, Operand op2) {
  
      if (op2.value == 0) {
        logger.log(new DataLogger("На 0 делиь нельзя", 101, "введите другое значение"));
        return 0;
      }
      Integer result = op1.value / op2.value;
      logger.log(new DataLogger(String.format("%d / %d = %d", op1.value, op2.value, result)));
      return result;
    }
  
    Integer mult(Operand op1, Operand op2) {
      Integer result = op1.value * op2.value;
      logger.log(new DataLogger(String.format("%d * %d = %d", op1.value, op2.value, result)));
      return result;
    }
  
    Integer sub(Operand op1, Operand op2) {
      Integer result = op1.value - op2.value;
      logger.log(new DataLogger(String.format("%d - %d = %d", op1.value, op2.value, result)));
      return result;
    }
  }

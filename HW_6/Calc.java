package HW_6;

public class Calc {

    private double a;
    private double b;
    ILogger logger;

    public void setLogger(ILogger logger) {
        this.logger = logger;
      }

    public Calc(){
        this.a=0;
        this.b=0;

    }

    public Calc(double a, double b, ILogger logger){
        this.a = a;
        this.b = b;
        this.logger = logger;
    }

    public double add(){
        logger.log(new DataLogger(String.format("%d + %d = %d", a, b, a+b )));
        return a+b;
    }

    public double sub(){
        logger.log(new DataLogger(String.format("%d - %d = %d", a, b, a-b)));
        return a-b;
    }

    public double mult(){
        logger.log(new DataLogger(String.format("%d * %d = %d", a, b, a*b)));
        return a*b;
    }

    public double dev(){
        logger.log(new DataLogger(String.format("%d / %d = %d", a, b, a/b)));
        return a/b;
    }

    public double mod(){
        logger.log(new DataLogger(String.format("%d % %d = %d", a, b, a%b)));
        return a%b;
    }
}


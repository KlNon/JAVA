package CLASS_JAVA.Class_2;

abstract public class Calculation {
    private Double arg1;
    private Double arg2;
    private Double result;

    abstract public Double calculate(Double arg1,Double arg2);

    public double getArg1() {
        return arg1;
    }

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }

    public double getArg2() {
        return arg2;
    }

    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}

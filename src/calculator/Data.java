package calculator;

public class Data {
    private double v1, v2;
    private String s;
    Data(double v1, String s, double v2){
        this.v1 = v1;
        this.v2 = v2;
        this.s = s;
    }
    public double getV1(){return v1;}
    public double getV2(){return v2;}
    public String getS(){return s;}
}




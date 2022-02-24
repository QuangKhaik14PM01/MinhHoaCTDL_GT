package Tuan3Buoi5;

public class IntSquare {
    private double squarevalue;

    public double getSquareOperate(int value){
        this.squarevalue = value*value;
        return this.squarevalue;
    }

    private void calculateSquare(int value){
        this.squarevalue = Math.pow(value, 2);
    }
    
}

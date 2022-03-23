package com.android.s19110239;
public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW, FACT, LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }

    public double fact(double N) {
        if(N != (int)N || N < 0)
            return Double.NaN;
        else
            return factCalc(N);
    }
    public double factCalc(double N){
        if (N == 0)
            return 1;
        else
            return(N * factCalc(N-1));
    }

    public double log(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }
}

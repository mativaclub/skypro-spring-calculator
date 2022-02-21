package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "<b>Welcome to Calculator</b>";
    }

    public String plus(int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public String minus(int num1,int num2) {
        return (num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public String multiply(int num1,int num2) {
        return (num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public String divide(int num1,int num2) {
        return (num1 + " / " + num2 + " = " + num1 / num2);
    }


}

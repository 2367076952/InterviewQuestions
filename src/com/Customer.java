package com;

public class Customer {
    /**
     * 顾客
     * @param strawberryNumber
     * @param appleNumber
     * @return
     */
    public Object customerA(int strawberryNumber, int appleNumber) {
//        草莓和苹果的总价
        int customerANumber = 13 * strawberryNumber + 8 * appleNumber;
        return (Integer) customerANumber >= 0 ? customerANumber : new ArithmeticException();
    }

    public Object customerB(int strawberryNumber, int appleNumber, int MangoNumber) {
//        草莓和苹果和芒果的总价
        int customerBNumber = (int)customerA(strawberryNumber,appleNumber)+ 20 * MangoNumber;
        return (Integer) customerBNumber >= 0 ? customerBNumber : new ArithmeticException();
    }

    public Object customerC(int strawberryNumber, int appleNumber, int MangoNumber) {

        double customerCNumber = (13 * strawberryNumber) * 0.8 + 8 * appleNumber + 20 * MangoNumber;
        return (int) customerCNumber >= 0 ? customerCNumber : new ArithmeticException();
    }

    public Object customerD(int strawberryNumber, int appleNumber, int MangoNumber) {
        int price = (int) customerC(strawberryNumber, appleNumber, MangoNumber);
        if (price >= 100)
            return price - 10;
        return price;
    }
}

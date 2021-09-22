package baseline;

public class PaymentCalculator {
    //data the class stores
    private double balance;
    private double i;
    private double monthlyPayment;
    //class constructor
    PaymentCalculator (double bal, double apr, double monthlyPay) {
        this.balance = bal;
        this.i = apr/365.0/100.0;//oh, as a percent whoops, was getting non-real numbers lol
        this.monthlyPayment = monthlyPay;
    }
    //method to calculate months till paid off
    public int calculateMonthsUntilPaidOff() {
        //uses the class variables to calculate the months until the payment is finished
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double first = (-1/30.0);
        double second = Math.log(1 + (balance/monthlyPayment) * (1 - Math.pow(1 + i,30)));
        double third = Math.log((1 + i));
        return (int) Math.ceil(first * second / third);
    }
    //not making getter or setters since the constructor will initialize all values need anyway
}

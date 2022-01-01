public class Calculate{

    //This is dependency for this class
    ICalculator iCalculator;

    public Calculate(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public void function()
    {
        iCalculator.calculate(10,10);
    }
}

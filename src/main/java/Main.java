public class Main {
    public static void main(String[] args) {
        CalculatorView theView=new CalculatorView();
        Operation theModel= new Operation();
        CalculatorController theController= new CalculatorController(theView,theModel);
        theView.setVisible(true);

    }
}

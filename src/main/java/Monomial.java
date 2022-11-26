public class Monomial {
    private int grad;
    private double coef;

    public Monomial(int grad, double coef) {
        this.grad = grad;
        this.coef = coef;
    }

    public Monomial(String s)
    {
        String[] parts = s.split(("[+-]?(x\\^)"));
        //System.out.println(s);
        this.coef= Double.parseDouble(parts[0]);
        this.grad = Integer.parseInt(parts[1]);
        //System.out.println(this.coef);
        //System.out.println(this.grad);
    }


    public int getGrad() {
        return grad;
    }

    public double getCoef() {
        return coef;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public String toString() {
            return coef+"x^"+grad;
    }
}

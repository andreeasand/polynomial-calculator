import java.awt.event.*;
import java.util.ArrayList;

public class CalculatorController {
    private CalculatorView theView;
    private Operation theModel;
    boolean ok1=false;
    boolean ok2=false;
    String p1;
    String p2;

    public CalculatorController(CalculatorView theView, Operation theModel)
    {
        this.theView=theView;
        this.theModel=theModel;
        this.theView.addText1Listener(new Text1Listener());
        this.theView.addText2Listener(new Text2Listener());
        this.theView.addMultiplicateListener(new MultiplicateListener());
        this.theView.addSubtractListener(new SubtractListener());
        this.theView.addDivideListener(new DivideListener());
        this.theView.addModuloListener(new DerivateListener());
        this.theView.addAddListener(new AddListener());
        this.theView.addExitListener(new IntegrateListener());
        this.theView.addUnuListener(new UnuListener());
        this.theView.addDoiListener(new DoiListener());
        this.theView.addTreiListener(new TreiListener());
        this.theView.addPatruListener(new PatruListener());
        this.theView.addCinciListener(new CinciListener());
        this.theView.addSaseListener(new SaseListener());
        this.theView.addSapteListener(new SapteListener());
        this.theView.addOptListener(new OptListener());
        this.theView.addNouaListener(new NouaListener());
        this.theView.addZeroListener(new ZeroListener());
        this.theView.addPlusListener(new PlusListener());
        this.theView.addMinusListener(new MinusListener());
        this.theView.addDivListener(new DivListener());
        this.theView.addStarListener(new StarListener());
        this.theView.addPutereListener(new PutereListener());
        this.theView.addPunctListener(new PunctListener());
        this.theView.addXListener(new XListener());
        this.theView.addDelListener(new DelListener());
    }

    class Text1Listener implements MouseListener
    {
        public void mouseClicked(MouseEvent e) {
            ok1=true;
            ok2=false;
            theView.setText1("");
            p1="";

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    class Text2Listener implements MouseListener
    {
        public void mouseClicked(MouseEvent e) {
            ok1=false;
            ok2=true;
            theView.setText2("");
            p2="";
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    class UnuListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "1";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "1";
                theView.setText2(p2);
            }
        }
    }
    class DoiListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(ok1==true) {
               p1 = p1 + "2";
               theView.setText1(p1);
           }
           if(ok2==true)
           {
               p2 = p2 + "2";
               theView.setText2(p2);
           }
        }
    }
    class TreiListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true)
            {p1=p1+"3";
            theView.setText1(p1);}
            if(ok2==true)
            {p2=p2+"3";
                theView.setText2(p2);}
        }
    }
    class PatruListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "4";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "4";
                theView.setText2(p2);
            }
        }
    }
    class CinciListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "5";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "5";
                theView.setText2(p2);
            }
        }
    }
    class SaseListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "6";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "6";
                theView.setText2(p2);
            }
        }
    }
    class SapteListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "7";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "7";
                theView.setText2(p2);
            }
        }
    }
    class OptListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "8";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "8";
                theView.setText2(p2);
            }
        }
    }
    class NouaListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "9";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "9";
                theView.setText2(p2);
            }
        }
    }
    class ZeroListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "0";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "0";
                theView.setText2(p2);
            }
        }
    }
    class PlusListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "+";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "+";
                theView.setText2(p2);
            }
        }
    }
    class MinusListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "-";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "-";
                theView.setText2(p2);
            }
        }
    }
    class DivListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "/";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "/";
                theView.setText2(p2);
            }
        }
    }
    class StarListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "*";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "*";
                theView.setText2(p2);
            }
        }
    }
    class PutereListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "^";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "^";
                theView.setText2(p2);
            }
        }
    }
    class PunctListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + ".";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + ".";
                theView.setText2(p2);
            }
        }
    }
    class XListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                p1 = p1 + "x";
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                p2 = p2 + "x";
                theView.setText2(p2);
            }
        }
    }
    class DelListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(ok1==true) {
                if (p1 != null && p1.length() > 0 ) {
                    p1 = p1.substring(0, p1.length() - 1);
                }
                theView.setText1(p1);
            }
            if(ok2==true)
            {
                if (p2 != null && p2.length() > 0 ) {
                    p2 = p2.substring(0, p2.length() - 1);
                }
                theView.setText2(p2);
            }
        }
    }
    class MultiplicateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1= theView.getFirstPolynom();
            String s2=theView.getSecondPolynom();
            Polinom p1=new Polinom(s1);
            Polinom p2=new Polinom(s2);
            theView.setResult(theModel.multiplicate(p1,p2).toString());
        }
    }
    class SubtractListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1= theView.getFirstPolynom();
            String s2=theView.getSecondPolynom();
            Polinom p1=new Polinom(s1);
            Polinom p2=new Polinom(s2);
            theView.setResult(theModel.subtract(p1,p2).toString());
        }
    }
    class DivideListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
             String s1=theView.getFirstPolynom();
             String s2=theView.getSecondPolynom();
             Polinom p1= new Polinom(s1);
             Polinom p2= new Polinom(s2);
            ArrayList<Polinom> rez;
            rez= theModel.divide(p1,p2);
            theView.setResult(rez.get(0).toString());
            theView.setRest(rez.get(1).toString());
        }
    }
    class DerivateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1=theView.getFirstPolynom();
            Polinom p1= new Polinom(s1);
            theView.setResult(theModel.derivate(p1).toString());
        }
    }
    class AddListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1= theView.getFirstPolynom();
            String s2=theView.getSecondPolynom();
            Polinom p1=new Polinom(s1);
            Polinom p2=new Polinom(s2);
            theView.setResult(theModel.addition(p1,p2).toString());
        }
    }
    class IntegrateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1= theView.getFirstPolynom();
            Polinom p1= new Polinom(s1);
            theView.setResult(theModel.integrate(p1).toString()+"+ c");
        }
    }
}

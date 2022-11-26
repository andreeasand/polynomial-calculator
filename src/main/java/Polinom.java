import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Polinom {
    private ArrayList<Monomial> monomialsList=new ArrayList<Monomial>();

    private static final String pattern="([+-]?[^-+]+)";

    public Polinom( ArrayList<Monomial> monomialsList) {
        this.monomialsList = monomialsList;
    }

    public Polinom(String s)
    {
        Pattern p= Pattern.compile(pattern);
        Matcher m=p.matcher(s);
        while(m.find())
        {
            Monomial m1=new Monomial(m.group());
            monomialsList.add(m1);
        }
    }

    public ArrayList<Monomial> getMonomialsList() {
        return monomialsList;
    }

    public String toString() {
        String s="";
        for(Monomial i: monomialsList)
        {
            if(i.getCoef()!=0)
            {
                if(i.getCoef()<0)
                    s=s+i.toString();
                else
                {
                    if(s.equals(""))
                        s=s+i.toString();
                    else
                       s=s+"+"+i.toString();
                }
            }
        }
        return s;
    }

    public Polinom reduce()
    {
       	Polinom rez=new Polinom("");
            int ok=0;
            double coef2=0;
            for(Monomial i: monomialsList)
            {
                if(i.getCoef()!=0.0) {
                    ok = 0;
                    for (Monomial j : rez.getMonomialsList()) {
                        if (i.getGrad() == j.getGrad()) {
                            coef2 = i.getCoef() + j.getCoef();
                            j.setCoef(coef2);
                            ok = 1;
                        }
                    }
                    if (ok == 0)
                        rez.getMonomialsList().add(i);
                }
            }
            return rez;
    }
    public void change(Polinom p)
    {	monomialsList.removeAll(monomialsList);
        for(Monomial i: p.getMonomialsList())
            monomialsList.add(i);
    }
    public Monomial getMonomMax()
    {
        Monomial m=new Monomial(this.getMonomialsList().get(0).getGrad(),this.getMonomialsList().get(0).getCoef());
        for(Monomial i: this.getMonomialsList())
        {
            if(i.getGrad()>m.getGrad() && i.getCoef()!=0.0)
            {
                m.setGrad(i.getGrad());
                m.setCoef(i.getCoef());
            }
        }
        return m;
    }

    public int getIndexMonomMax()
    {
        int index=-1;
        int indexMax=0;   //consideram ca monomul max este m cu index ul 0
        Monomial m=new Monomial(this.getMonomialsList().get(0).getGrad(),this.getMonomialsList().get(0).getCoef());
        for(Monomial i: this.getMonomialsList())
        {
            index++;
            if(i.getGrad()>m.getGrad() && i.getCoef()!=0)
            {
                indexMax=index;
                m.setGrad(i.getGrad());
                m.setCoef(i.getCoef());
            }
        }
        return indexMax;
    }

     public Polinom order()  //ordonam polinomul dupa grad
    {
        Polinom rez= new Polinom("");
        Polinom p= new Polinom(monomialsList);

        while(p.getMonomialsList().size()!=0)
        {
            Monomial m= p.getMonomMax();
            rez.getMonomialsList().add(m);
            int i=p.getIndexMonomMax();
            p.getMonomialsList().remove(i);
        }
        return rez;
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operation {

    Polinom addition (Polinom x, Polinom y)
    {
        Polinom rez = new Polinom("");
        int[] verifj =new int [ y.getMonomialsList().size()];
        int ok=0;
        l1:
        for(Monomial i: x.getMonomialsList()) {
            {
                int jj=-1;
                ok=0;
                for (Monomial j : y.getMonomialsList()) {
                    jj++;
                    if(verifj[jj]==0)
                    {
                        if (i.getGrad() == j.getGrad()) {
                            Monomial m = new Monomial(0, 0);
                            double coef2 = i.getCoef() + j.getCoef();
                            m.setCoef(coef2);
                            m.setGrad(i.getGrad());
                            rez.getMonomialsList().add(m);
                            verifj[jj]=1;
                            ok=1;
                            continue l1;
                        }
                    }
                }
                if(ok==0)
                {
                    rez.getMonomialsList().add(i);
                }

            }
        }
        int jj=0;
        for(Monomial j: y.getMonomialsList())
        {
            if(verifj[jj]==0)
                rez.getMonomialsList().add(j);
            jj++;
        }
        rez.change(rez.reduce());
        rez.change(rez.order());
        return rez;
    }

    Polinom subtract (Polinom x, Polinom y)
    {
        Polinom rez = new Polinom("");
        int[] verifj =new int [ y.getMonomialsList().size()];
        int ok=0;
        l1:
        for(Monomial i: x.getMonomialsList()) {
            {
                int jj=-1;
                ok=0;
                for (Monomial j : y.getMonomialsList()) {
                    jj++;
                    if(verifj[jj]==0)
                    {
                        if (i.getGrad() == j.getGrad()) {
                            Monomial m = new Monomial(0, 0);
                            double coef2 = i.getCoef() - j.getCoef();
                            m.setCoef(coef2);
                            m.setGrad(i.getGrad());
                            rez.getMonomialsList().add(m);
                            verifj[jj]=1;
                            ok=1;
                            continue l1;
                        }
                    }
                }
                if(ok==0)
                {
                    rez.getMonomialsList().add(i);
                }

            }
        }
        int jj=0;
        for(Monomial j: y.getMonomialsList())
        {
            if(verifj[jj]==0)
            {
                double coeff=j.getCoef();
                coeff=-coeff;
                j.setCoef(coeff);
                rez.getMonomialsList().add(j);
            }
            jj++;
        }
        rez.change(rez.order());
        return rez;
    }

    Polinom multiplicate(Polinom x, Polinom y)
    {
        Polinom rez1= new Polinom("");

        for(Monomial i: x.getMonomialsList())
        {
            for(Monomial j: y.getMonomialsList())
            {
                Monomial m = new Monomial(0, 0);
                double coef2 = i.getCoef() * j.getCoef();
                int grad2= i.getGrad() + j.getGrad();
                m.setCoef(coef2);
                m.setGrad(grad2);
                rez1.getMonomialsList().add(m);
            }
        }
        rez1.change(rez1.reduce());
        rez1.change(rez1.order());
        return rez1;
    }

    ArrayList<Polinom> divide (Polinom x, Polinom y)
    {
        ArrayList<Polinom> rez= new ArrayList<>();
        Polinom deimp=new Polinom("");
        Polinom imp=new Polinom("");
        Polinom cat= new Polinom("");
        Polinom rest= new Polinom("");

        Monomial m1= x.getMonomMax();
        Monomial m2=y.getMonomMax();
        if(m1.getGrad()>=m2.getGrad())
        {
            deimp.change(x);
            imp.change(y);
        }
        else
        {
            deimp.change(y);
            imp.change(x);
        }

        rest.change(deimp);
        m1=rest.getMonomMax();
        m2=imp.getMonomMax();

        while( m1.getCoef()!=0 && m1.getGrad()>= m2.getGrad())
        {
            Monomial t= new Monomial(0,0);
            double coef2= m1.getCoef()/ m2.getCoef();
            t.setCoef(coef2);
            t.setGrad(m1.getGrad()- m2.getGrad());
            cat.getMonomialsList().add(t);
            Polinom T=new Polinom("");
            T.getMonomialsList().add(t);
            rest=subtract(rest, multiplicate(T,imp));
            rest.change(rest.reduce());
            m1=rest.getMonomMax();
            System.out.println(m1);
        }
        cat.change(cat.order());
        rest.change(rest.order());
        rez.add(cat);
        rez.add(rest);
        return rez;

    }

    Polinom derivate(Polinom x)
    {
        Polinom rez=new Polinom("");
        for(Monomial i:x.getMonomialsList())
        {
            Monomial m= new Monomial(0,0);
            if(i.getGrad()>=1)
            {
                double coef2=i.getCoef()*i.getGrad();
                m.setCoef(coef2);
                m.setGrad(i.getGrad()-1);
                rez.getMonomialsList().add(m);
            }
        }
        rez.change(rez.order());
        return rez;
    }

    Polinom integrate(Polinom x)
    {
        Polinom rez= new Polinom("");

        for(Monomial i:x.getMonomialsList())
        {
            Monomial m= new Monomial(0,0);
            double coef2=i.getCoef()/(i.getGrad()+1);
            coef2 = Math.round(coef2 * 100.0) / 100.0;
            m.setGrad(i.getGrad()+1);
            m.setCoef(coef2);
            rez.getMonomialsList().add(m);
        }
        rez.change(rez.order());
        return rez;
    }

}

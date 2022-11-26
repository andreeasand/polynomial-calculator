import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class OperationTest {
    Operation m= new Operation();
    @Test
    public void suma() throws Exception {
        Polinom p1= new Polinom("1x^7-1x^8+9x^1-14x^5-1x^3+12x^6+6x^1-8x^0");
        Polinom p2= new Polinom("1x^5+5x^4+3x^5+3x^3-1x^8-6x^1+8x^0");
        assertEquals( "-2.0x^8+1.0x^7+12.0x^6-10.0x^5+5.0x^4+2.0x^3+9.0x^1",m.addition(p1,p2).toString());
    }

    @Test
    public void diferenta() throws Exception{
        Polinom p1= new Polinom("1x^7-1x^8+9x^1-14x^5-1x^3+12x^6+6x^1-8x^0");
        Polinom p2=new Polinom("1x^5+5x^4+3x^5+3x^3-1x^8-6x^1+8x^0");
        assertEquals("1.0x^7+12.0x^6-15.0x^5-3.0x^5-5.0x^4-4.0x^3+15.0x^1+6.0x^1-16.0x^0",m.subtract(p1,p2).toString());
    }

    @Test
    public void produs() throws Exception{
        Polinom p1=new Polinom("3x^2-1x^1+1x^0");
        Polinom p2= new Polinom("1x^1-2x^0");
        assertEquals("3.0x^3-7.0x^2+3.0x^1-2.0x^0",m.multiplicate(p1,p2).toString());
    }

    @Test
    public void cat() throws Exception{
        Polinom p1=new Polinom("1x^3-2x^2+6x^1-5x^0");
        Polinom p2= new Polinom("1x^2-1x^0");
        ArrayList<Polinom> a=new ArrayList<>();
        a.add(new Polinom("1.0x^1-2.0x^0"));
        a.add(new Polinom("7.0x^1-7.0x^0"));
        assertEquals(a.get(0).toString(),m.divide(p1,p2).get(0).toString());
        assertEquals(a.get(1).toString(),m.divide(p1,p2).get(1).toString());
    }

    @Test
    public void derivare() throws Exception{
        Polinom p= new Polinom("1x^3-2x^2+6x^1-5x^0");
        assertEquals("3.0x^2-4.0x^1+6.0x^0",m.derivate(p).toString());
    }

    @Test
    public void integrare() throws Exception{
        Polinom p=new Polinom("1x^3+4x^2+5x^0");
        assertEquals("0.25x^4+1.33x^3+5.0x^1",m.integrate(p).toString());
    }
}

import  org.junit.Test;
import  static org.junit.Assert.assertEquals;


public class TesteRational {

    @Test(expected = IllegalArgumentException.class)
    public void test(){
        Rational r = new Rational(1,0);
    }

    @Test
    public void testisLessThan(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(1,8);
        Rational rational3 = new Rational(3,4);
        Rational rational4 = new Rational(7,8);
        assertEquals("El valor menor a  1/8?", false, rational1.isLessThan(rational2));
        assertEquals("El valor menor a  3/8", true, rational3.isLessThan(rational4));
    }

    @Test
    public void testgetGreater(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(1,8);
        Rational rational3 = new Rational(3,4);
        Rational rational4 = new Rational(7,8);
        assertEquals("El valor mayor entre 1/4 y  1/8 es: ", "1/4", rational1.getGreater(rational2).toString());
        assertEquals("El valor mayor entre 3/4 y  7/8 es: ", "7/8", rational3.getGreater(rational4).toString());
    }

    @Test
    public void testplus(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(1,8);
        assertEquals("El total de la suma entre 1/4 + 1/8 es ", "3/8", rational1.plus(rational2).toString());
    }

    @Test
    public void testminus(){
        Rational rational3 = new Rational(3,4);
        Rational rational4 = new Rational(7,8);
        assertEquals("La diferencia entre 7/8 y 3/4 es", "1/8", rational4.minus(rational3).toString());
    }

    @Test
    public void testtimes(){
        Rational rational3 = new Rational(3,4);
        Rational rational4 = new Rational(7,8);
        assertEquals("El producto de 3/4 * 7/8", "21/32", rational3.times(rational4).toString());
    }
     @Test
      public void testdivides() {
         Rational rational1 = new Rational(1, 4);
         Rational rational2 = new Rational(1, 8);
         assertEquals("La divisi'o de 1/4 para 1/8 es ", "2", rational1.divides(rational2).toString());
     }
}


package weights;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP2 on 12/01/2015.
 */
public class QuantityTest {

    @Test
    public void testQuantityAreEqual() throws Exception {
        Quantity quantity1 = new Quantity(2, Units.KG);
        Quantity quantity2 = new Quantity(2000, Units.GRAM);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void testLengthAreEquals(){
        Quantity quantity1 = new Quantity(12, Units.INCH);
        Quantity quantity2 = new Quantity(1, Units.FEET);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void testLengthAreEqualsForYArd(){
        Quantity quantity1 = new Quantity(72, Units.INCH);
        Quantity quantity2 = new Quantity(2, Units.YARD);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void testTemparatureForKelvin() {
        Quantity quantity = new Quantity(274, Units.KELVIN);
        Quantity quantity1 = new Quantity(1, Units.CELCIOUS);
        assertEquals(quantity, quantity1);
    }
}
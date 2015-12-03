package weights;



import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by HP2 on 12/01/2015.
 */
public class WeightsTest {

    @Test
    public void testWeightsAreUnEqual(){
        Weights weights = new Weights(10, WeighingUnits.KILOGRAM);
        Assert.assertNotEquals(weights, new Weights(10, WeighingUnits.GRAM));
    }

    @Test
    public void testWeightsAreEqual(){
        Weights weights = new Weights(10, WeighingUnits.KILOGRAM);
        assertEquals(weights, new Weights(10, WeighingUnits.KILOGRAM));
    }

    @Test
    public void testWeightsAreEqualForDifferentUnits() throws Exception {
        Weights weight1 = new Weights(50,WeighingUnits.KILOGRAM);
        Weights weight2=new Weights(50000,WeighingUnits.GRAM);
        assertEquals(weight1, weight2);

    }



    @Test
    public void testConvertToYard() {

        assertEquals(1, LengthUnits.convertToYard(1, LengthUnits.YARD));
        assertEquals(1, LengthUnits.convertToYard(36, LengthUnits.FEET));
        assertEquals(1, LengthUnits.convertToYard(12*36, LengthUnits.INCH));
    }
}
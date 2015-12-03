package weights;

import org.junit.Before;
import org.junit.Test;
import probability.Probability;


/**
 * Created by HP2 on 12/01/2015.
 */

public class ProbabilityTest {

    Probability probability;

    @Before
    public void setUp() {
        probability = new Probability();
    }


    @Test
    public void testProbabilityIsValid(){
        probability.probabilityIsValid(0.3);

    }


    @Test
    public void testNotProbability() throws Exception {

        probability.notForProbablity(0.3);


    }

    @Test
    public void testIntersectionForProbability(){
        probability.getIntersection(0.3, 0.4);
    }

}
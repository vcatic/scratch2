package at.ac.htl.bhitm3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void when_getSum_then_result_is_377(){
        App app = new App();

        assertEquals( 385, app.getSum());

    }
}

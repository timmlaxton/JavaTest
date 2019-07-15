import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void hasSip(){
        assertEquals(90,waterbottle.sip());
    }

    @Test
    public void emptybottle(){
        assertEquals(0, waterbottle.empty());

    }
    
    @Test
    public void fillbottle(){
        waterbottle.empty();
        assertEquals(100, waterbottle.fill());
    }

}


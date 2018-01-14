package test;
import static junit.framework.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import app.Main;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        Main main = new Main();
    }

    @Test
    public void testCreateWindow() {

        assertNotNull(true);
    }
}
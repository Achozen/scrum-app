package test;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import app.*;
import junit.framework.Assert;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        Main main = new Main();
    }

    @Test
    public void testCreateWindow() {

        assertNotNull(true);
    }
    
    @Test
    public void testSetupWindow() {
    	JFrame frame = new JFrame();
        Main main = new Main();
    	main.setupWindow(frame);
    	Assert.assertEquals(500, frame.getHeight());
    	Assert.assertEquals(500, frame.getWidth());
    }
}
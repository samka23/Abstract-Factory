package com.example.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    public void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        Button btn = factory.createButton();
        assertEquals("Windows Button", btn.paint());
    }

    @Test
    public void testMacFactory() {
        GUIFactory factory = new MacFactory();
        Checkbox cb = factory.createCheckbox();
        assertEquals("Mac Checkbox", cb.render());
    }
}

package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("Comté", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("Comté", app.items[0].name);
        assertEquals(2, app.items[0].quality);
    }

}

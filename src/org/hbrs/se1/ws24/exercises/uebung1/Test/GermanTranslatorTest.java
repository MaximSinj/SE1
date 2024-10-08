package org.hbrs.se1.ws24.exercises.uebung1.Test;
import org.hbrs.se1.ws24.exercises.uebung1.view.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GermanTranslatorTest {
    private Translator translator = null;

    @BeforeEach
    void setUp() {
        this.translator = new GermanTranslator();
    }

    @Test
    void translateNumber() {
        // Positiv
        assertEquals("eins", this.translator.translateNumber(1));
        // Negativer Test
        String test = "Übersetzung der Zahl 11 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test, this.translator.translateNumber(11));
        // Negativ
        String test2 = "Übersetzung der Zahl -14 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test2, this.translator.translateNumber(-14));
        // Negativ
        String test3 = "Übersetzung der Zahl 0 nicht möglich! (V " + Translator.version + ")";
        assertEquals(test3, this.translator.translateNumber(0));
    }
}

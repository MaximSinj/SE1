package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.solutions.uebung1.control.Translator;
import org.hbrs.se1.ws24.solutions.uebung1.view.ClientDI;

public class Assembler {

    public Assembler() {
        GermanTranslator germanTranslator = new GermanTranslator();
        ClientDI client = new ClientDI((Translator) germanTranslator);

        client.display(1);

        // client.setTranslator( new EnglishTranslator());

        client.display(2);
    }

    public static void main(String[] args) {
        Assembler assembler = new Assembler();
    }

}
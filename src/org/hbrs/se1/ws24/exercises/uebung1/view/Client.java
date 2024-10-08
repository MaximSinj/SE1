package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Factory;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

public class Client {

		/**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ) {
			 Translator translator = Factory.createGermanTranslator(); //Erstellung eines GermanTranslators
			 String result = translator.translateNumber(aNumber);
			 System.out.println("Das Ergebnis der Berechnung: " +
					 "[das Ergebnis an dieser Stelle]");
		 }
}







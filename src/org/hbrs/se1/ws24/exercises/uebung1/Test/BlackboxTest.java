package org.hbrs.se1.ws24.exercises.uebung1.Test;
import org.hbrs.se1.ws24.exercises.uebung1.view.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.*;

public class BlackboxTest {
    private Client client = null;


    public BlackboxTest() {
        client = new Client();

    }

    public void test(){

        //positiv
        client.display(1);
        client.display(2);
        client.display(3);
        client.display(4);
        client.display(5);
        client.display(6);

        //negativ
        client.display(0);
        client.display(-1);
        client.display(20);
    }

    public static void main(String[]args){
        BlackboxTest bbt = new BlackboxTest();
        bbt.test();
    }
}

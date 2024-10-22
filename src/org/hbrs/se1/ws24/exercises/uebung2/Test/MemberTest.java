package org.hbrs.se1.ws24.exercises.uebung2.Test;
import org.hbrs.se1.ws24.exercises.uebung2.ConcreteMember;
import org.hbrs.se1.ws24.exercises.uebung2.Container;
import org.hbrs.se1.ws24.exercises.uebung2.ContainerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    @Test
    void test() throws ContainerException {
        Container c1 = Container.getInstance(); //new Container();
        ConcreteMember Hans = new ConcreteMember(3);
        ConcreteMember Dieter = new ConcreteMember(8);
        ConcreteMember Walter = new ConcreteMember(17);

        assertEquals(0, c1.size());
        c1.addMember(Hans);
        assertEquals(1, c1.size());
        c1.addMember(Dieter);
        assertEquals(2, c1.size());
        c1.addMember(Walter);
        assertEquals(3, c1.size());
        assertThrows(ContainerException.class,
                () -> {
                    c1.addMember(Hans);
                });
        c1.deleteMember(8);
        assertEquals(2, c1.size());
        c1.deleteMember(17);
        assertEquals(1, c1.size());
        c1.deleteMember(4);
        assertEquals(1, c1.size());
        c1.deleteMember(3);
        assertEquals(0, c1.size());


    }
}
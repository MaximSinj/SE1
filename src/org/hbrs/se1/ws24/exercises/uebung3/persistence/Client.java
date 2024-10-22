package org.hbrs.se1.ws24.exercises.uebung3.persistence;
import org.hbrs.se1.ws24.exercises.uebung2.*;
public class Client {

    // CR3:
    public static void main(String[] args) throws ContainerException {
        Container container = Container.getInstance(); //erstellt Container Instanz
        MemberView mv = new MemberView(); //erstellt MemberView Instanz

        // Erstellung diverser Member-Objekte
        Member Hans = new ConcreteMember(3);
        Member Franz = new ConcreteMember(5);
        Member Peter = new ConcreteMember(17);
        Member Alex = new ConcreteMember(1);

        // Member-Objekte werden in Container hinzugefügt
        container.addMember(Hans);
        container.addMember(Franz);
        container.addMember(Peter);
        container.addMember(Alex);

        // Memberliste wird mit getCurrentList() ausgelesen und mit Memberview.dump() ausgegeben
        mv.dump(container.getCurrentList());

    }
}
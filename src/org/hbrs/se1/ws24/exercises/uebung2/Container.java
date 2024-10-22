package org.hbrs.se1.ws24.exercises.uebung2;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategy;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

public class Container {

    private PersistenceStrategy<Member> persistenceStrategy;

    //CR1 Singleton
    private static final Container instance = new Container();

    private Container() {}

    public static Container getInstance() {
        return instance;
    }


    ArrayList<Member> MemberList = new ArrayList<>();

    // FA1:
    public void addMember(Member member) throws ContainerException {
        for (int i = 0; i < MemberList.size(); i++) {
            if (MemberList.get(i).getID() == member.getID()) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }
        MemberList.add(member);
    }

    // FA2:
    public String deleteMember(Integer id) {
        for (int i = 0; i < MemberList.size(); i++) {
            if (MemberList.get(i).getID() == id) {
                return "ID: " + MemberList.remove(i) + " wurde erfolgreich entfernt.";
            }
        }
        return "Die angegebene ID: " + id + " ist nicht vorhanden!";
    }

    // FA3:
    private String toString(Member member) {
        return "Member (ID = " + member.getID() + ")";
    }

    public void dump() {
        for (int i = 0; i < MemberList.size(); i++) {
            System.out.println(toString(MemberList.get(i)));
        }
    }

    // FA4:
    public int size() {
        return MemberList.size();
    }

    //CR2
    public void store() throws PersistenceException {
        if (persistenceStrategy == null)
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet, "Es ist keine Strategie gesetzt!");
    }

    //CR3
    public List<Member> getCurrentList(){
        return MemberList;
    }
}


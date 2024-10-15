package org.hbrs.se1.ws24.exercises.uebung2;

public class ConcreteMember implements Member{
    Integer ID;

    public ConcreteMember(Integer ID){
        this. ID = ID;
    }
    @Override
    public Integer getID() {
        return ID;
    }
}

package org.hbrs.se1.ws24.exercises.uebung2;
import java.util.ArrayList;

public class Container {

    ArrayList<Member> MemberList = new ArrayList<>();

    // FA1:
    public void addMember(Member member) throws ContainerException{
        for (int i = 0; i < MemberList.size(); i++){
            if(MemberList.get(i).getID() == member.getID()){
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() +  " ist bereits vorhanden!");
            }
        }
        MemberList.add(member);
    }

    // FA2:
    public String deleteMember(Integer id){
        for (int i = 0; i < MemberList.size(); i++){
            if(MemberList.get(i).getID() == id){
                return "ID: " + MemberList.remove(i) + " wurde erfolgreich entfernt.";
            }
        }
        return "Die angegebene ID: " + id + " ist nicht vorhanden!";
    }

    // FA3:
    private String toString(Member member){
        return "Member (ID = " + member.getID() + ")";
    }

    public void dump(){
        for (int i = 0; i < MemberList.size(); i++){
            System.out.println(toString(MemberList.get(i)));
        }
    }

    // FA4:
    public int size(){
        return MemberList.size();
    }
}

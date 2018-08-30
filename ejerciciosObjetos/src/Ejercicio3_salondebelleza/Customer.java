package Ejercicio3_salondebelleza;

public class Customer {

private String name;
private boolean member=false;
private String memberType;

public Customer(){    
}

public String getName(){
    return this.name;
}

public void setName(String name){
    this.name=name;
}

public boolean isMember(){
    return this.member;
}

public void setMember(boolean membertype){
    this.member=membertype;
}

public void setMembertype (String membertype){
    this.memberType=membertype;
}

public String getMembertype(){
    return this.memberType;
}

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }


}
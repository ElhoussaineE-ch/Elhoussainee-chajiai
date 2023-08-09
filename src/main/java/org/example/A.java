package org.example;


public class A {
    private B b ;
    // new les class dériver quand va utilisé !!
    //mais utilisation de new -> couplage frort il faur l'evité

    public void cla(){
        String a =b.ou_isan("hassan");
        System.out.println(a);
    }

    public void setB(B b) {
        this.b = b;
    }
}

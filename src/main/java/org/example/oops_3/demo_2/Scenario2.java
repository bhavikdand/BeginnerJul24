package org.example.oops_3.demo_2;

public class Scenario2 {
}

class AA{
    public AA() {
        System.out.println("AA");
    }
}

class BB extends AA{
    public BB(){ //make this private to get the below error
        System.out.println("BB");
    }
}

class CC extends BB{
    public CC(){ //There is no parameterless constructor available in 'org.example.oops_3.demo_2.BB'
        System.out.println("CC");
    }
}

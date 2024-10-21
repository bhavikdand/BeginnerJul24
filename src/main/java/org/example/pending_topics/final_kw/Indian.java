package org.example.pending_topics.final_kw;

public class Indian {
    final String name;
    final String aadharNumber;


    public Indian(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    public final void print(){
        System.out.println(name + " " + aadharNumber);
    }
}

class SuperIndian extends Indian{ //Cannot inherit from final 'org.example.pending_topics.final_kw.Indian'
    public SuperIndian(String name, String aadharNumber) {
        super(name, aadharNumber);
    }

//    @Override
//    public void print() { //'print()' cannot override 'print()' in 'org.example.pending_topics.final_kw.Indian'; overridden method is final
//        System.out.println("I am overriding");
//    }
}
package adv_lc_1.generics.intro;

public class Pair <K,V>{
    K key;
    V value;

    // Break till 10.19 PM
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    
}


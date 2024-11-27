package design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private static StudentRegistry INSTANCE;

    private StudentRegistry(){
        map = new HashMap<>();
    }

    public static StudentRegistry getInstance(){
        if(INSTANCE == null){
            INSTANCE = new StudentRegistry();
        }
        return INSTANCE;
    }

    private Map<String, Student> map;

    public void register(String key, Student s){
        map.put(key, s);
    }

    public Student get(String key){
        return map.get(key);
    }

}

package tddstart;

import java.util.HashMap;
import java.util.Map;

public class Dictionnary {

    private String name;

    public Map<String, String> translations  = new HashMap<String, String>();

    public Dictionnary(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isEmpty(){
        return this.translations.isEmpty();
    }

    public void addTranslation(String word,String translated){
        this.translations.put(word,translated);
    }
    public String getTranslation(String word){

        return this.translations.get(word);
    }
}

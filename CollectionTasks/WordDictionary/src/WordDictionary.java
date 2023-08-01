import java.util.*;

public class WordDictionary {
   Map<Character , TreeSet<String>> dictionary ;
   public WordDictionary(){
       dictionary= new TreeMap<>();
   }
   public void add(String word)
   {
       char firstCharacter = Character.toUpperCase(word.charAt(0));

       if(word!=null && word!="")
       {

          if(dictionary.get(firstCharacter)==null)
          {
              TreeSet<String> words = new TreeSet<>();
              words.add(word);
              dictionary.put(firstCharacter,words);
          }else {
              TreeSet<String> words = dictionary.get(firstCharacter);
              words.add(word);
              dictionary.put(firstCharacter, words);
          }
          }


   }
   public void printWordsBykey(char key)
   {
       key = Character.toUpperCase(key);
       TreeSet<String> words = dictionary.get(key);
       System.out.println(words);

   }
   public void printAll()
   {
      dictionary.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
   }
//
}

public class DictionaryApplication {
    public static void main(String [] args){
        WordDictionary dictionary = new WordDictionary();
        dictionary.add("Application");
        dictionary.add("Job");
        dictionary.add("Hacker");
        dictionary.add("System");
        dictionary.add("Java");
        dictionary.add("Html");
        dictionary.add("CSS");
        dictionary.add("Cairo");
        dictionary.add("American");
        dictionary.add("Egypt");
        dictionary.add("program");
        dictionary.add("python");


        dictionary.printAll();

        System.out.println("-------------------------------------");
        System.out.println("Words Start with A is :");
        dictionary.printWordsBykey('a');

        System.out.println("Words Start with C is :");
        dictionary.printWordsBykey('C');

    }
}

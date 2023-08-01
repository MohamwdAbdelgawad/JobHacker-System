import javax.xml.bind.Element;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperationOnSet {
    static Set<Integer> set;
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = input.nextInt();

        for (int i=0; i<numberOfTestCases; i++)
        {
              set = new HashSet();
            int numberOfQueries = input.nextInt();
            char choice ;
            for (int j = 0; j<numberOfQueries; j++ )
            {
                choice =input.next().charAt(0);
                int element;
                switch (choice){
                    case 'a' :
                        element = input.nextInt();
                        addToSet(element);
                        break;
                    case 'b' :
                        printSet();
                        break;
                    case 'c' :
                        element = input.nextInt();
                        eraseFromSet(element);
                        break;
                    case 'd' :
                        element = input.nextInt();
                        System.out.println(isExist(element));
                        break;
                    case 'e' :
                        System.out.println(set.size());

                }


            }
        }

    }
    public static void addToSet(int element)
    {
            set.add(element);
    }
    public static void printSet()
    {
        for (Integer element : set)
        {
            System.out.print(element + " ");
        }
    }
    public static void eraseFromSet(int element)
    {
        set.remove(element);
    }
    public static int isExist(int element)
    {
        if(set.contains(element))
        {
            return 1;
        }else
        {
            return -1;
        }
    }

}

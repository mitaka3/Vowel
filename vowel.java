/**
 *
 * @author user
 */
public class Vowels {
    public static void main(String[] args)
    {
        String [] names = {"Justin", "Joshua", "Juliana", "Rezzie", "Wilfredo"};
        
        System.out.println ("Name of the Family members: ");
        for (int i=0; i<5; ++i)
        {
            System.out.println(names[i]);
            System.out.println ("The total amount of vowels in the name is: " + vowel_count(names[i]) + " \n");
        }
    }
        
  
    
    public static int vowel_count(String names)
    {
        int count = 0;
        for (int i = 0; i < names.length(); i++)
        {
            if (names.charAt(i) == 'a' || names.charAt(i) == 'e' || names.charAt(i) == 'i' ||
                    names.charAt(i) == 'o' || names.charAt(i) == 'u' || names.charAt(i) == 'A' || names.charAt(i) == 'E' || names.charAt(i) == 'I' ||
                    names.charAt(i) == 'O' || names.charAt(i) == 'U' )
            {
                count++;
            }
        }
        return count;
    }
}
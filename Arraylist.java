
package arraylist;
import java.util.ArrayList;//implementing array list
public class Arraylist {
    public static void main(String[] args) {
       ArrayList<String>a=new ArrayList<String>();
       a.add("pizza");
       a.add("pani puri");
       a.add("french fries");
       a.add(0,"burger");
       System.out.printf("the food items that are available in my hotel...\n");
       for(int i=0;i<a.size();i++)
           System.out.printf("%s\n",a.get(i));
       a.remove("pani puri");
       System.out.printf("\npani puri is out of stock now...\n");
       System.out.printf("\nafter finishing pani puri from the hotel,now the items are...\n");
       for(int i=0;i<a.size();i++)
           System.out.printf("%s\n",a.get(i));
       System.out.printf("\n check whether the pizza is present in the hotel...\n",
       a.contains("pizza") ? "yes..": "not");
       System.out.printf("\n display no.of items in the hotel... ");
       System.out.printf("%s\n",a.size());
       
        // TODO code application logic here
    }
    
}

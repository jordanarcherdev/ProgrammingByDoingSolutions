
public class CompareToChallenge
{
    public static void main(String[] args)
    {
        System.out.print("Comparing \"bee\" with \"ant\" produces: ");
        int i = "bee".compareTo("ant");
        System.out.println(i);
        
        System.out.print("Comparing \"axe\" with \"dog\" produces: ");
        System.out.println("axe".compareTo("dog"));
        
        System.out.print("Comparing \"word\" with \"dump\" produces: ");
        System.out.println("word".compareTo("dump"));
        
        System.out.print("Comparing \"apple\" with \"banana\" produces: ");
        System.out.println("apple".compareTo("banana"));
        
        System.out.print("Comparing \"Jordan\" with \"Archer\" produces: ");
        System.out.println("Jordan".compareTo("Archer"));
        
        System.out.print("Comparing \"George\" with \"Knoble\" produces: ");
        int j = "George".compareTo("Knoble");
        System.out.println(j);
    }
}

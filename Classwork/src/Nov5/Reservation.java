package Nov5;

/**
 *
 * @author 
 */
public class Reservation 
{
    private String name;
    private int time;
    private int party;
    
    public Reservation(String name, int time, int party)
    {
        this.name = name;
        this.time = time; // military time
        this.party = party;
    }
    
    public String toString()
    {
        return "\n\nName: " + name + "\nTime: " + time + "\nParty size: " + party;
    }
}

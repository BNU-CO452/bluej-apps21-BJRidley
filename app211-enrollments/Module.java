
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // The Module code
    private String code;
    // The Moduel title
    private String title;
    // The course credits
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, int credit, String code)
        /**
     * Create a new student with a given name and ID number.
     */
    {
        this.credit = credit;
        this.title = title;
        this.code = code;
    }

    /**
     * Return the full name of this student.
     */
    public String getTitle()
    {
        return title;
    }
    
        /**
     * Return the full name of this student.
     */
    public String getCode()
    {
        return code;
    }
    
        /**
     * Return the full name of this student.
     */
    public int getCredit()
    {
        return credit;
    }
}

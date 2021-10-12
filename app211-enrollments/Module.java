
/**
 * class Module to represent the vales for module name
 * credit value.
 *
 * @author (Ben Ridley)
 * @version (9.10.21)
 */
public class Module
{
    // The Module code
    private String code;
    // The Module title
    private String title;
    // The course credits
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String code)
        /**
     * Create course credits worth, module title 
     * and module code.
     */
    {
        this.credit = 0;
        this.title = title;
        this.code = code;
    }

    /**
     * Return the title of the module.
     */
    public String getTitle()
    {
        return title;
    }
    
        /**
     * Return the code for the module.
     */
    public String getCode()
    {
        return code;
    }
    
        /**
     * Return the credis for the module.
     */
    public int getCredit()
    {
        return credit;
    }
    
    public void setcredit(int credit)
    {
        this.credit = credit;
    }
    
        /**
     * Print the details of the modue code, the module name and credits for the module.
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + " Module: " + title + " Module Credits: " + credit); 
    }
}

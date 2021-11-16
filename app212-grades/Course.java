import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
     
    public Course()
    {
        this("BT1GDV1", "BSc Games Development");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        //initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module co452 = new Module("CO452","Programming Concepts");
        Module co450 = new Module("CO450","Computer Architectures");
        Module co461 = new Module("CO461","3D Modelling");
        Module co459 = new Module("CO459","Game Design");
   /**
     * Creating four modules /\ 
     * and adding them to the modules list \/
     */        
        addModule(co452);
        addModule(co450); 
        addModule(co461);
        addModule(co459);
    }
    
    /**
     * if statment to add modules as long as less than value set in MAXN_MODULES (4) as declaired as static variable
     */
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * else if statements to set which value give what grade
     */
    public Grades convertToGrade(int mark)
    {
        if (mark >= 1 && mark <= 39)
		return Grades.F;
	else if (mark >= 40 && mark <= 49)
		return Grades.D;
	else if (mark >= 50 && mark <= 59)
		return Grades.C;
	else if (mark >= 60 && mark <= 69)
		return Grades.B;
	else if (mark >= 70)
		return Grades.A;
	else
		return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     * 
     * created 2 variables to store data
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int totalmark = 0;
	int finalmark = 0;
        for(ModuleMark modulemark : marks)
	{
		totalmark = totalmark + modulemark.getValue();
	}
	
	finalmark = totalmark / MAXN_MODULES;
	finalGrade = convertToGrade(finalmark);
    /**
     * finalGrade was already created. Just making use of it
     */
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for (Module module : modules)
        {
        	module.print();
        }
    }
}

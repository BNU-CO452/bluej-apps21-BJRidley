
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if (choice.equals("add"))
        {
            int productID = reader.getInt("Please enter a new product ID number: ");
            String productName = reader.getString("Please enter the name of the new game. ");
            Product product = new Product(productID, productName);
            
            stock.add(product);
            
            System.out.println("****************************************************************");
            System.out.println("You have added a new game with the ID of " + product.getID() +
            " and the name of " + product.getName());
            System.out.println("****************************************************************");
        }    
        else if (choice.equals("remove"))
        {
            int productID = reader.getInt("Please enter a product ID number: ");
            Product product = stock.findProduct(productID);
            stock.remove(productID);
            
            System.out.println("****************************************************************");
            System.out.println("You have removed a game with the ID of " + product.getID() +
            " and the name of " + product.getName());
            System.out.println("****************************************************************");
            
        }
        
        else if (choice.equals("buy"))
        {
            int amount = reader.getInt("Please enter the amount you wish to purchase: ");
            int productID = reader.getInt("Please enter a product ID number of the item you wish to purchase for. ");
            Product product = stock.findProduct(productID);
            stock.buyProduct(productID, amount);
            
            System.out.println("****************************************************************");
            System.out.println("You have bought " + amount + " of stock for the follwing product "
            + product.getID() + " " + product.getName());
            System.out.println("****************************************************************");
        }
        
        else if (choice.equals("sell"))
        {
            int amount = reader.getInt("Please enter the amount you wish to sell: ");
            int productID = reader.getInt("Please enter a product ID number of the item you wish to sell. ");
            Product product = stock.findProduct(productID);
            stock.sellProduct(productID, amount);
            
            System.out.println("****************************************************************");
            System.out.println("You have sold " + amount + " of stock for the follwing product "
            + product.getID() + " " + product.getName());
            System.out.println("****************************************************************");
        }
        
        else if (choice.equals("search id"))
        {
            int productID = reader.getInt("Please enter the ID number of the item you are looking for: ");
            Product product = stock.findProduct(productID);
            
            System.out.println("****************************************************************");
            System.out.println("You have searched for ID " + product.getID() + "." +
            " This Game is:  " + product.getName());
            System.out.println("****************************************************************");
        }
        
        //else if (choice.equals("low stock"))
        //{
           
           // for (Product product = stock);
            
           // System.out.println("****************************************************************");
           // System.out.println("These are the items low on stock: ");
           // System.out.println("ID: " + product.getID() + " Name " + product.getName());
           // System.out.println("****************************************************************");
            
       // }
        
        //else if (choice.equals("low stock"))
        //{
            //int amount = reader.getInt("Please enter the amount you wish to sell: ");
            //int productID = reader.getInt("Please enter a product ID number of the item you wish to sell. ");
            //Product product = stock.findProduct(productID);
            //stock.sellProduct(productID, amount);
            //System.out.println("You have sold " + amount + " of stock for the follwing product "
            //+ product.getID() + " " + product.getName());
            
       // }
        
        else if(choice.equals("print"))
        {

            stock.print();
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buys more stock of an item");
        System.out.println("    Sell:       Sells stock of an item");
        System.out.println("    Search ID:  Searches for item with that ID");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Ben Ridley");
        System.out.println("********************************");
    }
}
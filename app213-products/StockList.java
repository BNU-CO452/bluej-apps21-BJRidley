import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        //increase the quantity of a product based on ID 
        //by the value in amount
        
        Product product = findProduct(productID);
        if(product != null)
            product.increaseQuantity(amount);
        else
            System.out.println("Item could not be found");
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for (Product product : stock)
        {
            if(product.getID() == productID)
            return product;

        }  
        return null;
    }
    
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell any amount of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    
    //created a variable called amount to be used in findProduct
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            // Checks to make sure that the value in amount 
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                // used the newly created amount variable to store
                // a value other than 1 that was previously here
                // to alllow it to be decreaed by any value until 0 
                product.decreaseQuantity(amount);
                
                System.out.println("An order of " + amount + " copies of " + 
                product.getName() + " has been made");

            }
            else if (product.getQuantity() == 0)
            {
                System.out.println("The item " + product.getName() + 
                " is out of stock");
            }
            
            else
            {
                System.out.println("An order of " + product.getName() + 
                " can not be completed because you have ordered a quantity " +
                "over our available stock. We have " + product.getQuantity() + " in stock");
            }
        }
        
        else
        {
            System.out.println("Item could not be found");
        }
        
        if (product.getQuantity() <=3)
            {
                System.out.println(" ====================");
                System.out.println ("These items are low on stock ");
                System.out.println (product.getName() + " has " +
                product.getQuantity() + " in stock");
                System.out.println(" ====================");
 		System.out.println();
            }
    }    
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    // Removed as it did not work
    
        //public void removeItem(int id)
    //{
        //Product product = findProduct(id);
       // if (product.getQuantity() == 0);
        //{
            //stock.remove(product);
           // System.out.println (product.getName() + " had been removed from our store ");
           // System.out.println (" Due to it being out of stock. ");
           // System.out.println (" We will re-add the item once it is back on stock.");
        //}
    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
        {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()

    {
        System.out.println();
        System.out.println(" Ben's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
    
}
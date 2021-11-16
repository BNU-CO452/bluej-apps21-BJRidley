import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        this.random = new Random();
        
        // Tried setting IDs as 01-10 but cant as numbers starting with 0
        // are considered octal numbers and they can only range  from 0 to 7
        // so followed the name ID format as what was there originally
        
        stock.add(new Product(101, "Tales of Arise"));
        stock.add(new Product(102, "Melty Blood: Type Lumina"));
        stock.add(new Product(103, "Dragon Ball FighterZ"));
        stock.add(new Product(104, "Mario Kart 8"));
        stock.add(new Product(105, "Demon Souls"));
        stock.add(new Product(106, "Kingdom Hearts 3"));
        stock.add(new Product(107, "Persona 5"));
        stock.add(new Product(108, "Ghost Of Tsushima"));
        stock.add(new Product(109, "Star Wars Jedi: Fallen Order"));
        stock.add(new Product(110, "Dragon Ball Z: Kakarot"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        // randomises the amount of items bought
        for (int gamesID = 101; gamesID <=110; gamesID++)
        stock.buyProduct(gamesID, random.nextInt(11));
    }

    private void sellProducts()
    {
        // randomises the amount of items sold
       for (int gamesID = 101; gamesID <=110; gamesID++)
        stock.sellProduct(gamesID, random.nextInt(11));
    }    
}
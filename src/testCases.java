
import org.testng.annotations.Test;

public class testCases {
    @Test (priority = 1)
    static void open(){
        Open.main();
    }
    @Test (priority = 2)
    static void product(){
        Product.main();
    }
    @Test (priority = 3)
    static void cart(){
        Cart.main();
    }
    @Test (priority = 4)
    static void checkout(){
        Checkout.main();
    }

}

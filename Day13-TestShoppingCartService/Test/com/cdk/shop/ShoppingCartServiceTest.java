package com.cdk.shop;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.cdk.shop.ItemNotFoundException;

import java.util.Map;

/**
 * Created by choubeyp on 8/2/2017.
 */
public class ShoppingCartServiceTest {
    ShoppingCartService shoppingCartService = null;
    Product product = null;
    @Before
    public void init(){
        shoppingCartService = new ShoppingCartService();
        product = new Product(500L,"Hair Dryer",56000,10);
    }

    @Test
    public void testCountTestEmptyCart(){
        assertEquals(0, shoppingCartService.countItems());
    }

    @Test(expected = Exception.class)
    public void testNullAddItem(){                 //to test null input in add item function
        shoppingCartService.addItem(null);
        assertEquals(null,shoppingCartService.cart.values());
    }

    @Test
    public void testAddItem(){                        //to test quantity increase in add item
        shoppingCartService.addItem(product);
        shoppingCartService.addItem(product);
        assertEquals(11,shoppingCartService.cart.get(500L).getQty());
    }

    @Test
    public void testShowCartDetails(){             //to test cart details
        assertEquals(shoppingCartService.cart.values(),shoppingCartService.showCartDetails());
    }

    @Test
    public void testTotalPrice(){                       //to test the price computed
        shoppingCartService.addItem(product);
        assertEquals((product.getPrice()*product.getQty()),shoppingCartService.totalPrice(),2);
    }

    @Test(expected = ItemNotFoundException.class)     //to test if exception is thrown at invalid itemid
    public void testRemoveItemException() throws ItemNotFoundException{
        shoppingCartService.removeItem(400L);
    }

    @Test
    public void testCartClear(){             //to test if cart gets empty or not
        shoppingCartService.addItem(product);
        shoppingCartService.emptyCart();
        assertEquals(shoppingCartService.cart.values(),shoppingCartService.showCartDetails());
    }
}

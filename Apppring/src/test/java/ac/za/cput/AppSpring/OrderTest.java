package ac.za.cput.AppSpring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void equals() {
    }

    @Test
    public void createOrerTest() {
        Order order = new Order.Builder().cheese("yess").chicken("no").drink("no").source("qwe").id("i").build();

                Assert.assertEquals("no",order.getChicken());
    }
}
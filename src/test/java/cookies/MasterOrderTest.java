package cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MasterOrderTest {
     @Test
    public void shouldReturnTotalBoxesOfOne(){
         MasterOrder underTest = new MasterOrder();
         CookieOrder cookieOrderTest = new CookieOrder("",1);
         underTest.addOrder(cookieOrderTest);
         int check = underTest.getTotalBoxes();

         assertEquals(1,check);
     }
}

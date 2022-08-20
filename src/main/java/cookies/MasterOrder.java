package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
    List<CookieOrder> orders = new ArrayList<>();
    public void addOrder(CookieOrder cookieOrder) {
        orders.add(cookieOrder);
    }

    public int getTotalBoxes() {
        int boxes = 0;
        for(CookieOrder order: orders){
            boxes += order.getNumBoxes();
        }
        return boxes;
    }

    public void removeVariety(String variety) {
        for(CookieOrder order: orders){
            if(order.getVariety().equals(variety)){
                orders.remove(order);
            }
        }
    }
}

package Service;

import pojo.order;

import java.util.ArrayList;
import java.util.List;

public class CustomUtils {

    public static List<order> createDummyList() {
        List<order> orders = new ArrayList<order>();

        for(int idx=0;idx<5;idx++){
            order ele = new order("Order_" + idx, 1, 1);
            orders.add(ele);
        }

        return orders;
    }
}

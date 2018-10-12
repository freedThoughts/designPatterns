package visitorPattern;

/**
 * Created by Prakash on 11-06-2018.
 */
public class ShoppingItemFootware implements ShoppingItem {
    int MRP;

    ShoppingItemFootware(int MRP) {
        this.MRP = MRP;
    }


    @Override
    public int getMRP() {
        return this.MRP;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.calculateCost(this);
    }
}

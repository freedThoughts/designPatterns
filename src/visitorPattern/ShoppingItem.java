package visitorPattern;

/**
 * Created by Prakash on 11-06-2018.
 */
public interface ShoppingItem {
    int getMRP();
    int accept(Visitor visitor);
}

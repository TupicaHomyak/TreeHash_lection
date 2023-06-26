import java.util.Comparator;
// создается класс для tree
public class ProduckComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        //сравнивать будет по цене
        return -Integer.compare(p1.getPrice(), p2.getPrice());
    }
}

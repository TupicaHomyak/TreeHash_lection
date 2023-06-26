import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример с HashMap:");
        BasketHash basket = new BasketHash();
        basket.add(new Product("moloko", 50),3);
        basket.add(new Product("kefir", 60),3);
        basket.add(new Product("yAiki", 9),20);
        basket.add(new Product("hlebushek", 40),1);
        basket.add(new Product("moloko", 50),5);
        basket.add(new Product("maslou", 150),2);
        basket.add(new Product("bulk", 55));
        System.out.println(basket);

        System.out.println("Далее пример с TreeMap с сортировкой:");

        BasketTree basket2 = new BasketTree();
        basket2.add(new Product("moloko", 50),3);
        basket2.add(new Product("kefir", 60),3);
        basket2.add(new Product("yAiki", 9),20);
        basket2.add(new Product("hlebushek", 40),1);
        basket2.add(new Product("moloko", 50),5);
        basket2.add(new Product("maslou", 150),2);
        basket2.add(new Product("bulk", 55));
        System.out.println(basket2);


        HashMap<String, Integer> puk = new HashMap<>();
        puk.put("molo", 77);
        puk.put("mlo", 44);
        puk.put("moloo", 66);
        puk.put("molko", 66);
        System.out.println(puk);
        System.out.println(puk.size());

        TreeMap<String, Integer> pik = new TreeMap<>();
        pik.put("molo", 77);
        pik.put("mlo", 44);
        pik.put("moloo", 66);
        pik.put("molko", 66);
        System.out.println(pik);
        System.out.println(pik.size());


    }
}
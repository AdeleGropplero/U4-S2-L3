import Es_1a4.Customer;
import Es_1a4.Order;
import Es_1a4.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Prodotti:
        Product product1 = new Product("hf239412bc", "Spazzolino della Pimpa", "Baby", 7.80);
        Product product2 = new Product("lm123456in", "Power Book", "Books", 117.50);
        Product product3 = new Product("er654321re", "Baby monitor", "Baby", 37.40);
        Product product4 = new Product("po987345un", "La Pimpa", "Books", 17.80);
        Product product5 = new Product("sc478329dh", "Paradenti per veri duri", "Boys", 37.80);
        Product product6 = new Product("al983021jd", "Pingu", "Books", 319.99);
        Product product7 = new Product("el246579os", "Pillole per maschietti speciali", "Boys", 99.99);
        Product product8 = new Product("dk641978dk", "Spara dentifricio", "Baby, Boys", 13.92);

        //Clienti:
        Customer c1 = new Customer("027", "Chiara Di Maio", 2);
        Customer c2 = new Customer("8962", "Adele GdT", 2);
        Customer c3 = new Customer("045", "Pippo Baudo", 1);
        Customer c4 = new Customer("998", "Romualdo di Fratesio", 2);

        // 1. Creazione della lista vuota
        List<Product> lista1 = new ArrayList<>(); //potevo farlo anche dopo l'uguale con list.of(product1, product2, ...)
        List<Product> lista2 = new ArrayList<>();
        List<Product> lista3 = new ArrayList<>();
        List<Product> lista4 = new ArrayList<>();

        lista1.add(product1);
        lista1.add(product8);
        lista1.add(product3);

        lista2.add(product2);
        lista2.add(product4);
        lista2.add(product7);
        lista2.add(product6);


        lista3.add(product5);
        lista3.add(product7);
        lista3.add(product6);
        lista3.add(product8);

        lista4.add(product1);
        lista4.add(product2);
        lista4.add(product3);
        lista4.add(product4);

        //Ordini:
        Order order1 = new Order("111073091247", "spedito", LocalDate.of(2021, 2, 1),
                                 LocalDate.of(2021, 4, 1), lista1, c1);

        Order order2 = new Order("222729307410", "preso in carico", LocalDate.of(2021, 3, 7),
                                 LocalDate.of(2021, 3, 9), lista2, c2);

        Order order3 = new Order("333647324898", "consegnato", LocalDate.of(2021, 4, 3),
                                 LocalDate.of(2021, 4, 9), lista3, c3);

        Order order4 = new Order("444578238179", "spedito", LocalDate.of(2021, 2, 7),
                                 LocalDate.of(2021, 2, 9), lista4, c4);

        //   System.out.println(order1);
        System.out.println("---ES.1---");

        List<Product> filteredProdByBooks = lista2.stream().filter(p-> p.getCategory().contains("Books") && p.getPrice() > 100).collect(Collectors.toList());
        filteredProdByBooks.forEach(e -> System.out.println(e));

        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        List<Product> filteredProdByBaby = lista1.stream().filter(p-> p.getCategory().contains("Baby")).collect(Collectors.toList());
        filteredProdByBaby.forEach(e -> System.out.println(e));

        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        System.out.println("---ES.2---");
    }
}


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[])
    {


            Category category1 = new Category("Construção","Isolamento","Varias");
            Category category2 = new Category("Cozinha","Moveis de Cozinha","Varias");
            Category category3 = new Category("Eletricidade e Domotica","Quadros e Dijuntores","Varias");


            Product product1 = new Product("Isolamento Termico - Placa de Isolamento","1000X500X10 mm","Picture1",category1, 2,"m2");
            Product product2 = new Product("Argamassa Cinzento 1.5","Uso interno/externo.","Picture2",category1,2,"1.5kg");
            Product product3 = new Product("Movel para exaustor","45X60 cm","Picture3",category2,20,"un");
            Product product4 = new Product("Movel superior","70X30 cm","Picture4",category2,26,"un");
            Product product5 = new Product("Movel Inferior","70X30 cm","Picture5",category2,30,"un");
            Product product6 = new Product("Contador Trifasico","TARIFA SIMPLES 32A HAGER","Picture6",category3,490,"un");
            Product product7 = new Product("Kit painel ATI mega M3","680x425x141mm","Picture7",category3,399,"un");


            Address address1 = new Address("Braga","853","4740");
            Address address2 = new Address("Barcelos", "361","4740");
            User user1 = new User("Paulo","paulo@outlook.com","Paulo724","123",address1);
            User user2 = new User("Daniel","daniel@outlook.pt","Daniel132","123",address2);

            //ShoppingList lista1 = new ShoppingList("Lista1",user1,user2,"lista1","lista2",user1);
            //ShoppingList lista2 = new ShoppingList("Lista2",user1)



            List<Product> ProductList = new ArrayList<>();


            ProductList.add(product1);
            ProductList.add(product2);
            ProductList.add(product3);
            ProductList.add(product4);
            ProductList.add(product5);
            ProductList.add(product6);
            ProductList.add(product7);
            lista1.setProductlist1(ProductList);

            List<Product> ProductList2 = new ArrayList<>();
            ProductList.add(product1);
            ProductList.add(product2);
            lista2.setProductlist2(ProductList2);

            System.out.println(lista1.getListname()+"\n"+ lista1);
            System.out.println("Hello World");
    }
}

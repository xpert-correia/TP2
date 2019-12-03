


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[])
    {


            Category category1 = new Category("Construção","Isolamento","Varias");
            Category category2 = new Category("Cozinha","Moveis de Cozinha","Varias");
            Category category3 = new Category("Eletricidade e Domotica","Quadros e Dijuntores","Varias");
            Brand brand1 = new Brand("nome",1);

            Product product1 = new Product("Isolamento Termico - Placa de Isolamento","1000X500X10 mm","Picture1",category1, 2,"m2","Descrição detalhada",brand1);
            Product product2 = new Product("Argamassa Cinzento 1.5","Uso interno/externo.","Picture2",category1,2,"1.5kg","Descrição detalhada",brand1);
            Product product3 = new Product("Movel para exaustor","45X60 cm","Picture3",category2,20,"un","Descrição detalhada",brand1);
            Product product4 = new Product("Movel superior","70X30 cm","Picture4",category2,26,"un","Descrição detalhada",brand1);
            Product product5 = new Product("Movel Inferior","70X30 cm","Picture5",category2,30,"un","Descrição detalhada",brand1);
            Product product6 = new Product("Contador Trifasico","TARIFA SIMPLES 32A HAGER","Picture6",category3,490,"un","Descrição detalhada",brand1);
            Product product7 = new Product("Kit painel ATI mega M3","680x425x141mm","Picture7",category3,399,"un","Descrição detalhada",brand1);


            Address address1 = new Address("Braga","853","4740");
            Address address2 = new Address("Barcelos", "361","4740");
            User user1 = new User("Paulo","paulo@outlook.com","Paulo724","123",address1);
            User user2 = new User("Daniel","daniel@outlook.pt","Daniel132","123",address2);

            Address address3 = new Address("rua","1","4740");
            User user3 = new User("Paulo","magowms@gmail.com","paulo123","password",address3);
           // List<User> users = new ShoppingList;
            List<User> userList = new ArrayList<>();
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            List<Product> Product = new ArrayList<>();


            ArrayList<Product> ProductList3 = new ArrayList<>();


            //ShoppingList Lista2 = new ShoppingList("Lista2",user1,user2);
           // List<Product> ProductList = new ShoppingList("Lista1","user1","ProductList1","");
            //ShoppingList ProductList1 = new ShoppingList("ProductList1",user1,"Lista1")

            ArrayList<Product> ProductList1 = new ArrayList<>();

            ProductList1.add(product1);
            ProductList1.add(product2);
            ProductList1.add(product3);
            ProductList1.add(product4);
            ProductList1.add(product5);
            ProductList1.add(product6);
            ProductList1.add(product7);



            ArrayList<Product> ProductList2 = new ArrayList<>();

            ProductList2.add(product4);
            ProductList2.add(product3);

            ArrayList<Product> ListaProdutos = new ArrayList<>();
            ListaProdutos.add(product1);
            ListaProdutos.add(product2);

            ArrayList<Product> ListaNova = new ArrayList<>();

            //ShoppingList s = new ShoppingList("kks",user1,new List<User>(), ProductList1, ProductList2);
            //ShoppingList n = new ShoppingList("Paulo",user1, userList, ProductList1, ProductList2);
            //s.getTotalOfProducts();
            ShoppingList n = new ShoppingList("Compras",user1,ProductList1,ProductList2,userList);
               // n.getTotalOfProducts();
                //n.GetTotalPrice();

            Shopping2 v = new Shopping2("ola",1);

            System.out.println(v.getPercentageCompleted());


            ShoppingList u = new ShoppingList("123",user3,ProductList1,ProductList2,userList);
            for(int i=1;i<2;i++)
            {
                    System.out.println("Nomes: " + userList.get(i).getName());
            }



                System.out.println(userList.get(0).getName());
            //System.out.println(n.GetTotalPrice());
            System.out.println("numero de produtos: "+n.getTotalOfProducts());
           //System.out.println(n.GetTotalPriceOnCart());
            System.out.println("Numero de Produtos: "+ n.getTotalOfProductsOnShoppingCart() +" valor total:"+n.GetTotalPriceOnCart() + " carrinho" + n.GetPercentageCompleted() + "%");
            //System.out.println(n.GetPercentageCompleted());






            for(int i=0;i<ProductList1.size();i++) {
                        System.out.println(ProductList1.get(i).getLongDescription());
                //    System.out.println(ProductList1.get(i).getLongDescription());
                    //  System.out.println(sum);

            }

            System.out.println(v.getPercentageCompleted());



            //Sho.setProductlist1(ProductList1);

           // List<Product> ProductList2 = new ArrayList<>();
           // ProductList.add(product1);
            //ProductList.add(product2);
            //lista2.setProductlist2(ProductList2);

            //System.out.println(lista1.getListname()+"\n"+ lista1);
            //System.out.println("Hello World");
    }
}

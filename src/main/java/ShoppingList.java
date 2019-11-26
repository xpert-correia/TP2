
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String name;
    private User user;
    private User userlist;

    private List<Product> ProductList1 = new ArrayList();//comprar
    private List<Product> ProductList2 = new ArrayList<>();// já no carrinho
    private List<User> UserList = new ArrayList<>();

    public void setProductlist1(List<Product> Productlist1){
        Productlist1 = Productlist1;
    }

    public void setProductlist2(List<Product> Productlist2){
        Productlist2 = Productlist2;
    }

    public ShoppingList(String name, User user, List<Product> productlist1, List<Product> productlist2, List<User> userList){
        this.name = name;
        this.user = user;

        ProductList1 = productlist1;
        ProductList2 = productlist2;
        UserList = userList;

    }

    public String getListname(){
        return  name;
    }

    public  User username(){
        return user;
    }

    public int getTotalOfProducts(){
        int sizeList = ProductList1.size();
        return sizeList;
    }

    public int getTotalOfProductsOnShoppingCart() {
        int sizeList = ProductList2.size();
        return sizeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double GetPercentageCompleted(){
        double percent = 0;
        int sizeList = ProductList1.size(); // tamanho da lista
        int sizeCarrinhoList = ProductList2.size();// tamanho lista carrinho
        percent= (sizeCarrinhoList*100)/sizeList;// percentagem de produtos no carrinho
        return percent; //percentagem
    }
    public double GetTotalPrice(){
        double totalprice = 0;
        for(int i = 0;i<ProductList1.size();i++){
            totalprice = totalprice + ProductList1.get(i).getPrice();
        }
        return totalprice; //retornar total
    }

    public double GetTotalPriceOnCart(){
        double totalprice = 0;
        for (int i = 0;i<ProductList2.size();i++){
            totalprice = totalprice + ProductList2.get(i).getPrice();
        }
        return totalprice;//retornar total
    }
    public boolean addProduct(Product product){
        boolean success = ProductList1.add(product);
        return success;

    }
    public boolean removeProduct(Product product){
        return removeProduct(product);

    }
    public void AddProductToShoppingCart(Product product){
        ProductList1.add(product);
    }

    public void RemoveProductFromShoppingCart(Product product){
        ProductList2.add(product);
    }

}

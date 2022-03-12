package uaslp.objetos.parcial1.examen.pos;


import java.util.ArrayList;

public class PointOfSale {
    private ArrayList<CartItem> items;
    int quantity;

    public PointOfSale(){
        items = new ArrayList<>();
    }

    public void addToCart(int quantity, Product product) {
        for(CartItem item: items){
            if(item.getProductName().equals(product.getName())){
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        CartItem cartItem=new CartItem();
        cartItem.setQuantity(quantity);
        cartItem.setProduct(product);

        items.add(cartItem);
    }

    public int getCountByName(String name) {
        for(CartItem item: items){
            if(item.getProductName().equals(name)){
                return item.getQuantity();
            }
        }
        return 0;
    }

    public float getTotal() {
        float total=0;
        for(CartItem item: items){
            total+=item.getAmount()*item.getQuantity();
        }
        return total;
    }

    public ArrayList<CartItem> getProducts() {
        return items;
    }
}

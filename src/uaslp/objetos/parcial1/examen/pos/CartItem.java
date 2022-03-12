package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    private int Quantity;
    private Product product;

    public int getQuantity() {
        return Quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getProductName(){
        return product.getName();
    }

    public float getAmount(){
        return product.getAmount();
    }
}

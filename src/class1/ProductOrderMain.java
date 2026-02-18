package class1;

public class ProductOrderMain {

    static void main() {

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        order2.productName = "두부";
        order2.price = 2000;
        order2.quantity = 2;

        order3.productName = "두부";
        order3.price = 2000;
        order3.quantity = 2;

        ProductOrder[] orders = {order1, order2, order3};
        printOrders(orders);
    }

    static void printOrders(ProductOrder[] products) {
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
        }
    }
}



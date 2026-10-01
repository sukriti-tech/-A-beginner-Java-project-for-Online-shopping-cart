import java.util.Scanner;
public class OnlineStore {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] products = {"Laptop", "Headphones", "Mouse", "Keyboard"};
    double[] prices = {50000, 2000, 800, 1500};

    int[] cart = new int[4];

    int choice;

    do {
        System.out.println("\n===== ONLINE STORE CART & ORDER PIPELINE =====");
        System.out.println("1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Place Order");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\n--- Products ---");

                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + ". " + products[i]
                            + " - Rs." + prices[i]);
                }
                break;

            case 2:
                System.out.println("\n--- Products ---");

                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + ". " + products[i]
                            + " - Rs." + prices[i]);
                }

                System.out.print("Enter product number: ");
                int product = sc.nextInt();

                if (product >= 1 && product <= products.length) {
                    cart[product - 1]++;
                    System.out.println(products[product - 1]
                            + " added to cart!");
                } else {
                    System.out.println("Invalid product number.");
                }
                break;

            case 3:
                System.out.println("\n--- Your Cart ---");

                double total = 0;

                for (int i = 0; i < products.length; i++) {

                    if (cart[i] > 0) {
                        double itemTotal = cart[i] * prices[i];

                        System.out.println(products[i]
                                + " x " + cart[i]
                                + " = Rs." + itemTotal);

                        total += itemTotal;
                    }
                }

                System.out.println("Total: Rs." + total);
                break;

            case 4:
                double orderTotal = 0;

                for (int i = 0; i < products.length; i++) {
                    orderTotal += cart[i] * prices[i];
                }

                if (orderTotal == 0) {
                    System.out.println("Your cart is empty!");
                } else {
                    System.out.println("\n===== ORDER CONFIRMED =====");

                    for (int i = 0; i < products.length; i++) {
                        if (cart[i] > 0) {
                            System.out.println(products[i]
                                    + " x " + cart[i]);
                        }
                    }

                    System.out.println("Total Amount: Rs." + orderTotal);
                    System.out.println("Order Status: Confirmed");
                    System.out.println("Thank you for shopping!");

                    // Empty the cart after ordering
                    for (int i = 0; i < cart.length; i++) {
                        cart[i] = 0;
                    }
                }
                break;

            case 5:
                System.out.println("Thank you! Visit again.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } while (choice != 5);

    sc.close();
}
}


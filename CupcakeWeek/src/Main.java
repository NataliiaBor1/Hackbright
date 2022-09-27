import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<> ();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. " +
                "We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:\n");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble((priceText));

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description:\n");
        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price1 = Double.parseDouble((priceText));

        cupcake.setPrice(price1);

        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description:\n");
        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical" +
                " number taken to 2 decimal places)");

        priceText = input.nextLine();
        double price2 = Double.parseDouble((priceText));

        cupcake.setPrice(price2);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println(cupcakeMenu);

    }
}

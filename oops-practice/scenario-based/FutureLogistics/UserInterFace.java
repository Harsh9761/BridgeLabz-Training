package FutureLogistics;

import java.util.Scanner;

public class UserInterFace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport transport = GoodsTransport.parseDetails(input);

        if (transport == null) {
            return; // graceful termination
        }

        String type = GoodsTransport.findObjectType(transport);

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) transport;
            bt.display();
        } 
        else if (type.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }

	}

}

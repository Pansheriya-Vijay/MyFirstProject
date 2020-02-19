
public class TicketDiscount {

	public static void main(String[] args) {
		int numberOfTicket=12;
		int ticketPrice=400;
		double total=0.0;
		if(numberOfTicket>=10) {
			total=numberOfTicket*(0.9*ticketPrice);
		}
		System.out.println("Total price of ticket = "+ total);
	}
}

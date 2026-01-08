class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketNode next;

    public TicketNode(int ticketId, String customerName, String movieName,String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservation {
    private TicketNode head = null;
    private TicketNode tail = null;

    public void addTicket(int id, String customer, String movie,String seat, String time) {
        TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
            return;
        }

        tail.next = newTicket;
        newTicket.next = head;
        tail = newTicket;
    }

    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = tail;

        while (true) {
            if (curr.ticketId == id) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                }
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                }
                else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed successfully");
                return;
            }

            prev = curr;
            curr = curr.next;

            if (curr == head)
                break;
        }

        System.out.println("Ticket not found");
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        while (true) {
            printTicket(temp);
            temp = temp.next;
            if (temp == head)
                break;
        }
    }

    public void searchByCustomer(String name) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        while (true) {
            if (temp.customerName.equalsIgnoreCase(name)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
            if (temp == head)
                break;
        }

        if (!found)
            System.out.println("No ticket found for customer");
    }

    public void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        while (true) {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
            if (temp == head)
                break;
        }

        if (!found)
            System.out.println("No ticket found for movie");
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;

        while (true) {
            count++;
            temp = temp.next;
            if (temp == head)
                break;
        }

        System.out.println("Total tickets booked: " + count);
    }

    private void printTicket(TicketNode t) {
        System.out.println("Ticket ID: " + t.ticketId +", Customer: " + t.customerName +", Movie: " + t.movieName +", Seat: " + t.seatNumber +", Time: " + t.bookingTime);
    }
}


public class TicketReservationSystem {

	public static void main(String[] args) {
		
		TicketReservation ticket = new TicketReservation();

		ticket.addTicket(101, "Alice", "Inception", "A1", "10:30 AM");
		ticket.addTicket(102, "Bob", "Inception", "A2", "10:35 AM");
		ticket.addTicket(103, "Charlie", "Avatar", "B1", "11:00 AM");

		ticket.displayTickets();

		ticket.searchByCustomer("Bob");
		ticket.searchByMovie("Inception");

		ticket.countTickets();

		ticket.removeTicket(102);
		ticket.displayTickets();

		ticket.countTickets();

	}

}

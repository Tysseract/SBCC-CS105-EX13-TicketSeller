package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.TicketSeller;

public class TicketSellerTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 10;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}
	
	public void runTest(int presale, int orders[], int expectedBuyers) {
		int buyers = 0;
		int numberTickets = presale;
		for (int i = 0; i < orders.length && numberTickets > 0; ++i) {
			int newNumberTickets = TicketSeller.processOrder(orders[i], numberTickets);
			if (newNumberTickets < numberTickets) {
				buyers++;
				numberTickets = newNumberTickets;
			}
			System.out.println("numbertickets: " + numberTickets);
			System.out.println("buyers " + buyers);
		}
		
		System.out.println("numbertickets: " + numberTickets);
		assertEquals(0, numberTickets);
		System.out.println("buyers " + buyers);
		assertEquals(expectedBuyers, buyers);
	}

	@Test
	public void testSample() {
		int orders[] = {1, 2, 5, 9, 3, 2};
		runTest(8, orders, 4);

		totalScore += 2;
	}

	@Test
	public void testNoTickets() {
		int orders[] = {};
		runTest(0, orders, 0);

		totalScore += 2;
	}

	@Test
	public void test20Tickets() {
		int orders[] = {4, 4, 4, 5, 3, 3, 1, 2, 1};
		runTest(20, orders, 7);

		totalScore += 4;
	}
}

package com.metacube.ds.session2.assignment2;
/**
 * FileName : Counselling.java
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This class implements the college counseling process using queue
 * 
 * @author Nikhil
 *
 */
public class Counselling {

	private Queue<String> studentQueue;
	private List<String> collegeList;
	private List<Integer> collegeSeats;
	private List<String> resultList;
	private Scanner inputValues = new Scanner(System.in);

	/**
	 * Non-parameterized constructor for initialization of the class level
	 * variables
	 */
	public Counselling() {

		studentQueue = new Queue<String>();
		collegeList = new ArrayList<String>();
		collegeSeats = new LinkedList<Integer>();
		resultList = new ArrayList<String>();
	}

	/**
	 * This method creates queue of students based on their ranks
	 */
	public void setStudentLIst() {

		studentQueue.enQueue("Rank 1");
		studentQueue.enQueue("Rank 2");
		studentQueue.enQueue("Rank 3");
		studentQueue.enQueue("Rank 10");
		studentQueue.enQueue("Rank 13");
		studentQueue.enQueue("Rank 14");
		studentQueue.enQueue("Rank 15");
		studentQueue.enQueue("Rank 21");
		studentQueue.enQueue("Rank 28");
		studentQueue.enQueue("Rank 34");
		studentQueue.enQueue("Rank 51");
	}

	/**
	 * This method creates list of colleges
	 */
	public void setCollegeList() {

		collegeList.add("IIT Kanpur");
		collegeList.add("IIT Delhi");
		collegeList.add("IIIT Hyderadad");
		collegeList.add("MNIT Allahabad");
	}

	/**
	 * This method add number of seats list according to the colleges
	 */
	public void setCollegeSeats() {
		collegeSeats.add(3);
		collegeSeats.add(3);
		collegeSeats.add(5);
		collegeSeats.add(2);

	}

	/**
	 * This method performs the whole counseling process and show the allotted
	 * seats to the candidates
	 */
	public void counselling() {
		String choice = " ";

		while (!(studentQueue.isEmpty())) {

			System.out.println("COUNSELING PROCESS 2016 : "
					+ studentQueue.getFront());
			if (collegeList.isEmpty()) {
				System.out
						.println("\nSeats not available in any college, please try again in next round of counseling");
				choice = "N/A";
			} else {
				System.out.println("\nPlease choose your college");
				for (String clgName : collegeList) {

					System.out.println(clgName);
				}
				choice = takeInput();
			}
			choice = choice + "\t" + studentQueue.deQueue();
			resultList.add(choice);
		}
	}

	/**
	 * This method takes input from the user and checks if the college selected
	 * has got any seats left and if seats are present the selected college is
	 * allotted and number of seats for that college is reduced by one, and if
	 * no seats are present college is not alloted
	 * 
	 * @return
	 */
	private String takeInput() {

		System.out.println("\nPlease enter your choice");
		String input = "";
		if (input.isEmpty()) {
			input = inputValues.nextLine();
		}

		if (collegeList.contains(input)) {
			int pos = collegeList.indexOf(input);
			int seatsNum = collegeSeats.get(pos);
			if (seatsNum == 0) {
				System.out
						.println("Seats not available in the selected college \n select another college");
				return takeInput();
			} else {
				collegeSeats.set(pos, (collegeSeats.get(pos) - 1));
			}
			return (input);
		} else {
			System.out
					.println("College not present in the list \n Please spell check");
			return takeInput();
		}
	}

	public void displayResult() {
		System.out
				.println("\nAlloted Colleges List\n\ncollege name\tstudent name");
		for (String result : resultList) {
			System.out.println(result);
		}
	}
	
	/**
	 * Main method for for controlling the counseling process 
	 * 
	 */
	public static void main(String ar[]) {

		Counselling studentCounselling = new Counselling();
		Scanner scanElement = new Scanner(System.in);
		studentCounselling.setStudentLIst();
		studentCounselling.setCollegeList();
		studentCounselling.setCollegeSeats();
		studentCounselling.counselling();
		studentCounselling.displayResult();
		scanElement.close();
	}

}
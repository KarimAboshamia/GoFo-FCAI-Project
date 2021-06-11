package fo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		String location;
		int size;
		int[] avaHours = new int[12];
		int timeSlots;
		float price;
		int cancelPeriod;
		String name;
		String password;
		String email;
		String phoneNumber;
		String city;
		String bookedPlaygroundName;
		int condition2;
		while (true) {
			System.out.println("Choose 1 to Sign Up");
			System.out.println("Choose 2 to Log In");
			Scanner myObj = new Scanner(System.in);
			choice = myObj.nextInt();
			switch (choice) {
				case 1:
					SignUpProfile temp = new SignUpProfile();
					System.out.println("Enter your name: ");
					name = myObj.next();
					System.out.println("Enter your password: ");
					password = myObj.next();
					System.out.println("Enter email: ");
					email = myObj.next();
					System.out.println("Enter phone number: ");
					phoneNumber = myObj.next();
					System.out.println("Enter your city: ");
					city = myObj.next();
					temp.signUp(name, password, email, phoneNumber, city);
					break;

				case 2:
					LogIn auth = new LogIn();
					System.out.println("Enter your email: ");
					email = myObj.next();
					System.out.println("Enter password: ");
					password = myObj.next();
					ProfileData loggedIn = new ProfileData();
					loggedIn = auth.authenticate(email, password);
					if (loggedIn == null) {
						System.out.println("You have entered wrong email, or password");
					} else {
						System.out.println("You are loggedIn");
						while (true) {

							System.out.println(
									"Choose 1- to book playground, 2- to add playground and become playground owner 3- to go back in menu");
							int userType;
							userType = myObj.nextInt();
							if (userType == 1) {
								System.out.println("1- to book playground");

								System.out.println("Available playgrounds are :");
								Player foPlayer = new Player();
								foPlayer.searchForPlayground();
								System.out.println("Type playground name that you want to book:");
								bookedPlaygroundName = myObj.next();
								foPlayer.book(bookedPlaygroundName);
								System.out.println("Your booked playgrounds are:");
								for (int i = 0; i < foPlayer.getMyBooking().size(); i++) {
									System.out.println(
											"Playground " + (i + 1) + " : " + foPlayer.getMyBooking().get(i).getName());
								}
							} else if (userType == 2) {

								PlaygroundOwner owner = new PlaygroundOwner(loggedIn);
								while (true) {

									System.out.println("Enter playground name: ");
									name = myObj.next();
									System.out.println("Enter playground location: ");
									location = myObj.next();
									System.out.println("Enter playground size: ");
									size = myObj.nextInt();

									System.out.println(
											"How many time slots does your playground have? knowing that each time slot is one hour");
									timeSlots = myObj.nextInt();
									System.out.println("enter time slots space seperated");
									for (int i = 0; i < timeSlots; i++) {
										avaHours[i] = myObj.nextInt();
									}
									System.out.println("Enter playground price per hour: ");
									price = myObj.nextFloat();

									System.out.println("Enter playground maximum days to cancel booking: ");
									cancelPeriod = myObj.nextInt();
									owner.registerPlayground(name, location, size, avaHours, price, cancelPeriod);
									System.out.println("1- to add one more playground, 2- to go back to menu");
									condition2 = myObj.nextInt();
									if (condition2 == 1) {

									} else {
										break;
									}
								}

							} else {
								break;
							}
						}
					}
					break;

				default:
					System.out.println("You have made a wrong choice");
					break;

			}
		}
	}
}

package capability4.Client;

import java.util.Scanner;

import capability4.Entity.Contact;
import capability4.Service.PhoneService;

public class PhoneApp {

	static Scanner scanner = new Scanner(System.in);
	static PhoneService phoneService = new PhoneService();

	public static void main(String[] args) {
		Contact[] contacts = createContact();
		boolean flag = true;
		int choice = 0;
		do {
			choice = menu();
			switch (choice) {
			case 1:
				System.out.println("Contacts present in phone");
				displayAllContacts(contacts);
				break;
			case 2:
				Contact[] sortedArray = phoneService.sortByName(contacts);
				displayAllContacts(sortedArray);
				break;
			case 3:
				System.out.println("Enter the name of the contact to be seareched");
				String contactname = scanner.nextLine();
				int result = phoneService.searchContactByName(contactname, contacts);
				if (result == -1)
					System.out.println("Contact not found");
				else
					System.out.println("Contact found at " + result + " Position");

				break;
			case 4:
				System.out.println("Enter the Contact name");
				String name1 = scanner.nextLine();
				System.out.println("enter the upadated number");
				long number = scanner.nextLong();
				scanner.nextLine();
				String result1 = phoneService.updateNumber(name1, number, contacts);
				System.out.println(result1);
				scanner.nextLine();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Your choice is wrong!!");
				break;

			}

		} while (flag);

	}

	private static void displayAllContacts(Contact[] contacts) {
		if (contacts.length <= 0)
			System.out.println("No Actor is present!!");
		else
			for (int i = 0; i < contacts.length; i++) {
				System.out.println("Contact ID " + contacts[i].getId() + '\n' + "Contact name : "
						+ contacts[i].getName() + '\n' + "Contact number: " + contacts[i].getContactnumber());
			}
	}

	private static Contact[] createContact() {
		System.out.println("Enter the no. of Contacts to be added");
		int count = scanner.nextInt();
		Contact[] contact = new Contact[count];
		scanner.nextLine();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter the id of the contact");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the name of the contact");
			String name = scanner.nextLine();
			System.out.println("Enter the contact number");
			long number = scanner.nextLong();
			scanner.nextLine();
			contact[i] = new Contact(id, name, number);
		}
		return contact;

	}

	private static int menu() {
		System.out.println("Enter 1 to display all the contact present in the phone");
		System.out.println("Enter 2 to sort all the contacts by their name and display");
		System.out.println("Enter 3 to search and display the position of the contact,serached by his or her name");
		System.out.println("Enter 4 to update Contact number of particular contact");
		System.out.println("Enter 5 to exit");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}

}

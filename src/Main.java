import java.util.Scanner;

public class Main extends Utility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("*************************************************************");
		System.out.print("*                      WELCOME ADMIN                        *");
		System.out.print("*************************************************************");
		while (true) {
			System.out.println("\nMain Menu:");
			System.out.println("1. Create Account");
			System.out.println("2. Show Accounts");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					createAccount(scanner);
					break;
				case 2:
					showAccounts(scanner);
					break;
				default:
					System.out.print("Invalid choice!");
			}
		}
	}

	public static void createAccount(Scanner scanner) {
		while (true) {
			System.out.println("\nCreate Account:");
			System.out.println("1. Create Doctor Account");
			System.out.println("2. Create Patient Account");
			System.out.println("3. Create Staff Account");
			System.out.println("4. Go to Main Menu");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					createDoctorAccount(scanner);
					break;
				case 2:
					createPatientAccount(scanner);
					break;
				case 3:
					createStaffAccount(scanner);
					break;
				case 4:
					return;
				default:
					System.out.print("Invalid choice!");
			}
		}
	}

	public static void createDoctorAccount(Scanner scanner) {
		Doctor doctor = new Doctor();
		System.out.print("Enter Doctor name: ");
		scanner.nextLine(); // Consume newline character
		doctor.setName(scanner.nextLine());
		System.out.print("Enter Doctor age: ");
		doctor.setAge(scanner.nextInt());
		System.out.print("Enter Doctor job: ");
		scanner.nextLine(); // Consume newline character
		doctor.setJob(scanner.nextLine());
		System.out.print("Enter Doctor gender: ");
		doctor.setGender(scanner.nextLine());
		System.out.print("Enter Doctor salary: ");
		doctor.setDocSalary(scanner.nextLine());
		System.out.print("Enter Doctor specialist: ");
		doctor.setDocSpecialist(scanner.nextLine());
		System.out.print("Enter Doctor room (Integer only) : ");
		doctor.setDocRoom(scanner.nextInt());
		System.out.print("Enter Doctor shift:");
		scanner.nextLine(); // Consume newline character
		doctor.setDocShift(scanner.nextLine());
		System.out.print("Doctor Account created successfully!");
	}

	public static void createPatientAccount(Scanner scanner) {
		Patient patient = new Patient();
		System.out.print("Enter Patient name: ");
		scanner.nextLine(); // Consume newline character
		patient.setName(scanner.nextLine());
		System.out.print("Enter Patient age: ");
		patient.setAge(scanner.nextInt());
		System.out.print("Enter Patient job: ");
		scanner.nextLine(); // Consume newline character
		patient.setJob(scanner.nextLine());
		System.out.print("Enter Patient gender: ");
		patient.setGender(scanner.nextLine());
		System.out.print("Enter Patient disease: ");
		patient.setDisease(scanner.nextLine());
		int diseaseLength = patient.getDisease().length();
		double totalCost = diseaseLength * (5 + Math.random() * 45); // Random number between 5 to 50
		patient.setTotalCost(totalCost);
		System.out.print("Patient Account created successfully!");
	}

	public static void createStaffAccount(Scanner scanner) {
		Staff staff = new Staff();
		System.out.print("Enter Staff name: ");
		scanner.nextLine(); // Consume newline character
		staff.setName(scanner.nextLine());
		System.out.print("Enter Staff age: ");
		staff.setAge(scanner.nextInt());
		System.out.print("Enter Staff job: ");
		scanner.nextLine(); // Consume newline character
		staff.setJob(scanner.nextLine());
		System.out.print("Enter Staff gender: ");
		staff.setGender(scanner.nextLine());
		System.out.print("Enter Staff salary: ");
		staff.setStaffSalary(scanner.nextLine());
		System.out.print("Enter Staff shift: ");
		staff.setStaffShift(scanner.nextLine());
		System.out.print("Staff Account created successfully!");
	}

	public static void showAccounts(Scanner scanner) {
		while (true) {
			System.out.println("\nShow Accounts:");
			System.out.println("1. Show Doctor Accounts");
			System.out.println("2. Show Patient Accounts");
			System.out.println("3. Show Staff Accounts");
			System.out.println("4. Go to Main Menu");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					showDoctorAccounts(scanner);
					break;
				case 2:
					showPatientAccounts(scanner);
					break;
				case 3:
					showStaffAccounts(scanner);
					break;
				case 4:
					return;
				default:
					System.out.print("Invalid choice!");
			}
		}
	}

	public static void showDoctorAccounts(Scanner scanner) {
		System.out.print("Enter Doctor name: ");
		scanner.nextLine(); // Consume newline character
		String doctorName = scanner.nextLine();
		// Search the doctor and show all the information of that doctor
		// Implement the search functionality as per your requirement
		System.out.println("Doctor Account details: ");
		System.out.println("Name: " + doctorName); // Dummy output
		// Print other details as well
	}

	public static void showPatientAccounts(Scanner scanner) {
		System.out.print("Enter Patient name:");
		scanner.nextLine(); // Consume newline character
		String patientName = scanner.nextLine();
		// Search the patient and show all the information of that patient
		// Implement the search functionality as per your requirement
		System.out.println("Patient Account details:");
		System.out.println("Name: " + patientName); // Dummy output
		// Print other details as well
	}

	public static void showStaffAccounts(Scanner scanner) {
		System.out.print("Enter Staff name:");
		scanner.nextLine(); // Consume newline character
		String staffName = scanner.nextLine();
		// Search the staff and show all the information of that staff
		// Implement the search functionality as per your requirement
		System.out.println("Staff Account details:");
		System.out.println("Name: " + staffName); // Dummy output
		// Print other details as well
	}

}
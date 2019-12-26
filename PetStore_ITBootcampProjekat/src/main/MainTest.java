package main;

import java.util.Scanner;

import org.testng.annotations.Test;

import page.tests.AccountChangeTest;
import page.tests.EnterTheStoreTest;
import page.tests.LoginTest;
import page.tests.PetStoreLeftMenuTest;
import page.tests.PetStorePicturesMenuTest;
import page.tests.PetStoreTopMenuTest;
import page.tests.RegistrationExcelTest;
import page.tests.RegistrationOneUserTest;
import page.tests.ShoppingCartTest;
import page.tests.SignInTest;

public class MainTest {
	@Test
	public void PetStoreTests() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter numbers from 1 to 10:");
		System.out.println("1 - Enter the Pet Store test");
		System.out.println("2 - Pet Store left menu test");
		System.out.println("3 - Pet Store top menu test");
		System.out.println("4 - Pet Store pictures menu test");
		System.out.println("5 - Pet Store sign in test");
		System.out.println("6 - Register one user test");
		System.out.println("7 - Register users from Excel file test");
		System.out.println("8 - Login users from Excel file test");
		System.out.println("9 - Change data for one user in My account test");
		System.out.println("10 - Shopping Card test");

		int test = sc.nextInt();

		switch (test) {
		case 1:
			System.out.println("Enter the Pet Store test");
			EnterTheStoreTest.EnterStore();
			break;
		case 2:
			System.out.println("Pet Store left menu test");
			PetStoreLeftMenuTest.Fish();
			PetStoreLeftMenuTest.Dogs();
			PetStoreLeftMenuTest.Cats();
			PetStoreLeftMenuTest.Reptiles();
			PetStoreLeftMenuTest.Birds();
			break;
		case 3:
			System.out.println("Pet Store top menu test");
			PetStoreTopMenuTest.Fish();
			PetStoreTopMenuTest.Dogs();
			PetStoreTopMenuTest.Cats();
			PetStoreTopMenuTest.Reptiles();
			PetStoreTopMenuTest.Birds();
			break;
		case 4:
			System.out.println("Pet Store pictures menu test");
			PetStorePicturesMenuTest.BirdsLarge();
			PetStorePicturesMenuTest.Fish();
			PetStorePicturesMenuTest.Dogs();
			PetStorePicturesMenuTest.Cats();
			PetStorePicturesMenuTest.Reptiles();
			PetStorePicturesMenuTest.Birds();
			break;
		case 5:
			System.out.println("Pet Store sign in test");
			SignInTest.SignIn();
			break;
		case 6:
			System.out.println("Register one user test");
			RegistrationOneUserTest.Registration();
			break;
		case 7:
			System.out.println("Register users from Excel file test");
			RegistrationExcelTest.RegistrationExcel();
			break;
		case 8:
			System.out.println("Login users from Excel file test");
			LoginTest.Login();
			break;
		case 9:
			System.out.println("Change data for one user in My account test");
			AccountChangeTest.Account();
			break;
		case 10:
			System.out.println("Shopping Card test");
			ShoppingCartTest.ShoppingCart();
			break;
		default:
			System.out.println("You've entered the wrong number! Please enter numbers from 1 to 10!");
			break;
		}
	}
}

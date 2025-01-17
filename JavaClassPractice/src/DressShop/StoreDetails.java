package DressShop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StoreDetails {

	static int CustomerId = 1;
	static int TotalStock = 20;
	static int mensPant = 4;
	static int mensShirt = 4;
	static int womensTshirt = 4;
	static int womensPant = 4;
	static int sarees = 4;
	static List<CustomersDetails> PurchaseDetails = new ArrayList<CustomersDetails>();

	static void allocatedDress(CustomersDetails cd) {
		switch (cd.getChoosedDress()) {
		case 1:
			if (mensPant > 0) {
				System.out.println(
						"\nDress        : MensPant \nPrice        : Rs:750 \nMaterial     : Cotton \nDiscount     : 15%");
				int DiscountAmount = (int) (750 * 0.85);
				System.out.println("Total Amount : " + DiscountAmount);
				Scanner sc = new Scanner(System.in);
				System.out.print("Pay Now      : ");
				int Payment = sc.nextInt();
				sc.nextLine();

				if (Payment == DiscountAmount) {
					cd.setConfirmedDress("MensPant");
					mensPant--;
					System.out.println("\nPurchased Successfully \nCustomerId : " + CustomerId);
					cd.setPaidAmount(Payment);
					System.out.println(cd.getPurchasedDateTime().now().withNano(0));
					cd.setPurchasedDateTime(cd.getPurchasedDateTime().now().withNano(0));
					cd.setReturnDateTime(cd.getPurchasedDateTime().now().withNano(0).plusMinutes(1));

				} else {
					System.err.println("\nInvalid Amount");
				}
			} else {
				System.out.println("\nThis Dress is Out Of Stock visit Later");
			}
			break;
		case 2:
			if (mensShirt > 0) {
				System.out.println(
						"\nDress        : mensShirt \nPrice        : Rs:550 \nMaterial     : Cotton \nDiscount     : 15%");
				int DiscountAmount = (int) (550 * 0.85);
				System.out.println("Total Amount : " + DiscountAmount);
				Scanner sc = new Scanner(System.in);
				System.out.print("Pay Now      : ");
				int Payment = sc.nextInt();
				sc.nextLine();

				if (Payment == DiscountAmount) {
					cd.setConfirmedDress("MensShirt");
					mensShirt--;
					System.out.println("\nPurchased Successfully \nCustomerId : " + CustomerId);
					cd.setPaidAmount(Payment);
					System.out.println(cd.getPurchasedDateTime().now().withNano(0));
					cd.setPurchasedDateTime(cd.getPurchasedDateTime().now().withNano(0));
					cd.setReturnDateTime(cd.getPurchasedDateTime().now().withNano(0).plusMinutes(1));

				} else {
					System.err.println("\nInvalid Amount");
				}
			} else {
				System.out.println("\nThis Dress is Out Of Stock visit Later");
			}
			break;
		case 3:
			if (womensTshirt > 0) {
				System.out.println(
						"\nDress        : WomensTshirt \nPrice        : Rs:900 \nMaterial     : Cotton \nDiscount     : 15%");
				int DiscountAmount = (int) (900 * 0.85);
				System.out.println("Total Amount : " + DiscountAmount);
				Scanner sc = new Scanner(System.in);
				System.out.print("Pay Now      : ");
				int Payment = sc.nextInt();
				sc.nextLine();

				if (Payment == DiscountAmount) {
					cd.setConfirmedDress("WomensTshirt");
					womensTshirt--;
					System.out.println("\nPurchased Successfully \nCustomerId : " + CustomerId);
					cd.setPaidAmount(Payment);
					System.out.println(cd.getPurchasedDateTime().now().withNano(0));
					cd.setPurchasedDateTime(cd.getPurchasedDateTime().now().withNano(0));
					cd.setReturnDateTime(cd.getPurchasedDateTime().now().withNano(0).plusMinutes(1));

				} else {
					System.err.println("\nInvalid Amount");
				}
			} else {
				System.out.println("\nThis Dress is Out Of Stock visit Later");
			}
			break;
		case 4:
			if (womensPant > 0) {
				System.out.println(
						"\nDress        : WomensPant \nPrice        : Rs:1300 \nMaterial     : Cotton \nDiscount     : 15%");
				int DiscountAmount = (int) (1300 * 0.85);
				System.out.println("Total Amount : " + DiscountAmount);
				Scanner sc = new Scanner(System.in);
				System.out.print("Pay Now      : ");
				int Payment = sc.nextInt();
				sc.nextLine();

				if (Payment == DiscountAmount) {
					cd.setConfirmedDress("WomensPant");
					womensPant--;
					System.out.println("\nPurchased Successfully \nCustomerId : " + CustomerId);
					cd.setPaidAmount(Payment);
					System.out.println(cd.getPurchasedDateTime().now().withNano(0));
					cd.setPurchasedDateTime(cd.getPurchasedDateTime().now().withNano(0));
					cd.setReturnDateTime(cd.getPurchasedDateTime().now().withNano(0).plusMinutes(1));

				} else {
					System.err.println("\nInvalid Amount");
				}
			} else {
				System.out.println("\nThis Dress is Out Of Stock visit Later");
			}
			break;
		case 5:
			if (sarees > 0) {
				System.out.println(
						"\nDress        : Saree \nPrice        : Rs:2000 \nMaterial     : Cotton \nDiscount     : 15%");
				int DiscountAmount = (int) (2000 * 0.85);
				System.out.println("Total Amount : " + DiscountAmount);
				Scanner sc = new Scanner(System.in);
				System.out.print("Pay Now      : ");
				int Payment = sc.nextInt();
				sc.nextLine();

				if (Payment == DiscountAmount) {
					cd.setConfirmedDress("Saree");
					sarees--;
					System.out.println("\nPurchased Successfully \nCustomerId : " + CustomerId);
					cd.setPaidAmount(Payment);
					System.out.println(cd.getPurchasedDateTime().now().withNano(0));
					cd.setPurchasedDateTime(cd.getPurchasedDateTime().now().withNano(0));
					cd.setReturnDateTime(cd.getPurchasedDateTime().now().withNano(0).plusMinutes(1));

				} else {
					System.err.println("\nInvalid Amount");
				}
			} else {
				System.out.println("\nThis Dress is Out Of Stock visit Later");
			}
			break;
		default:
			System.out.println("Your Choosed Wrong Option");

		}

	}

	static void Order(CustomersDetails cd) {
		if (TotalStock > 0) {
			allocatedDress(cd);
			TotalStock--;
			PurchaseDetails.add(cd);

		} else {
			System.out.println("Out Of Stock Please Vist Next Time!...");
		}

	}

	static void viewDetails(int cid) {
		if (PurchaseDetails.isEmpty()) {
			System.out.println("Id Is Not Found");
		} else {
			PurchaseDetails.forEach(e -> {
				if (e.getCustomerId() == cid) {
					System.out.println("Customer Name   : " + e.getCustomerName());
					System.out.println("Customer Phone  : " + e.getCustomerNumber());
					System.out.println("Confirmed Dress : " + e.getConfirmedDress());
					System.out.println("Bill Amount     : " + e.getPaidAmount());
					System.out.println("Date & Time     : " + e.getPurchasedDateTime());
				}
			});
		}

	}

	static void removeProduct(String rem) {

		switch (rem) {

		case "MensPant":
			mensPant++;
			TotalStock++;
			break;

		case "MensShirt":
			mensShirt++;
			TotalStock++;
			break;

		case "WomensTshirt":
			womensTshirt++;
			TotalStock++;
			break;

		case "WomensPant":
			womensPant++;
			TotalStock++;
			break;

		case "Saree":
			sarees++;
			TotalStock++;
			break;

		}

	}

	static void ReturnProduct(int oid) {
		List<CustomersDetails> returnProducts = PurchaseDetails.stream().filter(e -> e.getCustomerId() == oid)
				.collect(Collectors.toList());
		if (!returnProducts.isEmpty()) {
			Iterator<CustomersDetails> it = PurchaseDetails.iterator();
			while (it.hasNext()) {
				CustomersDetails cd = it.next();
				if (cd.getCustomerId() == oid) {
					if (LocalDateTime.now().isBefore(cd.getReturnDateTime())) {
						it.remove();
						String rem = cd.getConfirmedDress();
						removeProduct(rem);
						System.out.println(cd.getConfirmedDress() + " Returned Successfully");
					} else {
						System.out.println("Time Out You Can't Return Items");
					}

				}

			}
		} else {
			System.out.println("Id Not Found Select Valid Id");
		}

	}

	static void StockUpdate(int stk, int Countitem) {
		switch (stk) {
		case 1:
			mensShirt += Countitem;
			TotalStock += Countitem;
			System.out.println("MenShirt Stock Updated : " + mensShirt);
			break;

		case 2:
			mensPant += Countitem;
			TotalStock += Countitem;
			System.out.println("mensPant Stock Updated : " + mensPant);
			break;

		case 3:
			womensTshirt += Countitem;
			TotalStock += Countitem;
			System.out.println("womensTshirt Stock Updated : " + womensTshirt);
			break;

		case 4:
			womensPant += Countitem;
			TotalStock += Countitem;
			System.out.println("womensTshirt Stock Updated : " + womensTshirt);
			break;

		case 5:
			sarees += Countitem;
			TotalStock += Countitem;
			System.out.println("sarees Stock Updated : " + sarees);
			break;

		}

	}

	static void User(String username) {
		Scanner sc = new Scanner(System.in);
		String usName = "Admin";
		String usPass = "admin123";
		if (usName.equalsIgnoreCase(username)) {
			System.out.println("Enter Your PassWord : ");
			String passWord = sc.nextLine();
			if (usPass.equals(passWord)) {
				System.out.println(
						"Choose The Product \n1.mensShirt \t2.mensPant \t.3womensTShirt \t4.womensPant \t5.Sarees");
				int stk = sc.nextInt();
				System.out.println("Update The Stock Count : ");
				int Countitem = sc.nextInt();
				StockUpdate(stk, Countitem);

			}else{
				System.out.println("Invalid Password Enter valid Password");
			}
			
		}else{System.out.println("Incorrect UserName Enter valid UserName");}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		System.out.println("\t\t...Welcome To Dark Dress Collections...\n\n");
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("\nHow May I Help You :\n");
			System.out.println("1.Shopping\t2.Purchase Details\t3.Return Products\t4.Admin");
			int preferedChoice = sc.nextInt();
			switch (preferedChoice) {
			case 1:
				System.out.print("Enter Your Name :");
				String name = sc.next();
				sc.nextLine();
				System.out.print("Enter Your Mobile Number :");
				boolean checkNo = true;
				while (checkNo) {
					Long mobileNo = sc.nextLong();
					if (mobileNo > 100000000 && mobileNo < 9999999999L) {
						System.out.println("\nWhich Dress Do You Want Sir/madam :");
						System.out.println("1.MensPant \t2.MensShirt \t3.womensTshirt \t4.womensPant \t5.Sarees");
						int choosedDress = sc.nextInt();
						Order(new CustomersDetails(CustomerId, name, mobileNo, choosedDress));
						CustomerId++;
						checkNo = false;
					} else {

						checkNo = true;
						System.out.println("Please Enter Valid Mobile Number :");

					}

				}
				break;

			case 2: {
				System.out.println("Enter Your Order Id To View Details : ");
				int cid = sc.nextInt();
				sc.nextLine();
				viewDetails(cid);
				break;

			}
			case 3: {
				System.out.println("Enter Your Order Id To Return Dress");
				int oid = sc.nextInt();
				ReturnProduct(oid);
				break;

			}
			case 4: {
				System.out.println("\nCurrent Stock Level :" + TotalStock);
				System.out.println("Mens Shirt : " + mensShirt + ", Mens Pant : " + mensPant + ", Womens T-Shirt : "
						+ womensTshirt + ", Womens Pant : " + womensPant + ", Saress : " + sarees );
				
				System.out.println("\n...Update Stock...\nEnter Your UserName : ");
				String Username = sc.next();
				User(Username);
				break;

			}
			default:
				System.out.println("Please Choose Your Service Correctly");
				break;
			}
			System.out.println("\nDo You Want To Continue Shopping Y/N");
			choice=sc.next();

		}
		System.out.println("Thank You For Shopping Have A Nice Day");

	}

}

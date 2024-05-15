package tester;
import static MapUtils.Functinality.purchaseStock;
import static MapUtils.Functinality.sellStock;
import static collectionUtils.StockUtils.populateMap;
import static validationrules.Validations.inputValidation;
import static validationrules.Validations.validateId;
import static IOUtils.Serialization.storeInFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.core.Stock;

import customExceptions.AuthenticationException;
import customExceptions.OutofStockException;

public class StocksTradingService {

	public static void main(String[] args) throws AuthenticationException, IllegalAccessException, OutofStockException, FileNotFoundException, IOException {
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Stock> mapList = populateMap();
			int choice;
			do {
				System.out.println("1. Add New Stock in Market\n"
						+ "2. Company's Stock Available\n"
						+ "3. Purchase Stock\n"
						+ "4. Sell Stock\n"
						+ "5. Save and Exit");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				switch(choice) {
				
				case 1: //Add Stock in Map
					System.out.print("Enter Stock Id : ");
					String id = sc.next();
					System.out.print("Enter Stock Name : ");
					String name = sc.next();
					System.out.print("Enter Stock Company : ");
					String cname = sc.next();
					System.out.print("Enter Stock Price : ");
					double price = sc.nextDouble();
					System.out.print("Enter Stock Expiry Date : ");
					LocalDate date = LocalDate.parse(sc.next());
					System.out.print("Enter Stock Quantity : ");
					int q = sc.nextInt();
					String sid = validateId(id, mapList);
					mapList.put(sid, inputValidation(sid, name, cname, price, date, q));
					break;
					
				case 2: //View Stock by Company Name
					System.out.print("Enter Company Name : ");
					String cn = sc.next();
					for(Stock s : mapList.values()) {
						if(s.getCompanyName().equalsIgnoreCase(cn) ) {
							System.out.println(s);
						}
					}
					break;
					
				case 3: //Purchase Stock
					System.out.print("Enter Stock Id : ");
					id = sc.next();
					System.out.print("Enter Stock Quantity : ");
					q = sc.nextInt();
					purchaseStock(id, q, mapList);
					break;
					
				case 4: //Sell Stock
					System.out.print("Enter Stock Id : ");
					id = sc.next();
					System.out.print("Enter Stock Quantity : ");
					q = sc.nextInt();
					sellStock(id, q, mapList);
					break;
					
				case 5: //Save and Exit
					System.out.print("Enter FileName : ");
					cn = sc.next();
					storeInFile(cn, mapList);
					System.out.println("Data Stored In File");
					choice =5;
					break;
				}
			}while(choice != 5);
		}

	}

}

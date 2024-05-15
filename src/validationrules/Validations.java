package validationrules;
import java.time.LocalDate;
import java.util.Map;

import com.core.Stock;

import customExceptions.AuthenticationException;

public class Validations {
	public static Stock inputValidation(String id, String name, String cname, double price, LocalDate date, int quantity) throws AuthenticationException {
		LocalDate d = validateDate(date);
		return new Stock(id, name, cname, price, d, quantity);
	}
	
	public static LocalDate validateDate(LocalDate date) throws AuthenticationException{
		if(!date.isAfter(LocalDate.now())){
			throw new AuthenticationException("Invalid Date..");
		}
		return date;
	}
	
	public static String validateId(String id, Map<String, Stock> stockList) throws AuthenticationException{
		if(stockList.containsKey(id)) {
			throw new AuthenticationException("Id Already Present...");
		}
		return id;
	}
	
//	public static int validateQuantity(int quant, Map<String, Stock> stockList) throws AuthenticationException{
//		for(Stock s : stockList.values()) {
//			if(s.getStockQuantity() < quant) {
//				throw new AuthenticationException("Quantity Out Of Range..");
//			}
//			return s.getStockId();		}
//	}

}

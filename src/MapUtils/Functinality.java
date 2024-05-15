package MapUtils;
import java.util.Map;
import com.core.Stock;

import customExceptions.OutofStockException;

public class Functinality {
	public static void purchaseStock(String id, int q, Map<String, Stock> mList) throws OutofStockException, IllegalAccessException{
		if(!mList.containsKey(id)) {
			throw new IllegalAccessException("Invalid Id --- Id is not Present..");
		}
		//Wrapping of String into object
		Stock st = mList.get(id);
		if(st.getStockQuantity() < q) {
			throw new OutofStockException("Quantity Out of range");
		}
		st.setStockQuantity(st.getStockQuantity() - q);
	}
	
	public static void sellStock(String id, int q, Map<String, Stock> mList) throws IllegalAccessException {
		if(!mList.containsKey(id)) {
			throw new IllegalAccessException("Invalid Id --- Id is not Present..");
		}
		//Wrapping of String into object
		Stock st = mList.get(id);
		st.setStockQuantity(st.getStockQuantity() + q);
	}

}

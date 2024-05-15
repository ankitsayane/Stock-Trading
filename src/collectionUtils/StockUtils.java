package collectionUtils;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.core.Stock;;

public class StockUtils {
	public static Map<String, Stock> populateMap(){
		Map<String, Stock> mapList = new HashMap<>();
		mapList.put("1XA56", new Stock("1XA56", "TataPower", "Tata", 301.8, LocalDate.parse("2024-05-05"), 3));
		mapList.put("AO657", new Stock("AO657", "Vedanta", "Vedanta PVT LTD", 410.97, LocalDate.parse("2024-05-01"), 6));
		mapList.put("1XA59", new Stock("1XA59", "TCS", "Tata", 3901.21, LocalDate.parse("2024-04-29"), 11));
		mapList.put("Q98BC", new Stock("Q98BC", "IOCL", "Indian Oil", 180.76, LocalDate.parse("2024-04-30"), 17));
		mapList.put("98REL", new Stock("98REL", "Reliance", "Reliance Pvt Ltd", 3701.66, LocalDate.parse("2024-05-02"), 6));
		return mapList;
	}
}

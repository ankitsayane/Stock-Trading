package IOUtils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.core.Stock;

public class Serialization {
	public static void storeInFile(String fname, Map<String, Stock> mapList) throws FileNotFoundException, IOException {
		try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(fname))){
			obj.writeObject(mapList);
		}
	}
}

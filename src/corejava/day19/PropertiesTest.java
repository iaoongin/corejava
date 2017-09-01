package corejava.day19;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/setting.properties"));
		
		System.out.println(prop.get("age"));

		String key = "name";
		String val = "lili";
		
		Map<String,Map<String,String>> key2val = new HashMap<>();
		Map<String,String> val2key = new HashMap<>();
		val2key.put(val, key);
		key2val.put(key, val2key);
		
		Collection<Map<String, String>> values = key2val.values();
		for (Map<String, String> map : values) {
			System.out.println(map.get(val));
		}
		
		Map<String, String> map = key2val.get(key);
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string);
		}
	}
}

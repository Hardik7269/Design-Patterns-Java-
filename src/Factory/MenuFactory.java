package Factory;

import Factory.MenuImpl.Samosa;
import Factory.MenuImpl.Vadapav;

public class MenuFactory {
	public Menu getItem(String itemName) {
		if(itemName.equals("")) {
			return null;
		}else if(itemName.equalsIgnoreCase("vadapav")) {
			return new Vadapav();
		}else if (itemName.equalsIgnoreCase("samosa")){
			return new Samosa();
		}
		return null;
	}
}

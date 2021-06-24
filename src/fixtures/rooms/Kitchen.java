package fixtures.rooms;

import fixtures.objects.Table;

public class Kitchen extends Room{
	
	public Kitchen() {
		super("Kitchen", "A dim lit kitchen", "The kitchen feels really cold, something is not right. "
				+ "Everything seems off. It feels like someone is watching you...");
		this.addInteractive(new Table());
	}

}

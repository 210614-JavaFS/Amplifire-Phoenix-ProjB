package fixtures.rooms;

import fixtures.objects.Table;

public class Kitchen extends Room{

	public Kitchen() {
		super("Kitchen", "A dim lit kitchen", "The kitchen feels really cold, something is not right"
				+ "Everything seems off, except the fact of a delicious scent of spaghetti");
		this.addInteractive(new Table());
	}

}

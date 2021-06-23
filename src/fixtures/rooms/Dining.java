package fixtures.rooms;

import fixtures.objects.Cupboard;

public class Dining extends Room{

	public Dining() {
		super("Dining Room","There is a table with food on it.",
				"When you enter the dinning room and you see dinner served. It looks freshly made.\n" +
				" But.. no one lives here.. who made this food? "
				);
		this.addInteractive(new Cupboard());
			}
}

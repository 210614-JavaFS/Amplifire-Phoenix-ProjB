package fixtures.rooms;

import fixtures.objects.Sofas;

public class LivingRoom extends Room {

	public LivingRoom() {
		super(
				"Living Room",
				"A lounge of sorts",
				"Despite the name, you get the feeling that nothing has lived in here for quite some time.\n"
				+ "In fact, a lot of things have probably died here, both literally and metaphorically.\n"
				+ "There are two sofas in the middle of the living room. There's either some mold or some weird patterning"
				+ "on it"
				);
		
		this.addInteractive(new Sofas());
		
	}

}

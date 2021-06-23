package fixtures.rooms;

import fixtures.objects.Mirror;

public class UpstairsBathroom extends Room {

	public UpstairsBathroom() {
		super("Upstairs Bathroom", "A seemingly ordinary bathroom", "A small bathroom with black and white tile, a tub, a faucet, a toilet, and a mirror.");
		this.addInteractive(new Mirror());
	}

}
package fixtures.objects;

import fixtures.Fixture;

public class thing extends Fixture implements Interactive{

	public thing() {
		super("thing", "This is a thing", "This is a really detailed look at the thing. "
				+ "This thing has thing like properties and thing-like qualities. It truly is a thing. "
				+ "You wouldn't believe it if I told you, but here I am telling you. I hope you believe me");
	}

	@Override
	public String printLongDescription() {
		
		return this.longDescription;
	}

	@Override
	public String printShortDescription() {
		// TODO Auto-generated method stub
		return this.shortDescription;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}

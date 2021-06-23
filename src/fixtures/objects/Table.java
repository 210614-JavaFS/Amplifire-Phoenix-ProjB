package fixtures.objects;

import fixtures.Fixture;

public class Table extends Fixture implements Interactive{
	
	public Table() {
		super("Table", "A dusty old table", "Inching closer to the table there seems to be a note on it");
	}

	@Override
	public String printLongDescription() {
		return this.longDescription;
	}

	@Override
	public String printShortDescription() {
		return this.shortDescription;
	}

	@Override
	public String printName() {
		return this.name;
	}

	@Override
	public void Interact() {
		System.out.println("\n" + "The note reads... GOOD LUCK GETTING OUT \n"
							+ "You feel something graze your shoulder");
		
		this.longDescription = "You feel disturbed, you must find a way out";
	}
	
	

}


public class Character implements Comparable<Character>{
	private int initiative;
	private String name;
	
	public Character() {
		initiative=0;
		name = "NoName";
	}
	
	public Character(String nam, int ini) {
		setInitiative(ini);
		setName(nam);
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getName() + " has initiative " + getInitiative()+"\n";
	}
	
	//override the compareTo method so we may sort our collection accordingly
	@Override
	public int compareTo(Character otherChar) {
		return getInitiative() - otherChar.getInitiative();
	}
}

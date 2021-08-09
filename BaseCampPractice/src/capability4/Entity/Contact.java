package capability4.Entity;

public class Contact {
	private int id;
	private String name;
	private long contactnumber;

	public Contact() {
		super();

	}

	public Contact(int id, String name, long contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.contactnumber = contactnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	 
}

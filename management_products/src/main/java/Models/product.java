package Models;

public class product {
	private long id;
	private String name;
	private String desc;
	private float price;
	private  float etat;
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public product(long id, String name, String desc, float price, float etat) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.etat = etat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getEtat() {
		return etat;
	}

	public void setEtat(float etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+desc+"-"+price+"-"+etat;
	}
	 
	public void show() {
		System.out.println(toString());
	}
}
	
package Models;

public class product {
	private Long id;
	private String name;
	private String desc;
	private float price;
	private  int etat;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(Long id, String name, String desc, float price, int etat) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	
}
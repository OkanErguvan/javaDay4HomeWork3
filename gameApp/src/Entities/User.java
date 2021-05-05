package Entities;
import java.time.LocalDate;

public class User {
	
	private int id;
	private String firsName;
	private String lastName;
	private String natioanlyNo;
	private LocalDate birthDay;
	private double amountOfPrice;
	
	public User() {
		
	}
	
	public User(int id, String firsName, String lastName, String natioanlyNo, LocalDate birthDay,
			double amountOfPrice) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.natioanlyNo = natioanlyNo;
		this.birthDay = birthDay;
		this.amountOfPrice = amountOfPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNatioanlyNo() {
		return natioanlyNo;
	}

	public void setNatioanlyNo(String natioanlyNo) {
		this.natioanlyNo = natioanlyNo;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public double getAmountOfPrice() {
		return amountOfPrice;
	}

	public void setAmountOfPrice(double amountOfPrice) {
		this.amountOfPrice = amountOfPrice;
	}

	public void setBirthDay(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
	

}

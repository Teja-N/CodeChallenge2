package code.challenge2;

import java.util.ArrayList;
import java.util.List;

public class UserTable {
	
	private int id;
	private String name;
	private String phone;
	private String address;
	private List<UserTable> user=new ArrayList<>();
	public UserTable(){
		user.add(new UserTable(1, "John", "987-632-5412", "Houston, TX" ));
		user.add(new UserTable(2, "Smith", "654-963-7854", "Buffalo, NY" ));
		user.add(new UserTable(3, "Kevin", "456-789-6325", "Columbus, OH" ));
		user.add(new UserTable(4, "Peter", "123-456-7896", "San Antanio, TX" ));
		user.add(new UserTable(5, "Bill", "423-963-7825", "Little Rock, AR" ));
	}
	
	public UserTable(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<UserTable> getUser() {
		return user;
	}

	public void setUser(List<UserTable> user) {
		this.user = user;
	}


	public static void main(String[] args) {
		UserTable userTab = new UserTable();
        
        List<UserTable> user = userTab.getUser();
        if(user != null) {

            for (UserTable u : user) {
                System.out.println(u.id+","+u.name+","+u.phone+","+u.address);
            }
        }
        else{
            System.out.println("data not pesent");
        }
    }

	}
	
	




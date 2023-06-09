package labcodeinspection;

public class Email {

	private String m_firstName;
	private String m_lastName;
	private String password = "";
	private String department;
	private int defaultpasswordLength = 8;
	private String email;

	public String getM_firstName() {
		return m_firstName;
	}

	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}
	
	

	public String getM_lastName() {
		return m_lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getDepartment() {
		return department;
	}

	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName; // NOPMD
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		default:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return password.toString();
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName + this.m_lastName + "@" + this.department	+ ".espol.edu.ec";
	}
}

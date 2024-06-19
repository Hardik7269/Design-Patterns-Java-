package Builder;

public class User {
	private String userName;
	private String userEmail;
	private int  age;
	
	
	

	private User(UserBuilder builder) {
		this.age = builder.age;
		this.userEmail = builder.userEmail;
		this.userName = builder.userName;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", age=" + age + "]";
	}
	
	static class UserBuilder{
		private String userName;
		private String userEmail;
		private int  age;
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
}



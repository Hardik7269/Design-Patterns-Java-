package Builder;

import Builder.User.UserBuilder;

public class Main {
	public static void main(String[] args) {
		UserBuilder builder = new User.UserBuilder();
		User user = builder.setAge(10)
					.setUserEmail("Email")
					.setUserName("Hardik")
					.build();
		System.out.println(user.toString());	
	}
}

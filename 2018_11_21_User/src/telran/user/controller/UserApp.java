package telran.user.controller;

import telran.user.dao.Forum;
import telran.user.data.*;

public class UserApp {

	public static void main(String[] args) {

		User u1 = new User("bucefal1233", "1234565689");
		User u2 = new User("nunununun", "blabla");
		User u3 = new User("user23", "passwo456");

		Post p1 = new Post(u1, 0002, "ldldldl", "lkmklmsgpkm");
		Post p2 = new Post(u2, 04502, "kakakaka", "lolololo");
		Post p3 = new Post(u3, 077702, "kookkjvchjf", "dbdbd");
		
		Forum f1 = new Forum(10);
		
		f1.addPost(p1);
		f1.addPost(p2);
		f1.addPost(p3);
	
		f1.display();
		System.out.println("***************************************************");

		f1.removePost(0002);
		f1.display();

		
/*-		p1.addLike();
		System.out.println("***************************************************");
		f1.removePost(04502);
		f1.display();
*/
	}

}

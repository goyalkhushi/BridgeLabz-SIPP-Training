package linkedlist;


class FriendNode {
	
	int friendId;
	 FriendNode next;

	 public FriendNode(int friendId) {
	     this.friendId = friendId;
	     this.next = null;
	 }
}


class UserNode {
 
	int userId;
	 String name;
	 int age;
	 FriendNode friendList;
	 UserNode next;

	 public UserNode(int userId, String name, int age) {
	     this.userId = userId;
	     this.name = name;
	     this.age = age;
	     this.friendList = null;
	     this.next = null;
	 }

	 
	 // Add a friend to the user's friend list
	 public void addFriend(int friendId) {
	     FriendNode newFriend = new FriendNode(friendId);
	     newFriend.next = friendList;
	     friendList = newFriend;
	 }

	 
	 // Remove a friend by friendId
	 public void removeFriend(int friendId) {
	     if (friendList == null) return;
	     if (friendList.friendId == friendId) {
	         friendList = friendList.next;
	         return;
	     }
	     FriendNode temp = friendList;
	     while (temp.next != null && temp.next.friendId != friendId) {
	         temp = temp.next;
	     }
	     if (temp.next != null) {
	         temp.next = temp.next.next;
	     }
	 }

	 
	 // Display all friends
	 public void displayFriends() {
	     FriendNode temp = friendList;
	     System.out.print("Friends of " + name + " (ID: " + userId + "): ");
	     while (temp != null) {
	         System.out.print(temp.friendId + " ");
	         temp = temp.next;
	     }
	     System.out.println();
	 }


	 // Count the number of friends
	 public int countFriends() {
	     int count = 0;
	     FriendNode temp = friendList;
	     while (temp != null) {
	         count++;
	         temp = temp.next;
	     }
	     return count;
	 }
}


//Singly Linked List managing all users
class SocialMediaList {
		private UserNode head;

 
		// Add a user at the end
		 public void addUser(UserNode user) {
		     if (head == null) {
		         head = user;
		         return;
		     }
		     UserNode temp = head;
		     while (temp.next != null) {
		         temp = temp.next;
		     }
		     temp.next = user;
		 }

		// Search user by ID
		 public UserNode searchByUserId(int userId) {
		     UserNode temp = head;
		     while (temp != null) {
		         if (temp.userId == userId) return temp;
		         temp = temp.next;
		     }
		     return null;
		 }

		// Search user by Name
		 public void searchByName(String name) {
		     UserNode temp = head;
		     while (temp != null) {
		         if (temp.name.equalsIgnoreCase(name)) {
		             displayUser(temp);
		             return;
		         }
		         temp = temp.next;
		     }
		     System.out.println("User not found.");
		 }

		 
		// Add a friend connection between two users
		 public void addFriendConnection(int userId1, int userId2) {
		     UserNode user1 = searchByUserId(userId1);
		     UserNode user2 = searchByUserId(userId2);
		     if (user1 != null && user2 != null) {
		         user1.addFriend(userId2);
		         user2.addFriend(userId1);
		         System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
		     } 
		     else {
		         System.out.println("One or both users not found.");
		     }
		 }

		 	
		// Remove a friend connection
		 public void removeFriendConnection(int userId1, int userId2) {
		     UserNode user1 = searchByUserId(userId1);
		     UserNode user2 = searchByUserId(userId2);
		     if (user1 != null && user2 != null) {
		         user1.removeFriend(userId2);
		         user2.removeFriend(userId1);
		         System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
		     } 
		     else {
		         System.out.println("One or both users not found.");
		     }
		 }

		 
		// Find mutual friends between two users
		 public void findMutualFriends(int userId1, int userId2) {
		     UserNode user1 = searchByUserId(userId1);
		     UserNode user2 = searchByUserId(userId2);

		     if (user1 == null || user2 == null) {
		         System.out.println("One or both users not found.");
		         return;
		     }

		     System.out.print("Mutual friends between " + user1.name + " and " + user2.name + ": ");
		     FriendNode f1 = user1.friendList;
		     boolean found = false;
		     while (f1 != null) {
		         FriendNode f2 = user2.friendList;
		         while (f2 != null) {
		             if (f1.friendId == f2.friendId) {
		                 System.out.print(f1.friendId + " ");
		                 found = true;
		             }
		             f2 = f2.next;
		         }
		         f1 = f1.next;
		     }
		     if (!found) {
		         System.out.print("None");
		     }
		     System.out.println();
		 }
		 

		 // Display a user's friend list
		 public void displayUserFriends(int userId) {
		     UserNode user = searchByUserId(userId);
		     if (user != null) {
		         user.displayFriends();
		     } 
		     else {
		         System.out.println("User not found.");
		     }
		 }

		 // Display a user's details
		 private void displayUser(UserNode user) {
		     System.out.println("User: " + user.name + " (ID: " + user.userId + "), Age: " + user.age + ", Friends: " + user.countFriends());
		 }

		 
		 // Count number of friends for all users
		 public void countFriendsForAll() {
		     UserNode temp = head;
		     while (temp != null) {
		         System.out.println(temp.name + " (ID: " + temp.userId + ") has " + temp.countFriends() + " friends.");
		         temp = temp.next;
		     }
		 }
}



public class SocialMediaFriend {
	    public static void main(String[] args) {
	        SocialMediaList socialMedia = new SocialMediaList();

	        socialMedia.addUser(new UserNode(1, "Amit", 25));
	        socialMedia.addUser(new UserNode(2, "Priya", 23));
	        socialMedia.addUser(new UserNode(3, "Raj", 28));
	        socialMedia.addUser(new UserNode(4, "Sneha", 22));

	        socialMedia.addFriendConnection(1, 2);
	        socialMedia.addFriendConnection(1, 3);
	        socialMedia.addFriendConnection(2, 4);

	        socialMedia.displayUserFriends(1);
	        socialMedia.displayUserFriends(2);

	        System.out.println("\nFinding mutual friends between User 1 and 2:");
	        socialMedia.findMutualFriends(1, 2);

	        System.out.println("\nRemoving friend connection between 1 and 2:");
	        socialMedia.removeFriendConnection(1, 2);

	        socialMedia.displayUserFriends(1);
	        socialMedia.displayUserFriends(2);

	        System.out.println("\nSearch by Name:");
	        socialMedia.searchByName("Raj");

	        System.out.println("\nCount of Friends for All Users:");
	        socialMedia.countFriendsForAll();
	    }
	
}

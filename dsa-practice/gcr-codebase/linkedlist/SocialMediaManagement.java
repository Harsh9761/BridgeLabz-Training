class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;

    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

class SocialMedia {
    private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }

    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(u1, id2);
        addFriendToList(u2, id1);

        System.out.println("Friend connection added");
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = user.friends;
        user.friends = newNode;
    }

    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFromFriendList(u1, id2);
        removeFromFriendList(u2, id1);

        System.out.println("Friend connection removed");
    }

    private void removeFromFriendList(UserNode user, int friendId) {
        FriendNode curr = user.friends;
        FriendNode prev = null;

        while (curr != null) {
            if (curr.friendId == friendId) {
                if (prev == null)
                    user.friends = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual friends: ");
        FriendNode f1 = u1.friends;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    public void searchById(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            printUser(user);
        else
            System.out.println("User not found");
    }

    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private void printUser(UserNode u) {
        System.out.println("ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
    }
}



public class SocialMediaManagement {

	public static void main(String[] args) {
		
		SocialMedia socialmedia = new SocialMedia();

		socialmedia.addUser(1, "Alice", 22);
		socialmedia.addUser(2, "Bob", 24);
		socialmedia.addUser(3, "Charlie", 23);
		socialmedia.addUser(4, "David", 25);

		socialmedia.addFriend(1, 2);
		socialmedia.addFriend(1, 3);
		socialmedia.addFriend(2, 3);
		socialmedia.addFriend(2, 4);

		socialmedia.displayFriends(1);

		socialmedia.mutualFriends(1, 2);

		socialmedia.searchByName("Charlie");

		socialmedia.countFriends();

		socialmedia.removeFriend(1, 2);
		socialmedia.displayFriends(1);

	}

}

package lesson04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ZooClub {

    private List<User> userList = new ArrayList<>();


    public User addUserToZooClub(User user) {
        this.userList.add(user);
        System.out.println(userList);
        return user;
    }

    public void removeUser(int id) {
        Iterator<User> iterator = this.userList.iterator();
        while (iterator.hasNext()){
            User currentUser = iterator.next();
            if (currentUser.getId() == id){
                iterator.remove();
            }
            System.out.println(userList);
        }
    }

    public void getMemberPets() {
        System.out.println("Bring out all the animals of a particular owner");
        for (User user : userList) {
            System.out.println("Member List: \n" + "userID " + userList.indexOf(user) + " " + user);
        }
        System.out.println("Select user id from member list: ");
        Scanner in = new Scanner(System.in);
        int userId = in.nextInt();
        System.out.println(userList.get(userId).getPet());
    }

    public void getAllMembers() {
        System.out.println("All club members: ");
            for (User user : userList) {
                System.out.println("Member List: " + user);
            }
    }
}

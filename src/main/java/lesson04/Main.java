package lesson04;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Zoo club!");
        System.out.println("Please, select action:");


        System.out.println("Press 1 for open menu:");
        System.out.println("Press 0 for Exit");

        if (in.nextInt() == 1) {
            printMenu();
            List<User> users = new LinkedList<>();
            users.add(new User(1, "Vasya1", "Engry1", 2, UserGender.MAN));
            users.add(new User(2, "Petya1", "Pupkin1", 1, UserGender.MAN, new Pets("a", 1, "cat")));
            users.add(new User(3, "Olya1", "White1", 3, UserGender.WOMAN));

            int menu = in.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("Create a new club member");

                    System.out.println("Enter id:");
                    int id = in.nextInt();

                    System.out.println("Enter firstName:");
                    String firstName = in.next();

                    System.out.println("Enter lastName:");
                    String lastName = in.next();

                    System.out.println("Enter age:");
                    int age = in.nextInt();
                    System.out.println("Enter gender man/women:");
                    String gender = in.next();

                    if (gender.equalsIgnoreCase("man")) {
                        users.add(new User(id, firstName, lastName, age, UserGender.MAN));
                    } else if (gender.equalsIgnoreCase("women")) {
                        users.add(new User(id, firstName, lastName, age, UserGender.WOMAN));
                    } else {
                        System.out.println("Incorrect gender type");
                    }
                    for (User user : users) {
                        System.out.println(user);
                    }
                    break;
                }

                case 2: {
                    System.out.println("Add a pet to a club member");
                    System.out.println("Show all member: ");
                    for (User user : users) {
                        System.out.println("MemberId=" + users.indexOf(user) + " " + user);
                    }
                    System.out.println("Please enter member id:");
                    int memberId = in.nextInt();
                    for (User user : users) {
                        if (memberId == users.indexOf(user)) {
                            System.out.println(user);
                        }
                    }

                    System.out.println("Please enter pets Name:");
                    String petsName = in.next();
                    System.out.println("Please enter pets Age:");
                    int petsAge = in.nextInt();
                    System.out.println("Please enter pets Type:");
                    String petsType = in.next();

                    users.add(new Pets(petsName,petsAge,petsType));

                    for (User user : users) {
                        System.out.println(user);
                    }
                    break;
                }

                case 4: {
                    System.out.println("Remove member");
                    for (User user : users) {
                        System.out.println("MemberId=" + users.indexOf(user) + " " + user);
                    }
                    System.out.println("Enter id:");
                    int id = in.nextInt();
                    Iterator<User> iterator = users.iterator();
                    while (iterator.hasNext()) {
                        User currentUser = iterator.next();
                        if (currentUser.getId() == id) {
                            iterator.remove();
                        }
                    }
                    for (User user : users) {
                        System.out.println("MemberId=" + users.indexOf(user) + " " + user);
                    }

                }

                case 5: {
                    System.out.println("Bring out all the animals of a particular owner");
                    for (User user : users) {
                        System.out.println("MemberId=" + users.indexOf(user) + " " + user);
                    }
                    System.out.println("Enter id:");
                    int id = in.nextInt();
                    System.out.println("asdfsadfsd" + users.get(id).getPets());
                }

            }


        }
    }


    private static void printMenu() {
        System.out.println("Please, select action:");
        System.out.println("1. Create a new club member");
        System.out.println("2. Add a pet to a club member");
        System.out.println("3. Remove pet from owner");
        System.out.println("4. Remove member");
        System.out.println("5. Bring out all the animals of a particular owner ");
        System.out.println("6. All club members ");
        System.out.println("0. Back to menu");
    }
}

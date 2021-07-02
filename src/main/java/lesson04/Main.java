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
            users.add(new User(1, "Petya1", "Pupkin1", 1, UserGender.MAN, new Pets("a", 1, "cat")));
            users.add(new User(2, "Vasya1", "Engry1", 2, UserGender.MAN, new Pets("b", 1, "dog")));
            users.add(new User(3, "Olya1", "White1", 3, UserGender.WOMAN));

            int menu = in.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("Create a new club member");

                    int id = setIntValue(in, "Enter id:");
                    String firstName = setStringValue(in, "Enter firstName:");
                    String lastName = setStringValue(in, "Enter lastName:");

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
                    getMember(users);
                    int id = setIntValue(in,"Please enter member id:");
                    for (User user : users) {
                        if (id == users.indexOf(user)) {
                            System.out.println(user);
                        }
                    }

                    System.out.println("Please enter pets Name:");
                    String petsName = Main.setStringValue(in, "Please enter pets Name:");
                    int petsAge = setIntValue(in,"Please enter pets Age:");

                    System.out.println("Please enter pets Type:");
                    String petsType = in.next();

                    for (User user : users) {
                        if (id == users.indexOf(user)) {
                            user.setPets(new Pets(petsName, petsAge, petsType));
                            System.out.println(user);
                        }
                    }
                    break;
                }

                case 3:{


                }

                case 4: {
                    System.out.println("Remove member");
                    getMember(users);
                    int id = setIntValue(in, "Enter id:");
                    Iterator<User> iterator = users.iterator();
                    while (iterator.hasNext()) {
                        User currentUser = iterator.next();
                        if (currentUser.getId() == id) {
                            iterator.remove();
                        }
                    }
                    getMember(users);
                    break;
                }

                case 5: {
                    System.out.println("Bring out all the animals of a particular owner");
                    getMember(users);
                    int id = setIntValue(in, "Enter id:");
                    for (User user : users) {
                        if (id == users.indexOf(user))
                            System.out.println(user.getFirstName()+ " " + user.getLastName() + " " + user.getPets());
                    }
                    break;
                }

                case 6: {
                    System.out.println("All club members");
                    for (User user : users) {
                        System.out.println(users.indexOf(user) + " " + user);
                    }

                }

            }


        }
    }

    private static String setStringValue(Scanner in, String s) {
        return getName(in, s);
    }

    private static String getName(Scanner in, String s) {
        System.out.println(s);
        return in.next();
    }

    private static int setIntValue(Scanner in, String s) {
        System.out.println(s);
        return in.nextInt();
    }

    private static void getMember(List<User> users) {
        for (User user : users) {
            System.out.println("MemberId=" + users.indexOf(user) + " " + user);
        }
    }


    private static void printMenu() {
        System.out.println("Please, select action:");
        System.out.println("1. Create a new club member");
        System.out.println("2. Add a pet to a club member");
        System.out.println("3. Remove pet from owner");
        System.out.println("4. Remove member");
        System.out.println("5. Bring out all the animals of a particular owner ");
        System.out.println("6. All club members");
        System.out.println("0. Back to menu");
    }
}

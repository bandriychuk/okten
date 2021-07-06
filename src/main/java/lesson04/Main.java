//package lesson04;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        ZooClub zooClub = new ZooClub();
//        User userClass = new User();
//        List<Pet> pets = new LinkedList<>();
//
//        System.out.println("Welcome to Zoo club!");
//        System.out.println("Please, select action:");
//        System.out.println("1. Create a new club member");
//        System.out.println("2. Add a pet to a club member");
//        System.out.println("3. Remove pet from owner");
//        System.out.println("4. Remove member");
//        System.out.println("5. Bring out all the animals of a particular owner ");
//        System.out.println("6. All club members");
//        System.out.println("0. Exit");
//        Scanner in = new Scanner(System.in);
//        int menu = in.nextInt();
//
//        while (menu == 0) {
//
//            if (menu == 1) {
//                System.out.println("1. Create a new club member");
//                User NewMember = userClass.getMember(in);
//                zooClub.addUserToZooClub(NewMember);
//                continue;
//
//            } else if (menu == 2) {
//                System.out.println("2. Add a pet to a club member");
//                User NewMember = userClass.getMember(in, pets);
//                Pet newPet = userClass.getPet(in);
//                userClass.addPetToClubMember(NewMember, newPet);
//                continue;
//
//            } else if (menu == 3) {
//                System.out.println("3. Remove pet from owner");
//                User newMember = userClass.getMember(in, pets);
//                System.out.println("Enter pet name for remove");
//                String petName = in.next();
//                userClass.removePet(newMember, petName);
//                System.out.println(newMember);
//                continue;
//
//            } else if (menu == 4) {
//                System.out.println("4. Remove member");
//                int idForRemove = in.nextInt();
//                zooClub.removeUser(idForRemove);
//                continue;
//
//            } else if (menu == 5) {
//                System.out.println("5. Bring out all the animals of a particular owner ");
//                zooClub.getMemberPets();
//                continue;
//
//            } else if (menu == 6) {
//                System.out.println("6. All club members");
//                continue;
//
//            } else if (menu == 0) {
//                System.out.println("Good bye!");
//                zooClub.getAllMembers();
//                break;
//            }
//        }
//    }
//
//}

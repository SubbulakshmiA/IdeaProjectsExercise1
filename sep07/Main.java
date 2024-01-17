import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Lab1 Creating menu and choosing an item from the menu

        StringBuffer menu=new StringBuffer();
        menu.append("Please find below help menu");
        menu.append("\n");
        menu.append("1 : Print Your Name");
        menu.append("\n");
        menu.append("2 : Print Your Programming Background ");
        menu.append("\n");
        menu.append("3 : Print Your Experience");
        menu.append("\n");
        menu.append("4 : Exit");
        menu.append("\n");
        menu.append("5 : This Help Menu");
        System.out.println(menu.toString());

        while (true) {
            System.out.println("enter your choice");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("My name is Subbulakshmi");
                    break;
                    case "2":
                        System.out.println("My programming background is Android Development - Kotlin");
                        break;
                        case "3":
                            System.out.println("I have little experience in Android App development. Published one simple app in Play store");
                            break;
                            case "4":
                                System.out.println("Exit...");
                                System.exit(0);
                                case "5":
                                    System.out.println(menu.toString());
                                    break;
                                    default :
                                        System.out.println("no proper choice selected, so default...");
                                        break;
            }
        }
    }
}

//        System.out.println("I'm Subbulakshmi, have little experience in Android Development.");
//        System.out.println("Please select your menu: 1, 2, 3 or 0 for exit");
//        Scanner in = new Scanner(System.in);
//        int choice = 1;
//        while (choice<4 && choice!=0) {
//            choice = in.nextInt();
//            switch (choice) {
//                case 1 -> System.out.println("My name is Subbulakshmi");
//                case 2 -> System.out.println("Android developer");
//                case 3 -> System.out.println("Android App -NewsApp");
//              //  case 0 -> System.out.println("exit");
//                default -> System.out.println("Please select between 1 and 3 to show items and 0 to exit");
//            }
//        }




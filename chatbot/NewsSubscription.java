package chatbot;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NewsSubscription {

    Stack<SelectedOptions> stack = new Stack<>();

    void subscription(){
        NewsSubscription newsSubscription = new NewsSubscription();
        int choice;
        newsSubscription.stack.push(new SelectedOptions(0, 0));
        Scanner sc = new Scanner(System.in);
        newsSubscription.print(0, 0);
        do {
            System.out.println();
            choice = sc.nextInt();
            if (choice == 9) {
                newsSubscription.stack.pop();

                if (newsSubscription.stack.isEmpty()) {
                    break;
                }
            } else {
                newsSubscription.stack.push(new SelectedOptions(newsSubscription.stack.peek().getLevel() + 1, choice));
            }
            SelectedOptions top = newsSubscription.stack.peek();
            newsSubscription.print(top.getLevel(), top.getChoice());

        } while (choice != 0);
        sc.close();
        System.out.println("Exited...");
    }

    private void print(int level, int choice) {
        for (String choiceString : getChoices(level, choice)) {
            System.out.println(choiceString);
        }
    }

    private ArrayList<String> getChoices(int level, int choice) {
        ArrayList<String> choiceList = new ArrayList<>();
        if (level == 0) {
            System.out.println("\nSelect your preferred Language");
            choiceList.add(Level1.OPTION_1.toString());
            choiceList.add(Level1.OPTION_2.toString());
            choiceList.add(Level1.OPTION_3.toString());
            choiceList.add(Level1.OPTION_4.toString());
        } else if (level == 1) {
            System.out.println("\nSelect your preferred category");
            choiceList.add(Level2.OPTION_1.toString());
            choiceList.add(Level2.OPTION_2.toString());
            choiceList.add(Level2.OPTION_3.toString());
            choiceList.add(Level2.OPTION_4.toString());
            choiceList.add(Level2.OPTION_5.toString());
            choiceList.add(Level2.OPTION_6.toString());
        } else if (level == 2) {
            System.out.println("\nSelect your preferred plan pricing");
            choiceList.add(Level3.OPTION_1.toString());
            choiceList.add(Level3.OPTION_2.toString());
            choiceList.add(Level3.OPTION_3.toString());
            choiceList.add(Level3.OPTION_4.toString());
            choiceList.add(Level3.OPTION_5.toString());
            choiceList.add(Level3.OPTION_6.toString());
        } else if (level == 3) {
            System.out.println("Thank you for subscribing.");
            System.out.println("9-Back");
            System.out.println("0-Exit");
        }
        return choiceList;
    }

    public static void main(String[] args) {
        NewsSubscription newsSubscription = new NewsSubscription();
        newsSubscription.subscription();
    }
}
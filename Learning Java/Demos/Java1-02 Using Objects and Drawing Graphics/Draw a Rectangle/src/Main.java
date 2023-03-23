import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {

        //Get User Name
        Scanner conIn = new Scanner(System.in);
        System.out.print("What is your name?");
        String userName = conIn.next();
        conIn.nextLine();

        //Get Box Dimentions
        System.out.print("Specify box Width (1 to 100): ");
        int boxWidth = conIn.nextInt();
        System.out.print("Specify box Height (1 to 100): ");
        int boxHeight = conIn.nextInt();

        //Set up drawing pannel
        DrawingPanel dp = new DrawingPanel(200, 200);
        dp.setBackground(Color.BLACK);
        Graphics dpg = dp.getGraphics();

        DrawingPanel testDP = dp;
        testDP.setBackground(Color.LIGHT_GRAY);

        //Draw salutatuiion and the box
        dpg.setColor(Color.WHITE);
        dpg.fillRect(50, 50, boxWidth, boxHeight);
        dpg.setFont(new Font("Arial Bold", Font.PLAIN, 12));
        userName = userName.toUpperCase();
        dpg.drawString("HELLO " + userName, 0, 14);

    }
}
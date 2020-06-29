import java.util.Scanner;

public class Library {
    public static void main(final String[] args) {
        int userBookChoice;
        final String[] list = {
                "http://www.gutenberg.org/ebooks/1727.epub.images?session_id=826f005e82cf66fc8e8790fdcc44ea9c2c1b8de9",
                "https://bit.ly/2xTJMzm", "https://www.planetebook.com/free-ebooks/1984.pdf",
                "https://www.pdfdrive.com/download.pdf?id=3439748&h=099c1f52ca2f8fd7306dad8372d6f535&u=cache&ext=pdf" };

        final Scanner keyboard = new Scanner(System.in);

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        System.out.println("Welcome to your book library!\nIn this library, you can enter the number of the\n"
                + "book you want to read and we will provide the website link for you to download or view the book");

        System.out.print("\n1.The Odyssey" + "\n2. Fellowship of the Ring" + "\n3. 1984"
                + "\n4. Percy Jackson and the Lightning Thief" + "\n\nEnter the number of the book you want: ");
        userBookChoice = keyboard.nextInt();

        System.out.println(list[userBookChoice - 1]);

        keyboard.close();

    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name of the file to read: ");
    File file = new File(scanner.nextLine());
    scanner = new Scanner(file);

    // TODO: Add your implementation below here.
    // The following line is provided for you to modify and re-arrange.
    // More lines of code will need to be added.

    // boolean isNextAvailable = scanner.hasNext(); I did not need to use the boolean isNextAvailable.
    // String word = scanner.next(); I don't need to store the value of scanner.next(), I just need to count the number of words.
    int wordCount = 0;

    while (scanner.hasNext()) {
      wordCount++;
      scanner.next();
    }
    System.out.println(wordCount + " words");
  }
}

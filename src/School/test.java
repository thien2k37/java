package School;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Admissions admissions = new Admissions();

        StudentManager studentManager = new BlockB("thien", "Nghệ An", 3);
        BlockC blockC = new BlockC("thị", "Hà Tĩnh", 4);
        BlockA blockA = new BlockA("Hường", "Đô Lương", 5);
        admissions.add(studentManager);
        admissions.add(blockC);
        admissions.add(blockA);
        admissions.display();

        System.out.println("Input fine by number: ");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        admissions.fineByNumberL(nb);

        System.out.println("Exit the program input 0");
        int exit = sc.nextInt();
        admissions.exit(exit);
    }
}

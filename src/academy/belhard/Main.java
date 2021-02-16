package academy.belhard;

import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
    User b1 = new User("Nick", "Dobrinskiy", "dobrik_nik@mail.ru", "123456789");
    User b2 = new User("Leyla", "Meksikanec", "pupsic@mail.ru", "123456732");
    User b3 = new User("Slobola", "Mokrickaya", "degenerat@mail.ru", "123df456789");


    System.out.println(b1.getFullInfo());
    System.out.println(b1.isPasswordCorrect(b1.getPassword()));
    System.out.println(b2.getFullInfo());
    System.out.println(b2.isPasswordCorrect(b1.getPassword()));
    System.out.println(b3.getFullInfo());
    System.out.println(b3.isPasswordCorrect(b1.getPassword()));
    }
}

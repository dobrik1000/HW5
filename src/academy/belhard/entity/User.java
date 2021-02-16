package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo(){
        return "Имя: " + firstName + " " + lastName + "\n" + "E-mail: " + email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isPasswordCorrect(String n1){
        if (n1.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}

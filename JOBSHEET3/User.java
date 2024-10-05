public class User {
    public String username;
    public String name;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User (String username, String name, String email){
        this.username = username;
        this.name = name;
        this.email = email;
    }
    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat); 
        System.out.println("Pekerjaan: " + pekerjaan); 

}
}
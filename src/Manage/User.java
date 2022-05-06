package Manage;

public class User {
    private int idUser;
    private String userName;
    private String passWord;
    private String status;
    private Role role;

    public User() {
    }

    public User(int idUser, String userName, String passWord, String status, Role role) {
        this.idUser = idUser;
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return idUser + "," + userName + "," + passWord + "," + status + "," + role;
    }
}

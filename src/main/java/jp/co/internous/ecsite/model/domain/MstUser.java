package jp.co.internous.ecsite.model.domain;

public class MstUser {

    private int id;
    private String userName;
    private String password;
    private String fullName;
    private int isAdmin;

    // idのためのゲッターメソッド
    public int getId() {
        return id;
    }

    // idのためのセッターメソッド
    public void setId(int id) {
        this.id = id;
    }

    // userNameのためのゲッターメソッド
    public String getUserName() {
        return userName;
    }

    // userNameのためのセッターメソッド
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // passwordのためのゲッターメソッド
    public String getPassword() {
        return password;
    }

    // passwordのためのセッターメソッド
    public void setPassword(String password) {
        this.password = password;
    }

    // fullNameのためのゲッターメソッド
    public String getFullName() {
        return fullName;
    }

    // fullNameのためのセッターメソッド
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // isAdminのためのゲッターメソッド
    public int getIsAdmin() {
        return isAdmin;
    }

    // isAdminのためのセッターメソッド
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
}

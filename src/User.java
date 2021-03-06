/**
 * Created by Vlad on 17.05.2017.
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String userRights;

    public User(int id, String name, String surname, String login, String userRights) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.userRights = userRights;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getUserRights() {
        return userRights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setUserRights(String userRights) {
        this.userRights = userRights;
    }

    @Override
    public String toString() {
        return "id:\t" + id +
                "\nName:\t'" + name + '\'' +
                "\nSurname:\t'" + surname + '\'' +
                "\nLogin:\t'" + login + '\'' +
                "\nuserRights:\t'" + userRights + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(user.getSurname()) : user.getSurname() != null) return false;
        if (getLogin() != null ? !getLogin().equals(user.getLogin()) : user.getLogin() != null) return false;
        return getUserRights().equals(user.getUserRights());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getLogin() != null ? getLogin().hashCode() : 0);
        result = 31 * result + (getUserRights() != null ? getUserRights().hashCode() : 0);
        return result;
    }
}

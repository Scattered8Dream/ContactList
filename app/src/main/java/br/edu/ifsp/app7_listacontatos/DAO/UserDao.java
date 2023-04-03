package br.edu.ifsp.app7_listacontatos.DAO;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.app7_listacontatos.Model.User;

public class UserDao {

    private List<User> users = new ArrayList<>();
    private UserDao(){};
    private static UserDao instance;


    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findByName(String name) {
        for (User user : users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public static UserDao getInstance(){
        if (instance == null){
            instance = new UserDao();
        }
        return instance;
    }

    public boolean verifPassword(String name, String password) {
        for (User user: users){
            if (name.equals(user.getName()) && password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}

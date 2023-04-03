package br.edu.ifsp.app7_listacontatos.Model;
import br.edu.ifsp.app7_listacontatos.Model.Person;

import java.net.PasswordAuthentication;
import java.util.List;
import br.edu.ifsp.app7_listacontatos.Model.Person;
public class User {

    String name;
    String password;
    List<Person> contacts;

    public User(String name, String password, List<Person> contacts) {
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Person> getContacts() {
        return contacts;
    }

    public void setContacts(List<Person> contacts) {
        this.contacts = contacts;
    }
}

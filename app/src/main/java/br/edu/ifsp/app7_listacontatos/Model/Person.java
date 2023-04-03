package br.edu.ifsp.app7_listacontatos.Model;

import android.provider.ContactsContract;

public class Person {

    String nickname;
    String name;
    String cellphone;

    public Person(String nickname, String name, String cellphone) {
        this.nickname = nickname;
        this.name = name;
        this.cellphone = cellphone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}

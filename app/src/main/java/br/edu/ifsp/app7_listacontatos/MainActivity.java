package br.edu.ifsp.app7_listacontatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifsp.app7_listacontatos.DAO.UserDao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtLogin;
    private EditText edtPassword;
    private Button btnLogin;
    private Button btnNewUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setClickListener();
        UserDao.getInstance();

    }

    private void setOnClickListener() {
        btnLogin.setOnClickListener(this);
        btnNewUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==btnLogin){
            useContactsActivity();
        }
        if(view==btnNewUser) {
            useNewUserActivity();
        }
    }


    private void findViews(){

        this.edtLogin = findViewById(R.id.edtLogin);
        this.edtPassword = findViewById(R.id.edtPassword);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.btnNewUser = findViewById(R.id.btnNewUser);

    }

    private void setClickListener(){
        btnLogin.setOnClickListener(this);
        btnNewUser.setOnClickListener(this);
    }

    private void useNewUserActivity(){

    }

    private void useContactsActivity() {
        Bundle bundle = new Bundle();
        bundle.putString("John Doe",getEdtLogin(edtLogin));
        bundle.putString("Secreta123",getEdtPassword(edtPassword));

        Intent intent = new Intent(this, ContactsActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public String getEdtLogin(EditText edtLogin) {
        return this.edtLogin.getText().toString();
    }

    public String getEdtPassword(EditText edtPassword) {
        return this.edtPassword.getText().toString();
    }
}

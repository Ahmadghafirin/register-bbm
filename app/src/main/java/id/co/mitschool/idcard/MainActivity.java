package id.co.mitschool.idcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private EditText etEmail;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_bbm);

        etName = (EditText) findViewById(R.id.et_name);

        etEmail = (EditText) findViewById(R.id.et_email);

        etPassword = (EditText) findViewById(R.id.et_password);

    }

    public void submit(View view) {
        String nama = etName.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        if (nama.isEmpty()) {
            etName.setError("Name harus diisi!");
            etName.requestFocus();
            return;
            /*Toast.makeText(MainActivity.this, "Name harus diisi", Toast.LENGTH_SHORT).show();*/
        } else if (email.isEmpty()) {
            etEmail.setError("Email harus diisi!");
            etEmail.requestFocus();
            return;
            /*Toast.makeText(MainActivity.this, "Email harus diisi", Toast.LENGTH_SHORT).show();*/
        } else if (password.isEmpty()) {
            etPassword.setError("Password harus diisi!");
            etPassword.requestFocus();
            return;
            /*Toast.makeText(MainActivity.this, "Password harus diisi", Toast.LENGTH_SHORT).show();*/
        } else
            Toast.makeText(MainActivity.this, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show();
    }

    public void show(View view) {
        Toast.makeText(this, "Hallo", Toast.LENGTH_SHORT).show();
    }
}

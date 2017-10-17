package skuniv.ac.kr.quickpollapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import skuniv.ac.kr.quickpollapplication.UI.CourseListForProfessor;

/**
 * Created by Juhyun on 2017-10-17.
 */

public class Activity_Login extends AppCompatActivity {

    public String input_id = "";
    public String input_password = "";
    private EditText id_edit, password_edit;
    private Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id_edit = (EditText)findViewById(R.id.editText_id);
        password_edit = (EditText)findViewById(R.id.editText_password);
        login_button = (Button)findViewById(R.id.button_login);


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_id = id_edit.getText().toString();
                input_password = password_edit.getText().toString();
                if(input_id!=null && input_password != null) {
                    Intent intent = new Intent(Activity_Login.this, CourseListForProfessor.class);
                    intent.putExtra("id", input_id);
                    intent.putExtra("password", input_password);
                    Log.d("check", input_id+", " + input_password + "!!!");
                    startActivity(intent);
                    finish();
                }
            }
        });

    }


}

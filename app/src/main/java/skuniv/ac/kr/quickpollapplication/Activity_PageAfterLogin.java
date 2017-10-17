package skuniv.ac.kr.quickpollapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Juhyun on 2017-10-17.
 */

public class Activity_PageAfterLogin extends AppCompatActivity{

    public String input_id = "";
    public String input_password = "";
    private TextView ResultTxT;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_after_login);

        Intent intent = getIntent();
        input_id = intent.getStringExtra("id");
        input_password = intent.getStringExtra("password");

        ResultTxT = (TextView)findViewById(R.id.ResultTxt);
        ResultTxT.setText("ID : " + input_id + "\nPASSOWRD : " + input_password);

    }
}

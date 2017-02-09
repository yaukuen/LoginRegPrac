package group9.tcss450.uw.edu.loginregprac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registration(View view) {
        Intent launchReg = new Intent(this, RegestrationActivity.class);
        startActivity(launchReg);
    }
}

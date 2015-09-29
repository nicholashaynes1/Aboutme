package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class AboutMeActivity extends AppCompatActivity

{
    private Button skatingButton;
    private Button workingButton;
    private Button computersButton;
    private Button musicButton;
    private Button gymButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        skatingButton = (Button) findViewById(R.id.skatingButton);
        workingButton = (Button) findViewById(R.id.workButton);
        computersButton = (Button) findViewById(R.id.computerButton);
        musicButton = (Button) findViewById(R.id.musicButton);
        gymButton = (Button) findViewById(R.id.gymButton);

        listener;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void listener()
    {
        @Override
                public void onClick()
    }

}

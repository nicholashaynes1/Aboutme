package ctec.aboutme;

import android.media.Image;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class AboutMeActivity extends ActionBarActivity

{
    private Button skatingButton;
    private Button workingButton;
    private Button computersButton;
    private Button musicButton;
    private Button gymButton;
    private Button homeButton;
    private ImageView gymPicture;
    private TextView imageText;
    private ImageView skatingPicture;
    private ImageView workPicture;
    private ImageView computerPicture;
    private ImageView musicPicture;


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
        homeButton = (Button) findViewById(R.id.homeButton);

        musicPicture = (ImageView) findViewById(R.id.musicPicture);
        gymPicture = (ImageView) findViewById(R.id.gymPicture);
        skatingPicture = (ImageView) findViewById(R.id.skatingPicture);
        workPicture = (ImageView) findViewById(R.id.workPicture);
        computerPicture = (ImageView) findViewById(R.id.computerPicture);

        imageText = (TextView) findViewById(R.id.imageTextbox);


        setupListeners();
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
    private void homeScreen()
    {
        if(skatingButton.getVisibility() == View.GONE)
        {
            skatingButton.setVisibility(View.VISIBLE);
            workingButton.setVisibility(View.VISIBLE);
            computersButton.setVisibility(View.VISIBLE);
            musicButton.setVisibility(View.VISIBLE);
            gymButton.setVisibility(View.VISIBLE);


            homeButton.setVisibility(View.GONE);

            musicPicture.setVisibility(View.GONE);
            computerPicture.setVisibility(View.GONE);
            workPicture.setVisibility(View.GONE);
            skatingPicture.setVisibility(View.GONE);
            gymPicture.setVisibility(View.GONE);
            imageText.setVisibility(View.GONE);
        }
    }




    private void skateScreen()
    {
        if(skatingButton.getVisibility() == View.VISIBLE)
        {
            skatingButton.setVisibility(View.GONE);
            workingButton.setVisibility(View.GONE);
            computersButton.setVisibility(View.GONE);
            musicButton.setVisibility(View.GONE);
            gymButton.setVisibility(View.GONE);

            skatingPicture.setVisibility(View.VISIBLE);

            homeButton.setVisibility(View.VISIBLE);

            imageText.setVisibility(View.VISIBLE);

            imageText.setText(R.string.skating_text );

        }


        {

        }
    }


    private void workingScreen()
    {
        if (workingButton.getVisibility() == View.VISIBLE)
        {
            skatingButton.setVisibility(View.GONE);
            workingButton.setVisibility(View.GONE);
            computersButton.setVisibility(View.GONE);
            musicButton.setVisibility(View.GONE);
            gymButton.setVisibility(View.GONE);

            homeButton.setVisibility(View.VISIBLE);

            workPicture.setVisibility(View.VISIBLE);

            imageText.setVisibility(View.VISIBLE);
            imageText.setText(R.string.working_text);
        }
    }


    private void computerScreen()
    {
        if(computersButton.getVisibility() == View.VISIBLE)
        {
            skatingButton.setVisibility(View.GONE);
            workingButton.setVisibility(View.GONE);
            computersButton.setVisibility(View.GONE);
            musicButton.setVisibility(View.GONE);
            gymButton.setVisibility(View.GONE);

            homeButton.setVisibility(View.VISIBLE);

            computerPicture.setVisibility(View.VISIBLE);

            imageText.setVisibility(View.VISIBLE);
            imageText.setText(R.string.computer_text);
        }
    }


    private void musicScreen()
    {
        if (musicButton.getVisibility() == View.VISIBLE)
        {
            skatingButton.setVisibility(View.GONE);
            workingButton.setVisibility(View.GONE);
            computersButton.setVisibility(View.GONE);
            musicButton.setVisibility(View.GONE);
            gymButton.setVisibility(View.GONE);

            musicPicture.setVisibility(View.VISIBLE);

            homeButton.setVisibility(View.VISIBLE);


            imageText.setVisibility(View.VISIBLE);
            imageText.setText(R.string.music_text);
        }
    }



    private void gymScreen()
    {
        if(gymButton.getVisibility() == View.VISIBLE)
        {
            skatingButton.setVisibility(View.GONE);
            workingButton.setVisibility(View.GONE);
            computersButton.setVisibility(View.GONE);
            musicButton.setVisibility(View.GONE);
            gymButton.setVisibility(View.GONE);

            homeButton.setVisibility(View.VISIBLE);

            gymPicture.setVisibility(View.VISIBLE);
            imageText.setVisibility(View.VISIBLE);

            imageText.setText(R.string.gym_text);

        }
    }





    private void setupListeners()
    {
                homeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View ButtonView) {
                        homeScreen();
                    }


                });



                skatingButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View ButtonView)
                    {
                        skateScreen();
                    }


                });


                workingButton.setOnClickListener (new View.OnClickListener()
                {
                @Override
                public void onClick(View ButtonView)
                {
                    workingScreen();
                }

                });



                computersButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View ButtonView)
                    {
                        computerScreen();
                    }
                });


                musicButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View ButtonView)
                    {
                        musicScreen();
                    }
                });


                gymButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View ButtonView)
                    {
                        gymScreen();
                    }
                });

    }


}

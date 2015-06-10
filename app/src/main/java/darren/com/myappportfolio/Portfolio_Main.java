package darren.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class Portfolio_Main extends ActionBarActivity {
    Button btnSpotify, btnScores, btnLibrary,btnXYZ,btnBuildItBigger, btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio__main);
        createButtons();
        attachListeners();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void createButtons(){
        btnSpotify= (Button)findViewById(R.id.btnSpotifyStream);
        btnScores= (Button)findViewById(R.id.btnScores);
        btnLibrary= (Button)findViewById(R.id.btnLibrary);
        btnXYZ= (Button)findViewById(R.id.btnXYZ);
        btnBuildItBigger= (Button)findViewById(R.id.btnBuildItBigger);
        btnCapstone= (Button)findViewById(R.id.btnCapstone);
    }

    public void attachListeners(){
        btnSpotify.setOnClickListener(onClickListener);
        btnScores.setOnClickListener(onClickListener);
        btnLibrary.setOnClickListener(onClickListener);
        btnXYZ.setOnClickListener(onClickListener);
        btnBuildItBigger.setOnClickListener(onClickListener);
        btnCapstone.setOnClickListener(onClickListener);
    }
    public void maketoast(String app){

        Context context = getApplicationContext();
        String text = "This button will launch my " + app + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnSpotifyStream:
                    maketoast("Spotify Stream");
                    break;

                case R.id.btnScores:
                    maketoast("Scores");
                    break;

                case R.id.btnLibrary:
                    maketoast("Library");
                    break;

                case R.id.btnBuildItBigger:
                    maketoast("Build It Bigger");
                    break;

                case R.id.btnXYZ:
                    maketoast("XYZ Reader");
                    break;

                case R.id.btnCapstone:
                    maketoast("Capstone");
                    break;
            }

        }
    };

}

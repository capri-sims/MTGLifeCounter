package capri_sims.mtglifecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset(findViewById(android.R.id.content));
    }

    public void reset(View view){
        ((TextView)findViewById(R.id.counterLeft)).setText(R.string.twenty);
        ((TextView)findViewById(R.id.counterRight)).setText(R.string.twenty);
    }

    public void upLeft(View view){
        CharSequence s = ((TextView)findViewById(R.id.counterLeft)).getText();
        int n = Integer.parseInt(s.toString());
        n++;
        ((TextView)findViewById(R.id.counterLeft)).setText(Integer.toString(n));
    }

    public void downLeft(View view){
        CharSequence s = ((TextView)findViewById(R.id.counterLeft)).getText();
        int n = Integer.parseInt(s.toString());
        n--;
        ((TextView)findViewById(R.id.counterLeft)).setText(Integer.toString(n));
    }

    public void upRight(View view){
        CharSequence s = ((TextView)findViewById(R.id.counterRight)).getText();
        int n = Integer.parseInt(s.toString());
        n++;
        ((TextView)findViewById(R.id.counterRight)).setText(Integer.toString(n));
    }

    public void downRight(View view){
        CharSequence s = ((TextView)findViewById(R.id.counterRight)).getText();
        int n = Integer.parseInt(s.toString());
        n--;
        ((TextView)findViewById(R.id.counterRight)).setText(Integer.toString(n));
    }
}

package com.appdeveloperrohitgmail.smily_rating_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {

    //add dependency
    //add xml <com.hsalf.smilerating.SmileRating>
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SmileRating smileRating=(SmileRating)findViewById(R.id.smiley_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley) {
                switch (smiley)
                {
                    case SmileRating.BAD:
                        Toast.makeText(getApplicationContext(),"bad",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(getApplicationContext(),"Good",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(getApplicationContext(),"Okay",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(getApplicationContext(),"Terrible",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(getApplicationContext(),"Great",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    public TextView text;
    public String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        text= (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        string = intent.getStringExtra("Test Tweet!");
        text.setText(string);





    }
}

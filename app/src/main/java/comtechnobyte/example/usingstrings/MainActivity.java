package comtechnobyte.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtVMsg2 =findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);
        Log.i("LifeCycle", "Oncreate called...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", "OnStart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", "OnResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", "OnPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", "OnStop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", "OnDestroy called...");
    }
}
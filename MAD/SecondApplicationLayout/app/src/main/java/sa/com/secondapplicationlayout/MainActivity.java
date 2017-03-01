package sa.com.secondapplicationlayout;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = (TextView) findViewById(R.id.textview2);
        textView2.setText("0");

        BackgroundTask task = new BackgroundTask(0,10);
        task.execute();

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();

        String s = pref.getString("user","");
        int age = pref.getInt("userAge", 25);

        editor.putString("user","anik");
        editor.putInt("userAge",25);
        editor.commit();
    }

    class BackgroundTask extends AsyncTask<String, String, String>{

        private int start;
        private int end;

        public BackgroundTask() {
            super();
        }

        public BackgroundTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected String doInBackground(String... strings) {

            for(;start<=end;start++){
                try {
                    Thread.sleep(1000);
                    MainActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView2.setText(start+"");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }


}


















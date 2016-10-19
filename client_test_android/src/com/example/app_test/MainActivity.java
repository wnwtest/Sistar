package com.example.app_test;

import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mysql_test.R;

public class MainActivity extends Activity {
	private ProgressDialog pDialog;
    JSONParser jsonParser = new JSONParser();
	Button get_button;
	
	private static String url = "http://127.0.0.1:8081/ci310/index.php/api/widgets";
    private static final String TAG_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_button=(Button)findViewById(R.id.get_button);
        get_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
              
                new Update().execute();            

                }
        });
    }
    class Update extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("checking ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }
        protected String doInBackground(String... args) {

           try{
            String json = jsonParser.GetHttpRequest(url,
                    "GET", "");
            return json;
            
           }catch(Exception e){
               e.printStackTrace(); 
               return "";          
           }
        }
        protected void onPostExecute(String message) {                  
            pDialog.dismiss();
            Toast.makeText(getApplicationContext(), message, 8000).show();
        }
    }
}

package com.example.parsaniahardik.customdialogrecyclerview;

import android.app.Activity;
import android.app.Dialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    public static TextView textView;
    public static Dialog dialog;
    private Button dialogBtn;
    private String[] myImageNameList = new String[]{"Benz", "Bike",
            "Car","Carrera"
            ,"Ferrari","Harly",
            "Lamborghini","Silver"};
    List<DriverVehicle> driverVehicles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);

        dialogBtn = findViewById(R.id.btn);
        driverVehicles = new ArrayList<>();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://mocki.io/v1/e0cabe8d-b68e-4f19-9fe0-96cbd28962c7")
                .method("GET", null)
                .build();

        try {
            Response response = client.newCall(request).execute();

            String jsonData = response.body().string();
            JSONObject Jobject = new JSONObject(jsonData);
            JSONObject obj =Jobject.getJSONObject("response");

            JSONArray array = obj.getJSONArray("cabList");
//            Log.d("response", String.valueOf(array));

            if(array != null && array.length() > 0) {
                Gson gson = new GsonBuilder().registerTypeAdapter(Long.class, new LongTypeAdapter()).create();
                List<DriverVehicle> items = gson.fromJson(array.toString(), new TypeToken<List<DriverVehicle>>() {
                }.getType());
                driverVehicles.clear();
                driverVehicles.addAll(items);
            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }


        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(MainActivity.this,driverVehicles);
            }
        });

    }

    public void showDialog(Activity activity, List<DriverVehicle> driverVehicles){

        dialog = new Dialog(activity);
        // dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_recycler);

        Button btndialog = (Button) dialog.findViewById(R.id.btnSvD);
        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Vehicle Selected",Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });

        RecyclerView recyclerView = dialog.findViewById(R.id.recycler);
        AdapterRe adapterRe = new AdapterRe(MainActivity.this,driverVehicles);
        recyclerView.setAdapter(adapterRe);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        dialog.show();

    }

}

package ie.ul.studentsavermealhelper;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Switch vegSwitch, chickenSwitch, porkSwitch, fishSwitch;
    //public String[] tags = new String [] {"vegetarian", "chicken", "pork", "fish"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        vegSwitch = findViewById(R.id.vegSwitch);
        chickenSwitch = findViewById(R.id.chickenSwitch);
        porkSwitch = findViewById(R.id.porkSwitch);
        fishSwitch = findViewById(R.id.fishSwitch);




        //Use SharedPreferences and an editor to ensure the values for the switches remains constant between activities and exits
        SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);
        vegSwitch.setChecked(sharedPreferences.getBoolean("vValue", true));
        chickenSwitch.setChecked(sharedPreferences.getBoolean("cValue", true));
        porkSwitch.setChecked(sharedPreferences.getBoolean("pValue", true));
        fishSwitch.setChecked(sharedPreferences.getBoolean("fValue", true));



        vegSwitch.setOnClickListener(v -> {
            if (vegSwitch.isChecked()){
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("vValue", true);
                editor.apply();
                vegSwitch.setChecked(true);
                GlobalClass.vegSwitch = true;
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("vValue", false);
                editor.apply();
                vegSwitch.setChecked(false);
                GlobalClass.vegSwitch = false;
            }
        });

        chickenSwitch.setOnClickListener(v -> {
            if (chickenSwitch.isChecked()){
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("cValue", true);
                editor.apply();
                chickenSwitch.setChecked(true);
                GlobalClass.chickenSwitch = true;
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("cValue", false);
                editor.apply();
                chickenSwitch.setChecked(false);
                GlobalClass.chickenSwitch = false;
            }
        });

        porkSwitch.setOnClickListener(v -> {
            if (porkSwitch.isChecked()){
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("pValue", true);
                editor.apply();
                porkSwitch.setChecked(true);
                GlobalClass.porkSwitch = true;
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("pValue", false);
                editor.apply();
                porkSwitch.setChecked(false);
                GlobalClass.porkSwitch = false;
            }
        });

        fishSwitch.setOnClickListener(v -> {
            if (fishSwitch.isChecked()){
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("fValue", true);
                editor.apply();
                fishSwitch.setChecked(true);
                GlobalClass.fishSwitch = true;
            } else {
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putBoolean("fValue", false);
                editor.apply();
                fishSwitch.setChecked(false);
                GlobalClass.fishSwitch = false;
            }
        });




    }

}
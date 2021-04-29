package ie.ul.studentsavermealhelper;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeViewActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView recipeN, type, steps;

    String tempName, tempType, tempSteps;
    int pictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_view);

        mainImageView = findViewById(R.id.heroImage);
        recipeN = findViewById(R.id.title);
        steps = findViewById(R.id.instructions);
        type = findViewById(R.id.type);

        getData();
        setData();

    }

    private void getData() {
        if(getIntent().hasExtra("pictures") && getIntent().hasExtra("tempName") && getIntent().hasExtra("tempType")){

            tempName = getIntent().getStringExtra("tempName");
            tempType = getIntent().getStringExtra("tempType");
            tempSteps = getIntent().getStringExtra("tempSteps");
            pictures = getIntent().getIntExtra("pictures", 1);

        } else {
            Toast.makeText(this, "An error has occured", Toast.LENGTH_SHORT).show();
            }
    }
    private void setData() {
        recipeN.setText(tempName);
        type.setText(tempType);
        steps.setText(tempSteps);
        mainImageView.setImageResource(pictures);
    }



}
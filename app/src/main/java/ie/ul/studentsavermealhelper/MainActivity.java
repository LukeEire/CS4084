package ie.ul.studentsavermealhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    //Declare all required variables
    String[] items;
    String[] type;
    String[] steps;
    int[] pictures;
    RecyclerView recyclerView;
    Intent restartIntent;

    @Override
    //Creates the instance of the main activity and sets the layout to the activity main xml file
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sets the recycler view to prepare to start populating the main activity dynamically
        recyclerView = findViewById(R.id.recyclerView);

        //Sets the local variables to match the global variables set in GlobalClass
        items = ((GlobalClass) this.getApplication()).getRecipeNames();
        type = ((GlobalClass) this.getApplication()).getRecipeTypes();
        steps = ((GlobalClass) this.getApplication()).getRecipeSteps();
        pictures = ((GlobalClass) this.getApplication()).getRecipePics();

        //Feeds the recycler adapter the context as well as the variables it will need to populate the feed
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, items, type, pictures, steps);
        //Sets adapter to the view
        recyclerView.setAdapter(recyclerAdapter);
        //Sets the layout as linear given this context
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //This is used to save this intent to be reset if needed in another section
        restartIntent = getIntent();
    }

    @Override
    //Standard inflater for the options menu in the top bar
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    //Controls what happens when one of the items at the top is selected
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Creates the intent to go from this activity to the SettingsActivity then runs it
        if (item.getItemId() == R.id.settingMenuItem) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
            //This finished the current activity and then restarts it using the previously saved intent
        }else if (item.getItemId() == R.id.refreshMenuItem){
            finish();
            startActivity(restartIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
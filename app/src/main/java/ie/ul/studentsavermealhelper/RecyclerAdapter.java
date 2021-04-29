package ie.ul.studentsavermealhelper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    String[] tempName;
    String[] tempType;
    String[] tempSteps;
    int[] pictures;
    Context context;

    /*public int arrayCount(String[] items){
        int count = 0;
        int temp = 0;
        if (items.length > temp){
            if (items[temp] != null){
                count++;
                temp++;
            }
        }
        return count;
    }*/

    public RecyclerAdapter(Context ct, String[] items, String[] type, int[] pics, String[] steps){
        context = ct;
        tempName = items;
        tempType = type;
        tempSteps = steps;
        pictures = pics;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recipe_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tView1.setText(tempName[position]);
        holder.tView2.setText(tempType[position]);
        holder.iView.setImageResource(pictures[position]);
        holder.mainLayout.setOnClickListener(v -> {
            Intent intent = new Intent(context, RecipeViewActivity.class);
            intent.putExtra("tempName", tempName[position]);
            intent.putExtra("tempType", tempType[position]);
            intent.putExtra("tempSteps", tempSteps[position]);
            intent.putExtra("pictures", pictures[position]);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {

        return tempName.length ;

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tView1, tView2;
        ImageView iView;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super (itemView);
            tView1 = itemView.findViewById(R.id.recipeName);
            tView2 = itemView.findViewById(R.id.mainIngredient);
            iView = itemView.findViewById(R.id.foodPic);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}

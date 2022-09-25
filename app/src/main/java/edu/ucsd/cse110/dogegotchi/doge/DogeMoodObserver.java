package edu.ucsd.cse110.dogegotchi.doge;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import edu.ucsd.cse110.dogegotchi.MainActivity;
import edu.ucsd.cse110.dogegotchi.R;

public class DogeMoodObserver implements IDogeObserver{
    Context context;
    Doge doge;

    public DogeMoodObserver(Context context, Doge doge) {
        this.context = context;
        this.doge = doge;
    }

    @Override
    public void onStateChange(Doge.State newState) {
        View foodMenu = ((Activity) context).findViewById(R.id.FoodMenuView);
        if (newState == Doge.State.SAD) {
            foodMenu.setVisibility(View.VISIBLE);
        } else {
            foodMenu.setVisibility(View.GONE);
        }
    }

    public void foodClicked(String foodType) {
        doge.eat();
    }
}

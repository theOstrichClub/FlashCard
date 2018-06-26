package com.bizmedia.shokitakeda.flashcard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

/**
 * Created by Phlight on 07.06.2018.
 */
@Layout(com.bizmedia.shokitakeda.flashcard.R.layout.tinder_card_view)
public class TinderCard {

    @View(com.bizmedia.shokitakeda.flashcard.R.id.titleTxt)
    public TextView titleTxt;

    @View(com.bizmedia.shokitakeda.flashcard.R.id.readTxt)
    public TextView readTxt;

    @View(com.bizmedia.shokitakeda.flashcard.R.id.meanTxt)
    public TextView meanTxt;

    public Profile mProfile;
    public Context mContext;
    public SwipePlaceHolderView mSwipeView;

    public TinderCard(Context context, Profile profile, SwipePlaceHolderView swipeView) {
        mContext = context;
        mProfile = profile;
        mSwipeView = swipeView;
    }

    @SuppressLint("SetTextI18n")
    @Resolve
    public void onResolved(){
        titleTxt.setText(mProfile.getTitle());
        readTxt.setText(mProfile.getRead());
        meanTxt.setText(mProfile.getMean());
    }

    @SwipeOut
    public void onSwipedOut(){
        Log.d("EVENT", "onSwipedOut");
        mSwipeView.addView(this);
    }

    @SwipeCancelState
    public void onSwipeCancelState(){
        Log.d("EVENT", "onSwipeCancelState");
    }

    @SwipeIn
    public void onSwipeIn(){
        Log.d("EVENT", "onSwipedIn");
    }

    @SwipeInState
    public void onSwipeInState(){
        Log.d("EVENT", "onSwipeInState");
    }

    @SwipeOutState
    public void onSwipeOutState(){
        Log.d("EVENT", "onSwipeOutState");
    }
}

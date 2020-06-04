package com.example.shoppinglist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shoppinglist.Model.Data;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
=======

>>>>>>> parent of 96ac913... Insert data to firebase && design the item page
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fab_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        toolbar = findViewById(R.id.home_toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("MY SUPER SHOPPING LIST");

        fab_btn = findViewById(R.id.fab);

        fab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              customDialog();
            }
        });

    }

        private void customDialog(){

            AlertDialog.Builder mydialog = new AlertDialog.Builder(HomeActivity.this);
            LayoutInflater inflater = LayoutInflater.from(HomeActivity.this);

            View myview = inflater.inflate(R.layout.input_data, null);
            final AlertDialog dialog = mydialog.create();

            dialog.setView(myview);

            final EditText type = myview.findViewById(R.id.item_type);
            final EditText price = myview.findViewById(R.id.item_amount);
            final EditText note = myview.findViewById(R.id.item_note);
            Button buttonSave = myview.findViewById(R.id.button_save);

            buttonSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String myType = type.getText().toString().trim();
                    String myPrice = price.getText().toString().trim();
                    String myNote = note.getText().toString().trim();

                    if(TextUtils.isEmpty(myType)){
                        type.setError("Hey, cannot leave it blank");
                        return;
                    }
                    if(TextUtils.isEmpty(myPrice)){
                        price.setError("Hey, cannot leave it blank");
                        return;
                    }
                    if(TextUtils.isEmpty(myNote)){
                        note.setError("Hey, cannot leave it blank");
                        return;
                    }

                    dialog.dismiss();
                }
            });

            dialog.show();
        }

//        protected void onStart() {
//
//            super.onStart();
//            FirebaseRecyclerAdapter<Data, myViewHolder>adapter= new FirebaseRecyclerAdapter<Data, myViewHolder>
//                    (
//                            Data.class,
//                            R.layout.item,
//                            myViewHolder.class,
//                            mDatabase
//                    )
//            {
//                @Override
//                protected void populateViewHolder(myViewHolder viewHolder, Data model, int position) {
//
//                    viewHolder.setDate(model.getDate());
//                    viewHolder.setType(model.getType());
//                    viewHolder.setNote((model.getNote()));
//                    viewHolder.setPrice(model.getPrice());
//
//                }
//            };
//
//            recyclerView.setAdapter(adapter);
//
//        }


//            public  static  class myViewHolder extends RecyclerView.ViewHolder{
//
//                View myview;
//
//                public myViewHolder(View itemView){
//                    super(itemView);
//                    myview = itemView;
//
//                }
//
//                public void setType(String type){
//                    TextView mType = myview.findViewById(R.id.type);
//                    mType.setText(type);
//                }
//
//                public void setNote(String note){
//                    TextView mNote = myview.findViewById(R.id.note);
//                    mNote.setText(note);
//                }
//
//                public void setDate(String date){
//                    TextView mDate = myview.findViewById(R.id.date);
//                    mDate.setText(date);
//                }
//
//
//
//                public void setPrice(int price){
//                    TextView mPrice = myview.findViewById(R.id.price);
//                    String stAmount = String.valueOf(price);
//                    mPrice.setText(stAmount);
//                }
//
//
//
//            }


    }



package com.android.nextone.firebaseapp.nextone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebase = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference taxistaRefecencia = firebase.child("Taxistas").child("002");


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Taxista taxista = new Taxista();
        taxista.setNome("Rafael");
        taxista.setSobrenome("Rodrigues");
        taxista.setEmail("rafael.rodrugues@hotmail.com");
        taxista.setSenha("1234566");
        taxista.setCnh("345673");
        taxista.setPlacaCarro("NBH1268");
        taxista.setCod("11");

        taxistaRefecencia.child("002").setValue( taxista);

        taxistaRefecencia.addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("FIrebase", dataSnapshot.getValue().toString());
            }
            public void onCancelled(DatabaseError databaseError) {

            }

        });
    }


}

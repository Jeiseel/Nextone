package com.android.nextone.firebaseapp.nextone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        cadastrarTaxista();

    }

    public void cadastrarTaxista (){
        firebaseAuth1 = FirebaseAuth.getInstance();

        //Cadastro
        firebaseAuth1.createUserWithEmailAndPassword("rafael.rodrigues@hotmail.com","1234566" ).
                addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {// Cadastrado Com Sucesso!!
                            Log.i("createUser", "Sucesso ao Cadastrar Usuario");
                        } else { //Usuario Não Cadastrado!!
                            Log.i("createUser", "Erro ao Cadastrar Usuario");
                        }
                    }
                });
    }

}


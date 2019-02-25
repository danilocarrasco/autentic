package com.example.autentic.DAO;

import com.google.firebase.auth.FirebaseAuth;

public class configuracaoFirebase {


    private static  FirebaseAuth autenticacao;


    public static FirebaseAuth getFirebaseAuth(){

        if(autenticacao == null){

            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}

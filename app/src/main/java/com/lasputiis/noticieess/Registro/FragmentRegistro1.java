package com.lasputiis.noticieess.Registro;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.lasputiis.noticieess.R;
public class FragmentRegistro1 extends Fragment implements View.OnClickListener{
    private EditText nombreUsuario;
    private EditText email;
    private EditText contrasenia;
    private EditText repetirContrasenia;

    private Button siguiente;
    private Button cancelar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragment_registro1, container, false);
        nombreUsuario = v.findViewById(R.id.et_registro1_nombreUsuario);
        email = v.findViewById(R.id.et_registro1_email);
        contrasenia = v.findViewById(R.id.et_registro1_contrasenia);
        repetirContrasenia = v.findViewById(R.id.et_registro1_repetirContrasenia);

        siguiente = v.findViewById(R.id.btn_registro1_siguiente);
        siguiente.setOnClickListener(this);

        cancelar = v.findViewById(R.id.btn_registro1_cancelar);
        cancelar.setOnClickListener(this);

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {

    }
}

package com.mundotrujas.appfragmentos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContarCaracteres.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class ContarCaracteres extends Fragment {

    //private OnFragmentInteractionListener mListener;

    private Button btnBoton;
    private TextView lbltexto;
    private EditText txtEdit;

    public ContarCaracteres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_contar_caracteres, container, false);

        /*----------Poner  posicion al fragment layout (mi layout es un Relativelayout)------*/
        //Nuevos parametros para el view del fragmento
        RelativeLayout.LayoutParams parametro= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        //Nueva Regla: EL fragmento estara debajo del boton add_fragment
        parametro.addRule(RelativeLayout.BELOW, R.id.add_fragmento);
        //Margenes: top:41dp
        parametro.setMargins(0,41,0,0);
        //Setear los parametros al view
        view.setLayoutParams(parametro);
        /*-----------------------------------------------------------------------------------*/

        btnBoton=(Button) view.findViewById(R.id.main_button);
        lbltexto=(TextView) view.findViewById(R.id.main_textview);
        txtEdit=(EditText) view.findViewById(R.id.main_editText);

        btnBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbltexto.setText(String.valueOf(txtEdit.getText().length()));
            }
        });

        return view;
    }



}

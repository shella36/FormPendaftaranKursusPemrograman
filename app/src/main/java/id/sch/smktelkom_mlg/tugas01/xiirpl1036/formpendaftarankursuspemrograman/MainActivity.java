package id.sch.smktelkom_mlg.tugas01.xiirpl1036.formpendaftarankursuspemrograman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnama, etemail, etalamat;
    Button bdaftar;
    TextView tvhasil;
    RadioButton rblaki, rbperempuan;
    CheckBox cbweb, cbvb, cband, cbc;
    Spinner spjenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.editTextNama);
        etemail = (EditText) findViewById(R.id.editTextEmail);
        etalamat = (EditText) findViewById(R.id.editTextAlamat);
        bdaftar = (Button) findViewById(R.id.buttonDaftar);
        tvhasil = (TextView) findViewById(R.id.textViewHasil);
        rblaki = (RadioButton) findViewById(R.id.radioButtonLaki);
        rbperempuan = (RadioButton) findViewById(R.id.radioButtonPerempuan);
        cbweb = (CheckBox) findViewById(R.id.checkBoxWeb);
        cbvb = (CheckBox) findViewById(R.id.checkBoxVisual);
        cband = (CheckBox) findViewById(R.id.checkBoxAndroid);
        cbc = (CheckBox) findViewById(R.id.checkBoxC);
        spjenis = (Spinner) findViewById(R.id.spinnerJenis);

        bdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etnama.getText().toString();

        String jk = null;
        if (rblaki.isChecked()) {
            jk = rblaki.getText().toString();
        } else if (rbperempuan.isChecked()) {
            jk = rbperempuan.getText().toString();
        }

        String email = etemail.getText().toString();

        String alamat = etalamat.getText().toString();

        String materi = "";
        if (cbweb.isChecked()) materi += cbweb.getText() + " , ";
        if (cbvb.isChecked()) materi += cbvb.getText() + " , ";
        if (cband.isChecked()) materi += cband.getText() + " , ";
        if (cbc.isChecked()) materi += cbc.getText();

        String jenis = spjenis.getSelectedItem().toString();

        tvhasil.setText("Nama\t\t\t\t\t\t: " + nama + "\n" +
                "Jenis Kelamin\t\t\t: " + jk + "\n" +
                "Email\t\t\t\t\t\t: " + email + "\n" +
                "Alamat\t\t\t\t\t\t: " + alamat + "\n" +
                "Materi Kursus\t\t\t: " + materi + "\n" +
                "Jenis Kursus\t\t\t: " + jenis);
    }

}

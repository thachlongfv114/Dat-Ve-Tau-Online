package com.nguyenhuuthach.datvetauonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Switch;
import android.widget.Spinner;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.content.Intent;

import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    TextView txtwten;
    EditText gettxtten;
    EditText gettxtsdt;
    CheckBox getdichvu;
    RadioButton getVIP;
    RadioButton getthuong;
    RadioButton getgiuong;
    RadioButton getghe;
    Spinner getdonvi;

    Button btnHuy;
    Button getbtnThanhToan;
    Button getBtnHuy;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText gettxtten = (EditText) findViewById(R.id.txtten);
        final EditText gettxtsdt = (EditText) findViewById(R.id.txtsdt);
        final CheckBox getdichvu = (CheckBox) findViewById(R.id.ckbdichvu);
        final RadioButton getVIP = (RadioButton) findViewById(R.id.rbtnvip);
        final RadioButton getthuong = (RadioButton) findViewById(R.id.rbtnthuong);
        final RadioButton getghe = (RadioButton) findViewById(R.id.rdtnghe);
        final RadioButton getgiuong = (RadioButton) findViewById(R.id.rdtngiuong);
        final Spinner getdonvi = (Spinner) findViewById(R.id.spndonvi);


        getBtnHuy = (Button) findViewById(R.id.btnhuy);
        getbtnThanhToan = (Button) findViewById(R.id.btnthanhtoan);

        getbtnThanhToan.setOnClickListener(new View.OnClickListener() {
                                               public void onClick(View v) {


                                                   String msg = "Tên: " + gettxtten.getText().toString() +
                                                           System.getProperty("line.separator") +
                                                           "SĐT: " + gettxtsdt.getText().toString()
                                                           + System.getProperty("line.separator") +
                                                           "Thành viên: ";




                                                   gettxtten.setText("");
                                                   gettxtsdt.setText("");

                                                   if (getVIP.isChecked())
                                                       msg += getVIP.getText().toString() + System.getProperty("line.separator") + "Loại vé: ";
                                                   if (getthuong.isChecked())
                                                       msg += getthuong.getText().toString() + System.getProperty("line.separator") + "Loại vé: ";

                                                  if (getgiuong.isChecked())
                                                       msg += getgiuong.getText().toString() + System.getProperty("line.separator") + "Dịch vụ: ";
                                                   if (getghe.isChecked())
                                                       msg += getghe.getText().toString() + System.getProperty("line.separator") + "Dịch vụ: ";


                                                   if (getdichvu.isChecked())
                                                       msg += "Có";
                                                   else
                                                       msg += "Không";

                                                   getVIP.setChecked(false);
                                                   getthuong.setChecked(false);
                                                   getgiuong.setChecked(false);
                                                   getghe.setChecked(false);

                                                   msg += System.getProperty("line.separator") + "Thanh toán: " +
                                                           getdonvi.getSelectedItem().toString();

                                                   info(v, msg);

                                               }
                                           }
        );
        getBtnHuy.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View v) {
                                             cancel(v);
                                         }
                                     }
        );
    }

    public void cancel(View v) {
        System.exit(0);
    }

    public void info(View v, String msg) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("ĐẶT VÉ ONLINE");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}

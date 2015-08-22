package com.example.owner.marjan2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity2Activity extends Activity {

    TextView textView[]=new TextView[38];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        textView[0]=(TextView)findViewById(R.id.textView13);
        textView[1]=(TextView)findViewById(R.id.textView15);
        textView[2]=(TextView)findViewById(R.id.textView17);
        textView[3]=(TextView)findViewById(R.id.textView19);
        textView[4]=(TextView)findViewById(R.id.textView21);
        textView[5]=(TextView)findViewById(R.id.textView23);
        textView[6]=(TextView)findViewById(R.id.textView26);
        textView[7]=(TextView)findViewById(R.id.textView30);
        textView[8]=(TextView)findViewById(R.id.textView32);
        textView[9]=(TextView)findViewById(R.id.textView34);
        textView[10]=(TextView)findViewById(R.id.textView36);
        textView[11]=(TextView)findViewById(R.id.textView38);
        textView[12]=(TextView)findViewById(R.id.textView40);
        textView[13]=(TextView)findViewById(R.id.textView42);
        textView[14]=(TextView)findViewById(R.id.textView45);
        textView[15]=(TextView)findViewById(R.id.textView47);
        textView[16]=(TextView)findViewById(R.id.textView49);
        textView[17]=(TextView)findViewById(R.id.textView51);
        textView[18]=(TextView)findViewById(R.id.textView53);
        textView[19]=(TextView)findViewById(R.id.textView55);
        textView[20]=(TextView)findViewById(R.id.textView57);
        textView[21]=(TextView)findViewById(R.id.textView59);
        textView[22]=(TextView)findViewById(R.id.textView61);
        textView[23]=(TextView)findViewById(R.id.textView63);
        textView[24]=(TextView)findViewById(R.id.textView66);
        textView[25]=(TextView)findViewById(R.id.textView68);
        textView[26]=(TextView)findViewById(R.id.textView70);
        textView[27]=(TextView)findViewById(R.id.textView75);
        textView[28]=(TextView)findViewById(R.id.textView79);
        textView[29]=(TextView)findViewById(R.id.textView81);
        textView[30]=(TextView)findViewById(R.id.textView83);
        textView[31]=(TextView)findViewById(R.id.textView85);
        textView[32]=(TextView)findViewById(R.id.textView87);
        textView[33]=(TextView)findViewById(R.id.textView89);
        textView[34]=(TextView)findViewById(R.id.textView91);
        textView[35]=(TextView)findViewById(R.id.textView93);
        textView[36]=(TextView)findViewById(R.id.textView95);
        textView[37]=(TextView)findViewById(R.id.textView97);

        set_seiseki();
    }

    public void set_seiseki(){

        DecimalFormat df1 = new DecimalFormat("0.00");
        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        int kyokusu = pref.getInt("kyokusuu", 0);
        textView[0].setText(String.valueOf(kyokusu) + "局目");

        int agari=pref.getInt("agari", 0);
        if(kyokusu!=0) {
            textView[3].setText(String.valueOf(df1.format((float) agari * 100 / kyokusu)) + "%");
        }else{
            textView[3].setText(String.valueOf(0) + "%");
        }

        int tensu = pref.getInt("tensu", 0);
        if(agari!=0) {
            textView[1].setText(String.valueOf(tensu / agari) + "点");
        }else{
            textView[1].setText(String.valueOf(0) + "点");
        }

        int agari_zyunme=pref.getInt("agari_zyunme", 0);
        if(agari!=0) {
            textView[2].setText(String.valueOf(df1.format((float) agari_zyunme / agari)) + "順目");
        }else{
            textView[2].setText(String.valueOf(0) + "順目");
        }

        int tempai_suu=pref.getInt("tempai_suu", 0);
        if(kyokusu!=0) {
            textView[4].setText(String.valueOf(df1.format((float) tempai_suu * 100 / kyokusu)) + "%");
        }else{
            textView[4].setText(String.valueOf(0) + "%");
        }

        int tempai_zunme_set=pref.getInt("tempai_zunme", 0);
        if(tempai_suu!=0) {
            textView[5].setText(String.valueOf(df1.format((float) tempai_zunme_set / tempai_suu)) + "順目");
        }else{
            textView[5].setText(String.valueOf(0) + "順目");
        }

        int riti=pref.getInt("riti", 0);
        if(agari!=0) {
            textView[6].setText(String.valueOf(riti) + "回 (" + String.valueOf(df1.format((float) riti * 100 / agari)) + "%)");
        }else{
            textView[6].setText(String.valueOf(riti) + "回 (" + String.valueOf(0)+"%)");
        }

        int dora=pref.getInt("dora", 0);
        if(agari!=0) {
            textView[8].setText(String.valueOf(dora) + "回 (" + String.valueOf(df1.format((float) dora * 100 / agari)) + "%)");
        }else{
            textView[8].setText(String.valueOf(riti) + "回 (" + String.valueOf(0) + "%)");
        }

        int dora_suu=pref.getInt("dora_suu", 0);
        if(dora!=0) {
            textView[7].setText(String.valueOf(df1.format((float) dora_suu / dora)));
        }else{
            textView[7].setText(String.valueOf(0));
        }

        int pinhu=pref.getInt("pinhu", 0);
        if(agari!=0) {
            textView[9].setText(String.valueOf(pinhu) + "回 (" + String.valueOf(df1.format((float) pinhu * 100 / agari)) + "%)");
        }else{
            textView[9].setText(String.valueOf(pinhu) + "回 (" + String.valueOf(0)+ "%)");
        }


        int ippatu=pref.getInt("ippatu", 0);
        if(agari!=0) {
            textView[10].setText(String.valueOf(ippatu) + "回 (" + String.valueOf(df1.format((float) ippatu * 100 / agari)) + "%)");
        }else{
            textView[10].setText(String.valueOf(ippatu) + "回 (" + String.valueOf(0) + "%)");
        }

        int tanyao=pref.getInt("tanyao", 0);
        if(agari!=0) {
            textView[11].setText(String.valueOf(tanyao) + "回 (" + String.valueOf(df1.format((float) tanyao * 100 / agari)) + "%)");
        }else{
            textView[11].setText(String.valueOf(tanyao) + "回 (" + String.valueOf(0) + "%)");
        }

        int ipeiko=pref.getInt("ipeiko", 0);
        if(agari!=0) {
            textView[12].setText(String.valueOf(ipeiko) + "回 (" + String.valueOf(df1.format((float) ipeiko * 100 / agari)) + "%)");
        }else{
            textView[12].setText(String.valueOf(ipeiko) + "回 (" + String.valueOf(0) + "%)");
        }
        int haitei=pref.getInt("haitei", 0);
        if(agari!=0) {
            textView[13].setText(String.valueOf(haitei) + "回 (" + String.valueOf(df1.format((float) haitei * 100 / agari)) + "%)");
        }else{
            textView[13].setText(String.valueOf(haitei) + "回 (" + String.valueOf(0) + "%)");
        }
        int double_riti=pref.getInt("double_riti", 0);
        if(agari!=0) {
            textView[14].setText(String.valueOf(double_riti) + "回 (" + String.valueOf(df1.format((float) double_riti * 100 / agari)) + "%)");
        }else{
            textView[14].setText(String.valueOf(double_riti) + "回 (" + String.valueOf(0) + "%)");
        }

        int titoitu=pref.getInt("titoitu", 0);
        if(agari!=0) {
            textView[15].setText(String.valueOf(titoitu) + "回 (" + String.valueOf(df1.format((float) titoitu * 100 / agari)) + "%)");
        }else{
            textView[15].setText(String.valueOf(titoitu) + "回 (" + String.valueOf(0) + "%)");
        }

        int toitoi=pref.getInt("toitoi", 0);
        if(agari!=0) {
            textView[16].setText(String.valueOf(toitoi) + "回 (" + String.valueOf(df1.format((float) toitoi * 100 / agari)) + "%)");
        }else{
            textView[16].setText(String.valueOf(toitoi) + "回 (" + String.valueOf(0) + "%)");
        }

        int sansyoku_douzyun=pref.getInt("sansyoku_douzyun", 0);
        if(agari!=0) {
            textView[17].setText(String.valueOf(sansyoku_douzyun) + "回 (" + String.valueOf(df1.format((float) sansyoku_douzyun * 100 / agari)) + "%)");
        }else{
            textView[17].setText(String.valueOf(sansyoku_douzyun) + "回 (" + String.valueOf(0) + "%)");
        }

        int ikkituukan=pref.getInt("ikkituukan", 0);
        if(agari!=0) {
            textView[18].setText(String.valueOf(ikkituukan) + "回 (" + String.valueOf(df1.format((float) ikkituukan * 100 / agari)) + "%)");
        }else{
            textView[18].setText(String.valueOf(ikkituukan) + "回 (" + String.valueOf(0) + "%)");
        }

        int hontyan=pref.getInt("hontyan", 0);
        if(agari!=0) {
            textView[19].setText(String.valueOf(hontyan) + "回 (" + String.valueOf(df1.format((float) hontyan * 100 / agari)) + "%)");
        }else{
            textView[19].setText(String.valueOf(hontyan) + "回 (" + String.valueOf(0) + "%)");
        }

        int sanankou=pref.getInt("sanankou", 0);
        if(agari!=0) {
            textView[20].setText(String.valueOf(sanankou) + "回 (" + String.valueOf(df1.format((float) sanankou * 100 / agari)) + "%)");
        }else{
            textView[20].setText(String.valueOf(sanankou) + "回 (" + String.valueOf(0) + "%)");
        }

        int syousangen=pref.getInt("syousangen", 0);
        if(agari!=0) {
            textView[21].setText(String.valueOf(syousangen) + "回 (" + String.valueOf(df1.format((float) syousangen * 100 / agari)) + "%)");
        }else{
            textView[21].setText(String.valueOf(syousangen) + "回 (" + String.valueOf(0) + "%)");
        }

        int honrouto=pref.getInt("honrouto", 0);
        if(agari!=0) {
            textView[22].setText(String.valueOf(honrouto) + "回 (" + String.valueOf(df1.format((float) honrouto * 100 / agari)) + "%)");
        }else{
            textView[22].setText(String.valueOf(honrouto) + "回 (" + String.valueOf(0) + "%)");
        }

        int sansyoku_doukou=pref.getInt("sansyoku_doukou", 0);
        if(agari!=0) {
            textView[23].setText(String.valueOf(sansyoku_doukou) + "回 (" + String.valueOf(df1.format((float) sansyoku_doukou * 100 / agari)) + "%)");
        }else{
            textView[23].setText(String.valueOf(sansyoku_doukou) + "回 (" + String.valueOf(0) + "%)");
        }

        int honitu=pref.getInt("honitu", 0);
        if(agari!=0) {
            textView[24].setText(String.valueOf(honitu) + "回 (" + String.valueOf(df1.format((float) honitu * 100 / agari)) + "%)");
        }else{
            textView[24].setText(String.valueOf(honitu) + "回 (" + String.valueOf(0) + "%)");
        }


        int ryanpeioko=pref.getInt("ryanpeiko", 0);
        if(agari!=0) {
            textView[25].setText(String.valueOf(ryanpeioko) + "回 (" + String.valueOf(df1.format((float) ryanpeioko * 100 / agari)) + "%)");
        }else{
            textView[25].setText(String.valueOf(ryanpeioko) + "回 (" + String.valueOf(0) + "%)");
        }

        int zyuntyan=pref.getInt("zyuntyan", 0);
        if(agari!=0) {
            textView[26].setText(String.valueOf(zyuntyan) + "回 (" + String.valueOf(df1.format((float) zyuntyan * 100 / agari)) + "%)");
        }else{
            textView[26].setText(String.valueOf(zyuntyan) + "回 (" + String.valueOf(0) + "%)");
        }

        int tinitu=pref.getInt("tinitu", 0);
        if(agari!=0) {
            textView[27].setText(String.valueOf(tinitu) + "回 (" + String.valueOf(df1.format((float) tinitu * 100 / agari)) + "%)");
        }else{
            textView[27].setText(String.valueOf(tinitu) + "回 (" + String.valueOf(0) + "%)");
        }

        int kokusimusou=pref.getInt("kokusimusou", 0);
        if(agari!=0) {
            textView[28].setText(String.valueOf(kokusimusou) + "回 (" + String.valueOf(df1.format((float) kokusimusou * 100 / agari)) + "%)");
        }else{
            textView[28].setText(String.valueOf(kokusimusou) + "回 (" + String.valueOf(0) + "%)");
        }

        int suankou=pref.getInt("suankou", 0);
        if(agari!=0) {
            textView[29].setText(String.valueOf(suankou) + "回 (" + String.valueOf(df1.format((float) suankou * 100 / agari)) + "%)");
        }else{
            textView[29].setText(String.valueOf(suankou) + "回 (" + String.valueOf(0) + "%)");
        }

        int daisangen=pref.getInt("daisangen", 0);
        if(agari!=0) {
            textView[30].setText(String.valueOf(daisangen) + "回 (" + String.valueOf(df1.format((float) daisangen * 100 / agari)) + "%)");
        }else{
            textView[30].setText(String.valueOf(daisangen) + "回 (" + String.valueOf(0) + "%)");
        }

        int zuiso=pref.getInt("zuiso", 0);
        if(agari!=0) {
            textView[31].setText(String.valueOf(zuiso) + "回 (" + String.valueOf(df1.format((float) zuiso * 100 / agari)) + "%)");
        }else{
            textView[31].setText(String.valueOf(zuiso) + "回 (" + String.valueOf(0) + "%)");
        }

        int daisuti=pref.getInt("daisuti", 0);
        if(agari!=0) {
            textView[32].setText(String.valueOf(daisuti) + "回 (" + String.valueOf(df1.format((float) daisuti * 100 / agari)) + "%)");
        }else{
            textView[32].setText(String.valueOf(daisuti) + "回 (" + String.valueOf(0) + "%)");
        }

        int syousuti=pref.getInt("syousuti", 0);
        if(agari!=0) {
            textView[33].setText(String.valueOf(syousuti) + "回 (" + String.valueOf(df1.format((float) syousuti * 100 / agari)) + "%)");
        }else{
            textView[33].setText(String.valueOf(syousuti) + "回 (" + String.valueOf(0) + "%)");
        }

        int tinroutou=pref.getInt("tinroutou", 0);
        if(agari!=0) {
            textView[34].setText(String.valueOf(tinroutou) + "回 (" + String.valueOf(df1.format((float) tinroutou * 100 / agari)) + "%)");
        }else{
            textView[34].setText(String.valueOf(tinroutou) + "回 (" + String.valueOf(0) + "%)");
        }

        int ryuiso=pref.getInt("ryuiso", 0);
        if(agari!=0) {
            textView[35].setText(String.valueOf(ryuiso) + "回 (" + String.valueOf(df1.format((float) ryuiso * 100 / agari)) + "%)");
        }else{
            textView[35].setText(String.valueOf(ryuiso) + "回 (" + String.valueOf(0) + "%)");
        }

        int tyurenpoto=pref.getInt("tyurenpoto", 0);
        if(agari!=0) {
            textView[36].setText(String.valueOf(tyurenpoto) + "回 (" + String.valueOf(df1.format((float) tyurenpoto * 100 / agari)) + "%)");
        }else{
            textView[36].setText(String.valueOf(tyurenpoto) + "回 (" + String.valueOf(0) + "%)");
        }

        int tenho=pref.getInt("tenho", 0);
        if(agari!=0) {
            textView[37].setText(String.valueOf(tenho) + "回 (" + String.valueOf(df1.format((float) tenho * 100 / agari)) + "%)");
        }else{
            textView[37].setText(String.valueOf(tenho) + "回 (" + String.valueOf(0) + "%)");
        }
























    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

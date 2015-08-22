package com.example.owner.marjan2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.text.DecimalFormat;
import java.util.Arrays;


public class MainActivity extends Activity {

    ImageButton imageButton[] = new ImageButton[14];
    ImageView imageView[] = new ImageView[18];
    Button button;
    Button button2;
    int imageView_index = 0;
    ImageView imageView18;
    int hai[] = new int[14];
    int hai1[] = new int[34];
    String yaku[] = new String[14];
    Majan obj;
    int tensu_set;
    int dora;
    int s;
    int riti;

    int agari_hai;

    int tenpai_zunme;

    TextView text11;
    TextView text10;
    TextView text9;
    TextView text8;
    TextView text7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton[0] = (ImageButton) findViewById(R.id.imageButton);
        imageButton[1] = (ImageButton) findViewById(R.id.imageButton1);
        imageButton[2] = (ImageButton) findViewById(R.id.imageButton2);
        imageButton[3] = (ImageButton) findViewById(R.id.imageButton3);
        imageButton[4] = (ImageButton) findViewById(R.id.imageButton4);
        imageButton[5] = (ImageButton) findViewById(R.id.imageButton5);
        imageButton[6] = (ImageButton) findViewById(R.id.imageButton6);
        imageButton[7] = (ImageButton) findViewById(R.id.imageButton7);
        imageButton[8] = (ImageButton) findViewById(R.id.imageButton8);
        imageButton[9] = (ImageButton) findViewById(R.id.imageButton9);
        imageButton[10] = (ImageButton) findViewById(R.id.imageButton10);
        imageButton[11] = (ImageButton) findViewById(R.id.imageButton11);
        imageButton[12] = (ImageButton) findViewById(R.id.imageButton12);
        imageButton[13] = (ImageButton) findViewById(R.id.imageButton13);

        imageView[0] = (ImageView) findViewById(R.id.imageView);
        imageView[1] = (ImageView) findViewById(R.id.imageView1);
        imageView[2] = (ImageView) findViewById(R.id.imageView2);
        imageView[3] = (ImageView) findViewById(R.id.imageView3);
        imageView[4] = (ImageView) findViewById(R.id.imageView4);
        imageView[5] = (ImageView) findViewById(R.id.imageView5);
        imageView[6] = (ImageView) findViewById(R.id.imageView6);
        imageView[7] = (ImageView) findViewById(R.id.imageView7);
        imageView[8] = (ImageView) findViewById(R.id.imageView8);
        imageView[9] = (ImageView) findViewById(R.id.imageView9);
        imageView[10] = (ImageView) findViewById(R.id.imageView10);
        imageView[11] = (ImageView) findViewById(R.id.imageView11);
        imageView[12] = (ImageView) findViewById(R.id.imageView12);
        imageView[13] = (ImageView) findViewById(R.id.imageView13);
        imageView[14] = (ImageView) findViewById(R.id.imageView14);
        imageView[15] = (ImageView) findViewById(R.id.imageView15);
        imageView[16] = (ImageView) findViewById(R.id.imageView16);
        imageView[17] = (ImageView) findViewById(R.id.imageView17);

        text11 = (TextView) findViewById(R.id.textView11);
        text10 = (TextView) findViewById(R.id.textView10);
        text9 = (TextView) findViewById(R.id.textView9);
        text8 = (TextView) findViewById(R.id.textView8);
        text7 = (TextView) findViewById(R.id.textView7);

        imageView18 = (ImageView) findViewById(R.id.imageView18);


        button = (Button) findViewById(R.id.button);

        button2 = (Button) findViewById(R.id.button2);




        SetDora();
        Sethai();

        setSeiseki();


        obj = new Majan(hai, dora);

        tenpai_zunme=-1;
        set_tenpai_zunme();

        if (obj.kokusi_count() == 0) {
            tensu_kokusi();
        }
        text9.setText("国士　" + String.valueOf(obj.kokusi_count()));

        if (obj.ippan_count() == 0) {
            tensu_ippan();


        }
        text7.setText("一般　" + String.valueOf(obj.ippan_count()));

        if (obj.toitu_count() == 0) {
            tensu_toitu();

        }
        text8.setText("対子　" + String.valueOf(obj.toitu_count()));
        /////////////////////////////////////////////////////////////////////////
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent = new Intent(MainActivity.this, MainActivity2Activity.class);
                startActivity(objIntent);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("初期化しますか?")
                        .setNegativeButton(
                                "Yes",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Seiseki_syokika();
                                        Toast.makeText(getApplication(), "初期化しました", Toast.LENGTH_SHORT).show();
                                    }
                                }
                        )
                        .setPositiveButton(
                                "No",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }

                        )
                        .setOnCancelListener(

                                new DialogInterface.OnCancelListener() {
                                    @Override
                                    public void onCancel(DialogInterface dialog) {

                                    }
                                }
                        )
                        .show();

            }
        });
        ///////////////////////////////////////////////////////////////////////
        imageButton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[0]);
                hai[0] = Getransu();
                obj.Set_hai(0, hai[0]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();


                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[0].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[0] || x[1] == hai[0]) {
                        riti(hai[0]);
                    }
                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[0] || x[1] == hai[0]) {
                        riti(hai[0]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[0] || x[1] == hai[0] || x[2] == hai[0] || x[3] == hai[0] || x[4] == hai[0] || x[5] == hai[0]) {
                        riti(hai[0]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[1]);
                hai[1] = Getransu();
                obj.Set_hai(1, hai[1]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();


                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[1].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[1] || x[1] == hai[1]) {

                        riti(hai[1]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[1] || x[1] == hai[1]) {
                        riti(hai[1]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[1] || x[1] == hai[1] || x[2] == hai[1] || x[3] == hai[1] || x[4] == hai[1] || x[5] == hai[1]) {
                        riti(hai[1]);
                    }
                }


                return true;
            }
        });
/////////////////////////////////////////////////////////////////////////////////////
        imageButton[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[2]);
                hai[2] = Getransu();
                obj.Set_hai(2, hai[2]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[2].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[2] || x[1] == hai[2]) {

                        riti(hai[2]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[2] || x[1] == hai[2]) {
                        riti(hai[2]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[2] || x[1] == hai[2] || x[2] == hai[2] || x[3] == hai[2] || x[4] == hai[2] || x[5] == hai[2]) {
                        riti(hai[2]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        imageButton[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[3]);
                hai[3] = Getransu();
                obj.Set_hai(3, hai[3]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[3].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[3] || x[1] == hai[3]) {

                        riti(hai[3]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[3] || x[1] == hai[3]) {
                        riti(hai[3]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[3] || x[1] == hai[3] || x[2] == hai[3] || x[3] == hai[3] || x[4] == hai[3] || x[5] == hai[3]) {
                        riti(hai[3]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        imageButton[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[4]);
                hai[4] = Getransu();
                obj.Set_hai(4, hai[4]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[4].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[4] || x[1] == hai[4]) {

                        riti(hai[4]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[4] || x[1] == hai[4]) {
                        riti(hai[4]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[4] || x[1] == hai[4] || x[2] == hai[4] || x[3] == hai[4] || x[4] == hai[4] || x[5] == hai[4]) {
                        riti(hai[4]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[5]);
                hai[5] = Getransu();
                obj.Set_hai(5, hai[5]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[5].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[5] || x[1] == hai[5]) {

                        riti(hai[5]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[5] || x[1] == hai[5]) {
                        riti(hai[5]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[5] || x[1] == hai[5] || x[2] == hai[5] || x[3] == hai[5] || x[4] == hai[5] || x[5] == hai[5]) {
                        riti(hai[5]);
                    }
                }


                return true;
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[6]);
                hai[6] = Getransu();
                obj.Set_hai(6, hai[6]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[6].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[6] || x[1] == hai[6]) {

                        riti(hai[6]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[6] || x[1] == hai[6]) {
                        riti(hai[6]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[6] || x[1] == hai[6] || x[2] == hai[6] || x[3] == hai[6] || x[4] == hai[6] || x[5] == hai[6]) {
                        riti(hai[6]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[7]);
                hai[7] = Getransu();
                obj.Set_hai(7, hai[7]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[7].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[7] || x[1] == hai[7]) {

                        riti(hai[7]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[7] || x[1] == hai[7]) {
                        riti(hai[7]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[7] || x[1] == hai[7] || x[2] == hai[7] || x[3] == hai[7] || x[4] == hai[7] || x[5] == hai[7]) {
                        riti(hai[7]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[8]);
                hai[8] = Getransu();
                obj.Set_hai(8, hai[8]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[8].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[8] || x[1] == hai[8]) {

                        riti(hai[8]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[8] || x[1] == hai[8]) {
                        riti(hai[8]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[8] || x[1] == hai[8] || x[2] == hai[8] || x[3] == hai[8] || x[4] == hai[8] || x[5] == hai[8]) {
                        riti(hai[8]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[9]);
                hai[9] = Getransu();
                obj.Set_hai(9, hai[9]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[9].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[9] || x[1] == hai[9]) {

                        riti(hai[9]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[9] || x[1] == hai[9]) {
                        riti(hai[9]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[9] || x[1] == hai[9] || x[2] == hai[9] || x[3] == hai[9] || x[4] == hai[9] || x[5] == hai[9]) {
                        riti(hai[9]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[10]);
                hai[10] = Getransu();
                obj.Set_hai(10, hai[10]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[10].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[10] || x[1] == hai[10]) {

                        riti(hai[10]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[10] || x[1] == hai[10]) {
                        riti(hai[10]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[10] || x[1] == hai[10] || x[2] == hai[10] || x[3] == hai[10] || x[4] == hai[10] || x[5] == hai[10]) {
                        riti(hai[10]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[11]);
                hai[11] = Getransu();
                obj.Set_hai(11, hai[11]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[11].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[11] || x[1] == hai[11]) {

                        riti(hai[11]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[11] || x[1] == hai[11]) {
                        riti(hai[11]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[11] || x[1] == hai[11] || x[2] == hai[11] || x[3] == hai[11] || x[4] == hai[11] || x[5] == hai[11]) {
                        riti(hai[11]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[12]);
                hai[12] = Getransu();
                obj.Set_hai(12, hai[12]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[12].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[12] || x[1] == hai[12]) {

                        riti(hai[12]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[12] || x[1] == hai[12]) {
                        riti(hai[12]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[12] || x[1] == hai[12] || x[2] == hai[12] || x[3] == hai[12] || x[4] == hai[12] || x[5] == hai[12]) {
                        riti(hai[12]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        imageButton[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setsutehai(hai[13]);
                hai[13] = Getransu();
                obj.Set_hai(13, hai[13]);
                if (obj.kokusi_count() == 0) {
                    tensu_kokusi();
                }
                if (obj.ippan_count() == 0) {
                    tensu_ippan();
                }
                if (obj.toitu_count() == 0) {
                    tensu_toitu();

                }
                text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
                text8.setText("対子　" + String.valueOf(obj.toitu_count()));
                text7.setText("一般　" + String.valueOf(obj.ippan_count()));
                SetimageButton();

            }
        });

        imageButton[13].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (obj.kokusi_count() == 1) {
                    int x[] = obj.kokusi_riti();
                    if (x[0] == hai[13] || x[1] == hai[13]) {

                        riti(hai[13]);
                    }

                }

                if (obj.toitu_count() == 1) {
                    int x[] = obj.riti_titoitu();
                    if (x[0] == hai[13] || x[1] == hai[13]) {
                        riti(hai[13]);
                    }
                }

                if (obj.ippan_count() == 1) {
                    int x[] = obj.ippan_riti();
                    if (x[0] == hai[13] || x[1] == hai[13] || x[2] == hai[13] || x[3] == hai[13] || x[4] == hai[13] || x[5] == hai[13]) {
                        riti(hai[13]);
                    }
                }


                return true;
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public void riti(int hai_youso) {

        s = hai_youso;
        riti = imageView_index;
        while (s != -1) {
            for (int i = 0; i < hai.length; i++) {
                if (s == hai[i]) {
                    Setsutehai(hai[i]);

                    if (s != -1) {
                        hai[i] = Getransu();
                        s = hai[i];
                        obj.Set_hai(i, hai[i]);
                        if (imageView_index == 18) {
                            s = -1;
                        }
                    }
                    break;
                }
            }

            if (obj.kokusi_count() == 0) {
                s = -1;
                tensu_kokusi();


            }
            if (obj.ippan_count() == 0) {
                s = -1;
                tensu_ippan();

            }
            if (obj.toitu_count() == 0) {
                s = -1;
                tensu_toitu();

            }
            SetimageButton();

        }

        s = 0;


    }

    public void tensu_kokusi() {

        yaku[0] = "国士無双";
        String s = "国士無双　　役満　\n\n役満　　　　48000点";
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("和了")
                .setMessage(s)
                .setNegativeButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                saveSeisei(48000);
                                Clear();


                            }
                        }
                )
                .setOnCancelListener(

                        new DialogInterface.OnCancelListener() {
                            @Override
                            public void onCancel(DialogInterface dialog) {
                                saveSeisei(48000);
                                Clear();

                            }
                        }
                )
                .show();

    }

    public void tensu_ippan() {
        obj.ippan_tensu(agari_hai);

        if (riti != -1) {
            if (riti == 0) {
                obj.setD_riti();
            } else {
                obj.set_riti();
            }

            if (imageView_index - riti == 1) {
                obj.setIppatu();
            }

        }
        if (imageView_index == 0) {
            obj.setTenhou();
        }
        if (imageView_index == 18) {
            obj.setHaitei_tumo();
        }
        yaku = obj.Get_yaku();
        String s[] = new String[16];
        s[0] = "";
        int j = 0;
        for (int i = 0; i < yaku.length; i++) {

            if ("".equals(yaku[i])) {
                j = i;
                break;
            }
            s[i + 1] = s[i] + yaku[i] + "\n";

        }

        String tensu[] = new String[2];
        tensu = obj.Get_tensu();
        String tmp = tensu[1];
        tmp = tmp.replaceAll("点", "");
        tensu_set = Integer.parseInt(tmp);


        new AlertDialog.Builder(MainActivity.this)
                .setTitle("和了")
                .setMessage(s[j] + "\n" + tensu[0] + "　　　　" + tensu[1])
                .setNegativeButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                saveSeisei(tensu_set);
                                Clear();


                            }
                        }
                )
                .setOnCancelListener(

                        new DialogInterface.OnCancelListener() {
                            @Override
                            public void onCancel(DialogInterface dialog) {
                                saveSeisei(tensu_set);
                                Clear();

                            }
                        }
                )
                .show();

    }

    public void tensu_toitu() {

        obj.toitu_tensu();

        if (riti != -1) {
            if (riti == 0) {
                obj.setD_riti();
            } else {
                obj.set_riti();
            }

            if (imageView_index - riti == 1) {
                obj.setIppatu();
            }

        }
        if (imageView_index == 0) {
            obj.setTenhou();
        }
        if (imageView_index == 18) {
            obj.setHaitei_tumo();
        }
        yaku = obj.Get_yaku();
        String s[] = new String[16];
        s[0] = "";
        int j = 0;
        for (int i = 0; i < yaku.length; i++) {

            if ("".equals(yaku[i])) {
                j = i;
                break;
            }
            s[i + 1] = s[i] + yaku[i] + "\n";


        }

        String tensu[] = new String[2];
        tensu = obj.Get_tensu();

        String tmp = tensu[1];
        tmp = tmp.replaceAll("点", "");
        tensu_set = Integer.parseInt(tmp);


        new AlertDialog.Builder(MainActivity.this)
                .setTitle("和了")
                .setMessage(s[j] + "\n" + tensu[0] + "　　　　" + tensu[1])
                .setNegativeButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                saveSeisei(tensu_set);
                                Clear();


                            }
                        }
                )
                .setOnCancelListener(

                        new DialogInterface.OnCancelListener() {
                            @Override
                            public void onCancel(DialogInterface dialog) {
                                saveSeisei(tensu_set);
                                Clear();

                            }
                        }
                )
                .show();

    }


    public void Setsutehai(int hai) {
        switch (hai) {
            case 0:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m1));
                imageView_index++;
                break;
            case 1:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m2));
                imageView_index++;
                break;
            case 2:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m5));
                imageView_index++;
                break;
            case 3:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m4));
                imageView_index++;
                break;
            case 4:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m5));
                imageView_index++;
                break;
            case 5:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m6));
                imageView_index++;
                break;
            case 6:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m7));
                imageView_index++;
                break;
            case 7:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m8));
                imageView_index++;
                break;
            case 8:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.m9));
                imageView_index++;
                break;
            case 9:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p1));
                imageView_index++;
                break;
            case 10:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p2));
                imageView_index++;
                break;
            case 11:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p3));
                imageView_index++;
                break;
            case 12:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p4));
                imageView_index++;
                break;
            case 13:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p5));
                imageView_index++;
                break;
            case 14:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p6));
                imageView_index++;
                break;
            case 15:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p7));
                imageView_index++;
                break;
            case 16:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p8));
                imageView_index++;
                break;
            case 17:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.p9));
                imageView_index++;
                break;
            case 18:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s1));
                imageView_index++;
                break;
            case 19:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s2));
                imageView_index++;
                break;
            case 20:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s3));
                imageView_index++;
                break;
            case 21:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s4));
                imageView_index++;
                break;
            case 22:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s5));
                imageView_index++;
                break;
            case 23:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s6));
                imageView_index++;
                break;
            case 24:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s7));
                imageView_index++;
                break;
            case 25:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s8));
                imageView_index++;
                break;
            case 26:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.s9));
                imageView_index++;
                break;
            case 27:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j1));
                imageView_index++;
                break;
            case 28:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j2));
                imageView_index++;
                break;
            case 29:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j3));
                imageView_index++;
                break;
            case 30:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j4));
                imageView_index++;
                break;
            case 31:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j5));
                imageView_index++;
                break;
            case 32:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j6));
                imageView_index++;
                break;
            case 33:
                imageView[imageView_index].setImageDrawable(getResources().getDrawable(R.drawable.j7));
                imageView_index++;
                break;

        }

        set_tenpai_zunme();


        if (imageView_index == 18) {
            String s = "";
            int min = obj.kokusi_count();
            if (min > obj.ippan_count()) {
                min = obj.ippan_count();
            }
            if (min > obj.toitu_count()) {
                min = obj.toitu_count();
            }
            if (min == 1) {
                s = "テンパイ";
            } else {
                switch (min) {
                    case 2:
                        s = "二向聴";
                        break;
                    case 3:
                        s = "三向聴";
                        break;
                    case 4:
                        s = "四向聴";
                        break;
                    case 5:
                        s = "五向聴";
                        break;
                    case 6:
                        s = "六向聴";
                        break;
                    case 7:
                        s = "七向聴";
                        break;
                    case 8:
                        s = "八向聴";
                        break;
                    case 9:
                        s = "九向聴";
                        break;
                    case 10:
                        s = "十向聴";
                        break;

                }
            }

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("流局")
                    .setMessage(s)
                    .setNegativeButton(
                            "OK",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    saveSeisei();
                                    Clear();

                                }
                            }
                    )
                    .setOnCancelListener(

                            new DialogInterface.OnCancelListener() {
                                @Override
                                public void onCancel(DialogInterface dialog) {
                                    Clear();
                                    saveSeisei();
                                }
                            }
                    )
                    .show();


        }
    }

    public void Clear() {
        Arrays.fill(hai1, 0);
        imageView_index = 0;
        s = -1;
        riti = -1;
        tenpai_zunme = -1;
        for (int i = 0; i < imageView.length; i++) {
            imageView[i].setImageDrawable(null);
        }
        SetDora();
        Sethai();
        obj.hai_clear(hai, dora);
        if (obj.kokusi_count() == 0) {
            tensu_kokusi();
        }
        if (obj.ippan_count() == 0) {
            tensu_ippan();


        }
        if (obj.toitu_count() == 0) {
            tensu_toitu();
        }

        text9.setText("国士　" + String.valueOf(obj.kokusi_count()));
        text8.setText("対子　" + String.valueOf(obj.toitu_count()));


    }

    public void Sethai() {

       for (int i = 0; i < hai.length; i++) {
            hai[i] = Getransu();
        }

        /*


        hai[0] = 0;
        hai[1] = 0;
        hai[2] = 9;
        hai[3] = 9;
        hai[4] = 18;
        hai[5] = 18;
        hai[6] = 27;
        hai[7] = 27;
        hai[8] = 29;
        hai[9] = 29;
        hai[10] = 32;
        hai[11] = 32;
        hai[12] = 33;
        hai[13] = 2;

        agari_hai = 23;


        for (int i = 0; i < hai.length; i++) {
            hai1[hai[i]]++;
        }

*/
        SetimageButton();


    }

    public void SetDora() {

        dora = Getransu();
        switch (dora) {
            case 0:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m1));
                break;
            case 1:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m2));
                break;
            case 2:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m3));
                break;
            case 3:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m4));
                break;
            case 4:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m5));
                break;
            case 5:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m6));
                break;
            case 6:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m7));
                break;
            case 7:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m8));
                break;
            case 8:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.m9));
                break;
            case 9:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p1));
                break;
            case 10:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p2));
                break;
            case 11:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p3));
                break;
            case 12:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p4));
                break;
            case 13:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p5));
                break;
            case 14:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p6));
                break;
            case 15:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p7));
                break;
            case 16:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p8));
                break;
            case 17:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.p9));
                break;
            case 18:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s1));
                break;
            case 19:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s2));
                break;
            case 20:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s3));
                break;
            case 21:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s4));
                break;
            case 22:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s5));
                break;
            case 23:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s6));
                break;
            case 24:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s7));
                break;
            case 25:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s8));
                break;
            case 26:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.s9));
                break;
            case 27:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j1));
                break;
            case 28:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j2));
                break;
            case 29:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j3));
                break;
            case 30:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j4));
                break;
            case 31:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j5));
                break;
            case 32:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j6));
                break;
            case 33:
                imageView18.setImageDrawable(getResources().getDrawable(R.drawable.j7));
                break;

            default:
                break;


        }
    }

    public int Getransu() {
        int x;
        while (true) {
            x = (int) (Math.random() * 34);
            if (hai1[x] < 4) {
                hai1[x]++;
                agari_hai = x;
                return x;
            }
        }

    }

    public void SetimageButton() {
        Arrays.sort(hai);
        for (int i = 0; i < hai.length; i++) {
            switch (hai[i]) {
                case 0:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m1));
                    break;
                case 1:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m2));
                    break;
                case 2:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m3));
                    break;
                case 3:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m4));
                    break;
                case 4:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m5));
                    break;
                case 5:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m6));
                    break;
                case 6:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m7));
                    break;
                case 7:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m8));
                    break;
                case 8:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.m9));
                    break;
                case 9:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p1));
                    break;
                case 10:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p2));
                    break;
                case 11:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p3));
                    break;
                case 12:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p4));
                    break;
                case 13:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p5));
                    break;
                case 14:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p6));
                    break;
                case 15:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p7));
                    break;
                case 16:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p8));
                    break;
                case 17:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.p9));
                    break;
                case 18:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s1));
                    break;
                case 19:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s2));
                    break;
                case 20:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s3));
                    break;
                case 21:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s4));
                    break;
                case 22:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s5));
                    break;
                case 23:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s6));
                    break;
                case 24:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s7));
                    break;
                case 25:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s8));
                    break;
                case 26:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.s9));
                    break;
                case 27:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j1));
                    break;
                case 28:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j2));
                    break;
                case 29:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j3));
                    break;
                case 30:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j4));
                    break;
                case 31:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j5));
                    break;
                case 32:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j6));
                    break;
                case 33:
                    imageButton[i].setImageDrawable(getResources().getDrawable(R.drawable.j7));
                    break;

                default:
                    break;

            }
        }
    }


    public void saveSeisei(int tensu) {
        DecimalFormat df1 = new DecimalFormat("0.00");
        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        int kyokusu = pref.getInt("kyokusuu", 0);
        kyokusu++;
        text10.setText(String.valueOf(kyokusu) + "局目");
        editor.putInt("kyokusuu", kyokusu);

        int agari = pref.getInt("agari", 0);
        agari++;
        text11.setText(" 和了:" + String.valueOf(agari) + "回" + "(" + String.valueOf(df1.format((float) agari * 100 / kyokusu)) + "%)");
        editor.putInt("agari", agari);

        int set_tensu = pref.getInt("tensu", 0);
        set_tensu += tensu;
        editor.putInt("tensu", set_tensu);

        int agari_zyunme = pref.getInt("agari_zyunme", 0);
        agari_zyunme += imageView_index;
        editor.putInt("agari_zyunme", agari_zyunme);

        int tempai_zunme_set = pref.getInt("tempai_zunme", 0);
        tempai_zunme_set += tenpai_zunme;
        editor.putInt("tempai_zunme", tempai_zunme_set);

        int tempai_suu = pref.getInt("tempai_suu", 0);
        tempai_suu++;
        editor.putInt("tempai_suu", tempai_suu);


        editor.commit();
        save_yaku();

    }

    public void saveSeisei() {
        DecimalFormat df1 = new DecimalFormat("0.00");
        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        int kyokusu = pref.getInt("kyokusuu", 0);
        kyokusu++;
        text10.setText(String.valueOf(kyokusu) + "局目");
        editor.putInt("kyokusuu", kyokusu);

        int agari = pref.getInt("agari", 0);
        text11.setText(" 和了:" + String.valueOf(agari) + "回" + "(" + String.valueOf(df1.format((float) agari * 100 / kyokusu)) + "%)");


        if (tenpai_zunme >0) {
            int tempai_zunme_set = pref.getInt("tempai_zunme", 0);
            tempai_zunme_set += tenpai_zunme;
            editor.putInt("tempai_zunme", tempai_zunme_set);

            int tempai_suu = pref.getInt("tempai_suu", 0);
            tempai_suu++;
            editor.putInt("tempai_suu", tempai_suu);
        }


        editor.commit();


    }

    public void save_yaku() {
        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        for (int i = 0; i < yaku.length; i++) {

            if (yaku[i].indexOf("平和") != -1) {
                int pinhu = pref.getInt("pinhu", 0);
                pinhu++;
                editor.putInt("pinhu", pinhu);

            } else if (yaku[i].indexOf("ダブル立直") != -1) {
                int double_riti = pref.getInt("double_riti", 0);
                double_riti++;
                editor.putInt("double_riti", double_riti);

            } else if (yaku[i].indexOf("立直") != -1) {
                int riti = pref.getInt("riti", 0);
                riti++;
                editor.putInt("riti", riti);
            } else if (yaku[i].indexOf("ドラ") != -1) {
                int dora = pref.getInt("dora", 0);
                dora++;
                editor.putInt("dora", dora);
                int dora_kazu = obj.get_dora();
                int dora_suu = pref.getInt("dora_suu", 0);
                dora_suu += dora_kazu;
                editor.putInt("dora_suu", dora_suu);
            } else if (yaku[i].indexOf("断ヤオ") != -1) {
                int tanyao = pref.getInt("tanyao", 0);
                tanyao++;
                editor.putInt("tanyao", tanyao);
            }else if (yaku[i].indexOf("一盃口") != -1) {
                int ipeiko = pref.getInt("ipeiko", 0);
                ipeiko++;
                editor.putInt("ipeiko", ipeiko);
            }else if (yaku[i].indexOf("海底撈月") != -1) {
                int haitei = pref.getInt("haitei", 0);
                haitei++;
                editor.putInt("haitei", haitei);
            }else if (yaku[i].indexOf("七対子") != -1) {
                int titoitu = pref.getInt("titoitu", 0);
                titoitu++;
                editor.putInt("titoitu", titoitu);
            }else if (yaku[i].indexOf("対々和") != -1) {
                int toitoi = pref.getInt("toitoi", 0);
                toitoi++;
                editor.putInt("toitoi", toitoi);
            }else if (yaku[i].indexOf("三色同順") != -1) {
                int sansyoku_douzyun = pref.getInt("sansyoku_douzyun", 0);
                sansyoku_douzyun++;
                editor.putInt("sansyoku_douzyun", sansyoku_douzyun);
            }else if (yaku[i].indexOf("一気通貫") != -1) {
                int ikkituukan = pref.getInt("ikkituukan", 0);
                ikkituukan++;
                editor.putInt("ikkituukan", ikkituukan);
            }else if (yaku[i].indexOf("混全帯") != -1) {
                int hontyan = pref.getInt("hontyan", 0);
                hontyan++;
                editor.putInt("hontyan", hontyan);
            }else if (yaku[i].indexOf("三暗刻") != -1) {
                int sanankou = pref.getInt("sanankou", 0);
                sanankou++;
                editor.putInt("sanankou", sanankou);
            }else if (yaku[i].indexOf("小三元") != -1) {
                int syousangen = pref.getInt("syousangen", 0);
                syousangen++;
                editor.putInt("syousangen", syousangen);
            }else if (yaku[i].indexOf("混老頭") != -1) {
                int honrouto = pref.getInt("honrouto", 0);
                honrouto++;
                editor.putInt("honrouto", honrouto);
            }else if (yaku[i].indexOf("三色同刻") != -1) {
                int sansyoku_doukou = pref.getInt("sansyoku_doukou", 0);
                sansyoku_doukou++;
                editor.putInt("sansyoku_doukou", sansyoku_doukou);
            }else if (yaku[i].indexOf("混一色") != -1) {
                int honitu = pref.getInt("honitu", 0);
                honitu++;
                editor.putInt("honitu", honitu);
            }else if (yaku[i].indexOf("二盃口") != -1) {
                int ryanpeiko = pref.getInt("ryanpeiko", 0);
                ryanpeiko++;
                editor.putInt("ryanpeiko", ryanpeiko);
            }else if (yaku[i].indexOf("純全帯") != -1) {
                int zyuntyan = pref.getInt("zyuntyan", 0);
                zyuntyan++;
                editor.putInt("zyuntyan", zyuntyan);
            }else if (yaku[i].indexOf("清一色") != -1) {
                int tinitu = pref.getInt("tinitu", 0);
                tinitu++;
                editor.putInt("tinitu", tinitu);
            }else if (yaku[i].indexOf("国士無双") != -1) {
                int kokusimusou = pref.getInt("kokusimusou", 0);
                kokusimusou++;
                editor.putInt("kokusimusou", kokusimusou);
                break;
            }else if (yaku[i].indexOf("四暗刻") != -1) {
                int suankou = pref.getInt("suankou", 0);
                suankou++;
                editor.putInt("suankou", suankou);
            }else if (yaku[i].indexOf("大三元") != -1) {
                int daisangen = pref.getInt("daisangen", 0);
                daisangen++;
                editor.putInt("daisangen", daisangen);
            }else if (yaku[i].indexOf("字一色") != -1) {
                int zuiso = pref.getInt("zuiso", 0);
                zuiso++;
                editor.putInt("zuiso", zuiso);
            }else if (yaku[i].indexOf("大四喜") != -1) {
                int daisuti = pref.getInt("daisuti", 0);
                daisuti++;
                editor.putInt("daisuti", daisuti);
            }else if (yaku[i].indexOf("小四喜") != -1) {
                int syousuti = pref.getInt("syousuti", 0);
                syousuti++;
                editor.putInt("syousuti", syousuti);
            }else if (yaku[i].indexOf("清老頭") != -1) {
                int tinroutou = pref.getInt("tinroutou", 0);
                tinroutou++;
                editor.putInt("tinroutou", tinroutou);
            }else if (yaku[i].indexOf("緑一色") != -1) {
                int ryuiso = pref.getInt("ryuiso", 0);
                ryuiso++;
                editor.putInt("ryuiso", ryuiso);
            } else if (yaku[i].indexOf("九蓮宝燈") != -1) {
                int tyurenpoto = pref.getInt("tyurenpoto", 0);
                tyurenpoto++;
                editor.putInt("tyurenpoto", tyurenpoto);
            }else if (yaku[i].indexOf("天和") != -1) {
                int tenho = pref.getInt("tenho", 0);
                tenho++;
                editor.putInt("tenho", tenho);
            }

        }

        editor.commit();
    }


    public void setSeiseki() {
        DecimalFormat df1 = new DecimalFormat("0.00");
        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        int kyokusu = pref.getInt("kyokusuu", 0);
        text10.setText(String.valueOf(kyokusu) + "局目");

        int agari = pref.getInt("agari", 0);
        if (kyokusu != 0) {

            text11.setText(" 和了:" + String.valueOf(agari) + "回" + "(" + String.valueOf(df1.format((float) agari * 100 / kyokusu)) + "%)");
        }else{
            text11.setText(" 和了:" + String.valueOf(agari) + "回" + "(" + String.valueOf(0) + "%)");
        }


    }

    public void set_tenpai_zunme() {
        if ((obj.kokusi_count() == 1 || obj.toitu_count() == 1 || obj.ippan_count() == 1)&&(tenpai_zunme==-1)) {

                tenpai_zunme = imageView_index;

        }
    }

    public void Seiseki_syokika(){

        SharedPreferences pref = getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();


        editor.putInt("kyokusuu", 0);

        editor.putInt("agari", 0);

        editor.putInt("tensu", 0);

        editor.putInt("agari_zyunme", 0);

        editor.putInt("tempai_zunme", 0);

        editor.putInt("tempai_suu", 0);

        editor.putInt("pinhu", 0);

        editor.putInt("double_riti", 0);

        editor.putInt("riti", 0);

        editor.putInt("dora", 0);

        editor.putInt("dora_suu", 0);

        editor.putInt("tanyao", 0);

        editor.putInt("ipeiko", 0);

        editor.putInt("haitei", 0);

        editor.putInt("titoitu", 0);

        editor.putInt("toitoi", 0);

        editor.putInt("sansyoku_douzyun", 0);

        editor.putInt("ikkituukan", 0);

        editor.putInt("hontyan", 0);

        editor.putInt("sanankou", 0);

        editor.putInt("syousangen", 0);

        editor.putInt("honrouto", 0);

        editor.putInt("sansyoku_doukou",0 );

        editor.putInt("honitu", 0);

        editor.putInt("ryanpeiko", 0);

        editor.putInt("zyuntyan", 0);

        editor.putInt("tinitu", 0);

        editor.putInt("kokusimusou", 0);

        editor.putInt("suankou", 0);

        editor.putInt("daisangen", 0);

        editor.putInt("zuiso", 0);

        editor.putInt("daisuti", 0);

        editor.putInt("syousuti", 0);

        editor.putInt("tinroutou", 0);

        editor.putInt("ryuiso", 0);

        editor.putInt("tyurenpoto", 0);

        editor.putInt("tenho", 0);

        editor.commit();

        setSeiseki();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

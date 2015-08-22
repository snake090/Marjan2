package com.example.owner.marjan2;

import com.Tensu;

import java.util.Arrays;

/**
 * Created by Owner on 2015/07/01.
 */
public class    Majan {

    private int hai1[] = new int[14];
    private int hai2[] = new int[34];

    private int dora;
    private int dora_index;
    private int i;
    private int j;
    private int k;
    private int l;
    private int n;


    private String yaku[][] = new String[7][14];
    private int yakusuu[] = new int[7];
    private int yuusen[] = new int[7];
    private int yuusen_index;
    private int shuntu_kazu;
    private int ankou_kazu;

    private int mati; //0:両面 1:単騎 2: ぺんチャン 3: カンチャン 4: シャボ


    private int max;
    private int max_index;

    private boolean riti;
    private boolean d_riti;
    private boolean ippatu;

    private boolean titoitu;//チートイツ
    private boolean honroutou; //ホンロウトウ
    private boolean suankou;//スーアンコウ/
    private boolean sanankou; //サンアンコウ
    private boolean kokusi; //コクシ
    private boolean zuiso;//字一色
    private boolean honitu;//ホンイツ
    private boolean tinitu;//清一色
    private boolean tenhou;//テンホウ
    private boolean haitei_tumo;
    private boolean yakuman;

    private int manzu[] = new int[9];// 0～8
    private int pinzu[] = new int[9];// 9～17
    private int souzu[] = new int[9];// 18～26
    private int zihai[] = new int[7];// 27～33
    private int shuntu[] = new int[6];
    private int ankou[] = new int[6];
    private int toitu[] = new int[7];


    public Majan(int hai[], int dora) {
        hai_clear(hai, dora);

    }

    public void Set_hai(int index, int youso) {
        hai2[hai1[index]]--;
        hai1[index] = youso;
        hai2[hai1[index]]++;
        Arrays.sort(hai1);
        Arrays.fill(toitu, -1);
    }

    public void hai_clear(int hai[], int dora) {
        this.hai1 = hai.clone();
        Arrays.fill(hai2, 0);
        for (int i = 0; i < hai.length; i++) {
            hai2[hai[i]]++;
        }

        i = 0;
        j = 0;
        k = 0;
        l = 0;
        n = 0;
        shuntu_kazu = 0;
        ankou_kazu = 0;
        mati = -1;
        Arrays.fill(yuusen, 0);
        yuusen_index = 0;
        titoitu = false;
        honroutou = true;
        suankou = false;
        sanankou = false;
        zuiso = false;
        honitu = false;
        tinitu = false;
        kokusi = false;
        riti = false;
        d_riti = false;
        ippatu=false;
        tenhou=false;
        yakuman=false;
        haitei_tumo=false;


        for (int i = 0; i < yakusuu.length; i++) {
            yakusuu[i] = -1;
        }
        for (int i = 0; i < yaku.length; i++) {
            Arrays.fill(yaku[i], "");
        }
        this.dora = dora;

    }

    public int kokusi_count() {
        int x = 14;
        int y[] = new int[13];
        boolean flag = true;
        for (int i = 0; i < hai1.length; i++) {
            if (hai1[i] == 0) {
                if (y[0] == 0) {
                    x--;
                    y[0]++;
                } else if (y[0] == 1 && flag) {
                    x--;
                    y[0]++;
                    flag = false;
                }
            } else if (hai1[i] == 8) {
                if (y[1] == 0) {
                    x--;
                    y[1]++;
                } else if (y[1] == 1 && flag) {
                    x--;
                    y[1]++;
                    flag = false;
                }
            } else if (hai1[i] == 9) {
                if (y[2] == 0) {
                    x--;
                    y[2]++;
                } else if (y[2] == 1 && flag) {
                    x--;
                    y[2]++;
                    flag = false;
                }
            } else if (hai1[i] == 17) {
                if (y[3] == 0) {
                    x--;
                    y[3]++;
                } else if (y[3] == 1 && flag) {
                    x--;
                    y[3]++;
                    flag = false;
                }
            } else if (hai1[i] == 18) {
                if (y[4] == 0) {
                    x--;
                    y[4]++;
                } else if (y[4] == 1 && flag) {
                    x--;
                    y[4]++;
                    flag = false;
                }
            } else if (hai1[i] == 26) {
                if (y[5] == 0) {
                    x--;
                    y[5]++;
                } else if (y[5] == 1 && flag) {
                    x--;
                    y[5]++;
                    flag = false;
                }
            } else if (hai1[i] == 27) {
                if (y[6] == 0) {
                    x--;
                    y[6]++;
                } else if (y[6] == 1 && flag) {
                    x--;
                    y[6]++;
                    flag = false;
                }
            } else if (hai1[i] == 28) {
                if (y[7] == 0) {
                    x--;
                    y[7]++;
                } else if (y[7] == 1 && flag) {
                    x--;
                    y[7]++;
                    flag = false;
                }
            } else if (hai1[i] == 29) {
                if (y[8] == 0) {
                    x--;
                    y[8]++;
                } else if (y[8] == 1 && flag) {
                    x--;
                    y[8]++;
                    flag = false;
                }
            } else if (hai1[i] == 30) {
                if (y[9] == 0) {
                    x--;
                    y[9]++;
                } else if (y[9] == 1 && flag) {
                    x--;
                    y[9]++;
                    flag = false;
                }
            } else if (hai1[i] == 31) {
                if (y[10] == 0) {
                    x--;
                    y[10]++;
                } else if (y[10] == 1 && flag) {
                    x--;
                    y[10]++;
                    flag = false;
                }
            } else if (hai1[i] == 32) {
                if (y[11] == 0) {
                    x--;
                    y[11]++;
                } else if (y[11] == 1 && flag) {
                    x--;
                    y[11]++;
                    flag = false;
                }
            } else if (hai1[i] == 33) {
                if (y[12] == 0) {
                    x--;
                    y[12]++;
                } else if (y[12] == 1 && flag) {
                    x--;
                    y[12]++;
                    flag = false;
                }
            }
        }


        return x;
    }

    public int toitu_count() {
        int toitu_suu = 7;
        toitu_suu -= toitu_hantei();

        return toitu_suu;
    }

    private int toitu_hantei() {
        int x = 0;

        for (int i = 0; i < hai2.length; i++) { //対子判定
            if (hai2[i] >= 2) {
                toitu[x] = i;
                x++;
            }
        }
        return x;

    }

    public void toitu_tensu() {


        titoitu = true;
        zuiso = true;
        max = 2;
        for (int i = 0; i < 7; i++) {
            if ((toitu[i] == 0) || (toitu[i] == 8) || (toitu[i] == 9) || (toitu[i] == 17) || (toitu[i] == 18) || (toitu[i] == 26) || (toitu[i] == 27) || (toitu[i] == 28) || (toitu[i] == 29)
                    || (toitu[i] == 30) || (toitu[i] == 31) || (toitu[i] == 32) || (toitu[i] == 33)) {


            } else {
                honroutou = false;
                break;
            }

        }
        if (honroutou) {
            max = 4;
        }

        for (int i = 0; i < 7; i++) {
            if (toitu[i] == 27 || toitu[i] == 28 || toitu[i] == 29 || toitu[i] == 30 || toitu[i] == 31 || toitu[i] == 32 || toitu[i] == 33) {

            } else {
                zuiso = false;
                break;
            }
        }
        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < 7; i++) {

            if (toitu[i] == 0 || toitu[i] == 1 || toitu[i] == 2 || toitu[i] == 3 || toitu[i] == 4 || toitu[i] == 5 || toitu[i] == 6 || toitu[i] == 7 || toitu[i] == 8) {
                flag1 = 1;
            } else if (toitu[i] == 9 || toitu[i] == 10 || toitu[i] == 11 || toitu[i] == 12 || toitu[i] == 13 || toitu[i] == 14 || toitu[i] == 15 || toitu[i] == 16 || toitu[i] == 17) {
                if (flag1 == 0) {
                    flag1 = 2;

                } else if (flag1 == 2) {

                } else {
                    flag1 = 4;
                }
            } else if (toitu[i] == 18 || toitu[i] == 19 || toitu[i] == 20 || toitu[i] == 21 || toitu[i] == 22 || toitu[i] == 23 || toitu[i] == 24 || toitu[i] == 25 || toitu[i] == 26) {
                if (flag1 == 0) {
                    flag1 = 3;

                } else if (flag1 == 3) {

                } else {
                    flag1 = 4;
                    break;
                }
            } else {

                flag2 = 1;
            }

        }

        if (flag2 == 1 && flag1 != 4) {
            honitu = true;
            max += 3;
        } else if (flag2 == 0 && flag1 != 4) {
            tinitu = true;
            max += 6;
        }

    }

    public String[] Get_yaku() {
        String yaku[] = new String[14];
        Arrays.fill(yaku, "");
        int i = 0;
        if(!yakuman) {
            if (riti) {
                yaku[i] = "立直　　　　1翻";
                i++;
            }
            if (d_riti) {
                yaku[i] = "ダブル立直　2翻";
                i++;
            }
            if (ippatu) {
                yaku[i] = "一発　　　　1翻";
                i++;
            }

            yaku[i] = "門前自摸　　1翻";
            i++;
            max++;

            if (haitei_tumo) {
                yaku[i] = "海底摸月　　1翻";
                i++;
            }
        }

        if (titoitu) {
            yaku[i] = "七対子　　　2翻";
            i++;
            int dora = get_dora();

            if (honroutou) {
                yaku[i] = "混老頭　　　2翻";
                i++;
            }
            if (honitu) {
                yaku[i] = "混一色　　　3翻";
                i++;
            }
            if (tinitu) {
                yaku[i] = "清一色　　　6翻";
                i++;
            }
        } else if (kokusi) {
            yaku[i] = "国士無双　　　13翻";
            yakuman=true;
            i++;

        }
        if (zuiso) {
            Arrays.fill(yaku, "");
            i = 0;
            yaku[i] = "字一色　　　13翻";
            yakuman=true;
            i++;
        } else {
            for (int j = 0; j < this.yaku.length; j++) {
                yaku[j + i] = this.yaku[max_index][j];
            }
        }
        if(tenhou){
            Arrays.fill(yaku, "");
            i = 0;
            yaku[i] = "天和　　　　13翻";
            i++;
            max=13;
            yakuman=true;
        }

        if (sanankou) {
            for (int k = 0; k < yaku.length; k++) {
                if ("".equals(yaku[k])) {
                    yaku[k] = "三暗刻　　　2翻";
                    max += 2;
                    break;
                }
            }
        }

        if (suankou) {
            Arrays.fill(yaku, "");
            yaku[0] = "四暗刻　　　13翻";
            max = 13;
            yakuman=true;
        }

        if(!yakuman) {
            int dora = get_dora();
            if (dora > 0 && max != 13 && max != 0) {
                max += dora;
                for (int k = 0; k < yaku.length; k++) {
                    if ("".equals(yaku[k])) {
                        yaku[k] = "ドラ" + String.valueOf(dora) + "　　　  " + String.valueOf(dora) + "翻";
                        break;
                    }
                }

            }
        }
        return yaku;
    }

    public int get_dora() {

        int dorasu = 0;

        if (dora == 8 || dora == 17 || dora == 26) {
            dorasu += hai2[dora - 8];
        } else if (dora == 33) {
            dorasu += hai2[dora - 6];
        } else {
            dorasu += hai2[dora + 1];
        }


        return dorasu;
    }

    public String[] Get_tensu() {
        String tensu[] = new String[2];
        Tensu obj = new Tensu();

        if (kokusi) {
            tensu[0] = "役満　　　　" + String.valueOf(max) + "翻";
            tensu[1] = "48000点";
        }
        if (zuiso) {
            tensu[0] = "役満　　　　" + String.valueOf(max) + "翻";
            tensu[1] = "48000点";
        }
        if (titoitu) {
            if (max == 2) {
                tensu[0] = "25符　　　   2翻";
                tensu[1] = obj.Get_oya_ron_tesu(20, max);
            } else if (max == 3) {
                tensu[0] = "25符　　　   3翻";
                tensu[1] = obj.Get_oya_ron_tesu(20, max);
            } else if (max == 4) {
                tensu[0] = "25符　　　   4翻";
                tensu[1] = obj.Get_oya_ron_tesu(20, max);

            } else if (max == 5) {
                tensu[0] = "満貫　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "12000点";
            } else if (max < 8) {
                tensu[0] = "跳満　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "18000点";
            } else if (max < 11) {
                tensu[0] = "倍満　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "24000点";
            } else if (max < 13) {
                tensu[0] = "三倍満　　　" + String.valueOf(max) + "翻";
                tensu[1] = "36000点";
            } else {
                tensu[0] = "役満　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "48000点";
            }

        } else {
            int hansu = 0;
            hansu = hansu();
            if (max == 0) {

            } else if (max < 4) {
                tensu[0] = String.valueOf(hansu) + "符　　　　" + String.valueOf(max) + "翻";
                tensu[1] = obj.Get_oya_ron_tesu(hansu, max);

            } else if (max == 4 && hansu < 40) {
                tensu[0] = String.valueOf(hansu) + "符　　　　" + String.valueOf(max) + "翻";
                tensu[1] = obj.Get_oya_ron_tesu(hansu, max);

            } else if (max == 4 && hansu >= 40) {
                tensu[0] = "満貫　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "12000点";
            } else if (max < 6) {
                tensu[0] = "満貫　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "12000点";
            } else if (max < 8) {
                tensu[0] = "跳満　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "18000点";
            } else if (max < 11) {
                tensu[0] = "倍満　　　　" + String.valueOf(max) + "翻";
                tensu[1] = "24000点";
            } else if (max < 13) {
                tensu[0] = "三倍満　　　" + String.valueOf(max) + "翻";
                tensu[1] = "36000点";
            } else if (max < 26) {
                tensu[0] = "役満";
                tensu[1] = "48000点";
            } else if (max < 39) {
                tensu[0] = "ダブル役満";
                tensu[1] = "96000点";
            } else {
                tensu[0] = "トリプル役満";
                tensu[1] = "144000点";
            }

        }


        return tensu;
    }

    private int hansu() {
        double hansu = 20;
        if (toitu[max_index] == 31 || toitu[max_index] == 32 || toitu[max_index] == 33) {
            hansu += 2;
        }
        if (toitu[max_index] - 27 == 0) {
            hansu += 2;
        }
        if (toitu[max_index] - 27 == 0) {
            hansu += 2;
        }
        if (mati != 0 && mati != 4) {
            hansu += 2;
        }

        if (mati != 0) {
            hansu += 2;
        }
        if (ankou_kazu != 0) {
            for (int i = 0; i < ankou_kazu; i++) {
                if (ankou[i] == 0 || ankou[i] == 8 || ankou[i] == 9 || ankou[i] == 17 || ankou[i] == 18 || ankou[i] == 26 || ankou[i] == 27 || ankou[i] == 28 || ankou[i] == 29 || ankou[i] == 30 || ankou[i] == 31 || ankou[i] == 32 || ankou[i] == 33) {
                    hansu += 8;
                } else {
                    hansu += 4;
                }
            }

        }
        hansu = hansu / 10;
        hansu = Math.ceil(hansu);
        hansu = hansu * 10;
        return (int) hansu;

    }

    public int ippan_count() {
        int count = 8;

        int toitu[] = new int[7];
        int hai3[] = hai2.clone();

        int l = 0;
        int a = 0;
        int ankou_count = 0;
        int shuntu_count = 0;
        int kouho_count = 0;

        for (int i = 0; i < hai2.length; i++) { //対子判定
            if (hai2[i] >= 2) {
                toitu[l] = i;
                l++;
            }
        }

        int min1;
        int min2;
        while (a < l) {

            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            ankou_count = ankou_count();
            shuntu_count = shuntu_count();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            if(kouho_count>4){
                kouho_count=4;
            }
            min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;

            hai2 = hai3.clone();

            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            shuntu_count = shuntu_count();
            ankou_count = ankou_count();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            if(kouho_count>4){
                kouho_count=4;
            }
            min2 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;

            hai2 = hai3.clone();

            if (min1 < min2) {
                if (min1 < count) {
                    count = min1;
                }
            } else {
                if (min2 < count) {
                    count = min2;
                }
            }

            a++;
        }


        ankou_count = ankou_count();
        shuntu_count = shuntu_count();
        kouho_count = kouho_count();
        if (ankou_count + shuntu_count + kouho_count > 4) {
            kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
        }
        if(kouho_count>4){
            kouho_count=4;
        }
        min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 1;
        if (min1 < count) {
            count = min1;
        }

        hai2 = hai3.clone();
        shuntu_count = shuntu_count();
        ankou_count = ankou_count();
        kouho_count = kouho_count();
        if (ankou_count + shuntu_count + kouho_count > 4) {
            kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
        }
        if(kouho_count>4){
            kouho_count=4;
        }
        min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 1;
        if (min1 < count) {
            count = min1;
        }

        hai2 = hai3.clone();
        return count;

    }


    private int kouho_count() {

        int count1 = 0;
        int count2 = 0;
        int hai4[] = hai2.clone();

        for (int i = 0; i < hai4.length; i++) {
            if (hai4[i] >= 2) {
                count1++;
                hai4[i] = hai4[i] - 2;
            }
        }
        count1 += shuntu_kouho_count(hai4);

        hai4 = hai2.clone();

        count2 += shuntu_kouho_count(hai4);
        for (int i = 0; i < hai4.length; i++) {
            if (hai4[i] >= 2) {
                count2++;
                hai4[i] = hai4[i] - 2;
            }
        }

        if (count1 > count2) {
            for (int i = 0; i < hai2.length; i++) {
                if (hai2[i] >= 2) {
                    hai2[i] = hai2[i] - 2;
                }
            }
            shuntu_kouho_count();

            return count1;
        } else {
            shuntu_kouho_count();
            for (int i = 0; i < hai2.length; i++) {
                if (hai2[i] >= 2) {
                    hai2[i] = hai2[i] - 2;
                }
            }
            return count2;
        }


    }

    private void shuntu_kouho_count() {
        int b = 0;
        int j = 0;
        for (int i = 0; i < hai2.length; i++) { /// 順子判定

            if ((i <= 25) && (hai2[i + 1] != 0) && (hai2[i] != 0)) {
                if ((i == 8)) {

                } else if ((i == 17)) {

                } else if ((i == 26)) {

                } else {
                    hai2[i]--;
                    hai2[i + 1]--;

                    j++;
                    if (hai2[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < hai2.length; i++) { /// 順子判定

            if ((i <= 24) && (hai2[i + 2] != 0) && (hai2[i] != 0)) {
                if ((i == 7) || (i == 8)) {


                } else if ((i == 16) || (i == 17)) {


                } else if ((i == 25) || (i == 26)) {


                } else {

                    hai2[i]--;
                    hai2[i + 2]--;

                    j++;
                    if (hai2[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }

    }


    private int shuntu_kouho_count(int hai4[]) {
        int b = 0;
        int j = 0;
        for (int i = 0; i < hai4.length; i++) { /// 順子判定

            if ((i <= 25) && (hai4[i + 1] != 0) && (hai4[i] != 0)) {
                if ((i == 8)) {


                } else if ((i == 17)) {


                } else if ((i == 26)) {


                } else {


                    hai4[i]--;
                    hai4[i + 1]--;

                    j++;
                    if (hai4[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < hai4.length; i++) { /// 順子判定

            if ((i <= 24) && (hai4[i + 2] != 0) && (hai4[i] != 0)) {
                if ((i == 7) || (i == 8)) {


                } else if ((i == 16) || (i == 17)) {


                } else if ((i == 25) || (i == 26)) {


                } else {

                    hai4[i]--;
                    hai4[i + 2]--;

                    j++;
                    if (hai4[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }


        return j;
    }

    private int ankou_count() {
        k = 0;
        for (int i = 0; i < hai2.length; i++) { //暗刻判定
            if (hai2[i] >= 3) {
                k++;
                hai2[i] = hai2[i] - 3;

            }

        }

        return k;
    }

    private int shuntu_count() {
        int b = 0;
        int j = 0;
        for (int i = 0; i < hai2.length; i++) { /// 順子判定

            if ((i <= 24) && (hai2[i + 1] != 0) && (hai2[i + 2] != 0) && (hai2[i] != 0)) {
                if ((i == 7) || (i == 8)) {

                    j++;

                } else if ((i == 16) || (i == 17)) {

                    j++;

                } else if ((i == 25) || (i == 26)) {

                    j++;

                } else {

                    hai2[i]--;
                    hai2[i + 1]--;
                    hai2[i + 2]--;

                    j++;
                    if (hai2[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }
        return j;
    }

    private int shuntu_count_back() {
        int b = 0;
        int j = 0;
        for (int i = hai2.length; i>1; i--) { /// 順子判定

            if ((i <= 26) && (hai2[i - 1] != 0) && (hai2[i - 2] != 0) && (hai2[i] != 0)) {
                if ((i == 0) || (i == 1)) {

                    j++;

                } else if ((i == 9) || (i == 10)) {

                    j++;

                } else if ((i == 18) || (i == 19)) {

                    j++;

                } else {

                    hai2[i]--;
                    hai2[i - 1]--;
                    hai2[i - 2]--;

                    j++;
                    if (hai2[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }
        return j;
    }








    public void ippan_tensu(int agari_hai) {

        int j = 0;
        int k = 0;
        int l = 0;

        for (int i = 0; i < 6; i++) {
            shuntu[i] = -1;
            ankou[i] = -1;
            toitu[i] = -1;
        }

        int hai3[] = hai2.clone();


        int a = 0;


        l = toitu_hantei();
        int toitu1[] = toitu.clone();

        while (a < l) {


            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            In_toitu(a);
            k = ankou();
            j = shuntu();


            if (j + k == 4) {
                mati(agari_hai, a, hai3);
                yakusu(a, k, j, agari_hai);
                yuusen[yuusen_index] = 1;


            }

            hai2 = hai3.clone();
            for (int i = 0; i < 6; i++) {
                shuntu[i] = -1;
                ankou[i] = -1;

            }

            for (int i = 0; i < manzu.length; i++) {
                manzu[i] = 0;
                souzu[i] = 0;
                pinzu[i] = 0;
            }
            j = 0;
            k = 0;

            hai2 = hai3.clone();
            toitu = toitu1.clone();
////////////////////////////////////////////////////////////
            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            In_toitu(a);
            j = shuntu();
            k = ankou();
            if (j + k == 4) {
                mati(agari_hai, a, hai3);
                yakusu(a, k, j, agari_hai);

            }
            hai2 = hai3.clone();
            for (int i = 0; i < 6; i++) {
                shuntu[i] = -1;
                ankou[i] = -1;

            }
            for (int i = 0; i < manzu.length; i++) {
                manzu[i] = 0;
                souzu[i] = 0;
                pinzu[i] = 0;
            }


            a++;
            yuusen_index++;
        }
        ////////////////////////////////////////////////////////////////////////
        max = -1;
        for (int i = 0; i < yakusuu.length; i++) {
            if (max < yakusuu[i]) {
                max = yakusuu[i];
                max_index = i;
            }
        }
        if (yuusen[max_index] == 1) {
            for (int i = 0; i < 6; i++) {
                shuntu[i] = -1;
                ankou[i] = -1;

            }

            for (int i = 0; i < manzu.length; i++) {
                manzu[i] = 0;
                souzu[i] = 0;
                pinzu[i] = 0;
            }
            hai2 = hai3.clone();
            hai2[toitu[max_index]] = hai2[toitu[max_index]] - 2;
            shuntu_kazu = shuntu();
            ankou_kazu = ankou();
        } else if (yuusen[max_index] == 2) {
            for (int i = 0; i < 6; i++) {
                shuntu[i] = -1;
                ankou[i] = -1;

            }

            for (int i = 0; i < manzu.length; i++) {
                manzu[i] = 0;
                souzu[i] = 0;
                pinzu[i] = 0;
            }
            hai2 = hai3.clone();
            hai2[toitu[max_index]] = hai2[toitu[max_index]] - 2;
            ankou_kazu = ankou();
            shuntu_kazu = shuntu();
        }

        hai2 = hai3.clone();

    }

    private void In_toitu(int a) {
        if (toitu[a] <= 8) {
            manzu[toitu[a]] = manzu[toitu[a]] + 2;
        } else if (toitu[a] <= 17) {
            pinzu[toitu[a] - 9] = pinzu[toitu[a] - 9] + 2;
        } else if (toitu[a] <= 26) {
            souzu[toitu[a] - 18] = souzu[toitu[a] - 18] + 2;
        } else {
            zihai[toitu[a] - 27] = zihai[toitu[a] - 27] + 2;
        }


    }

    private int ankou() {
        k = 0;
        for (int i = 0; i < hai2.length; i++) { //暗刻判定
            if (hai2[i] >= 3) {
                ankou[k] = i;
                k++;
                hai2[i] = hai2[i] - 3;

                if (i <= 8) {
                    manzu[i] = manzu[i] + 3;
                } else if (i <= 17) {
                    pinzu[i - 9] = pinzu[i - 9] + 3;
                } else if (i <= 26) {
                    souzu[i - 18] = souzu[i - 18] + 3;
                } else {
                    zihai[i - 27] = zihai[i - 27] + 3;
                }
            }

        }

        return k;
    }

    private int shuntu() {
        int b = 0;
        int j = 0;
        for (int i = 0; i < hai2.length; i++) { /// 順子判定

            if ((i <= 26) && (hai2[i + 1] != 0) && (hai2[i + 2] != 0) && (hai2[i] != 0)) {
                if ((i == 7) || (i == 8)) {

                    j++;

                } else if ((i == 16) || (i == 17)) {

                    j++;

                } else if ((i == 25) || (i == 26)) {

                    j++;

                } else {

                    shuntu[j] = i;
                    hai2[i]--;
                    hai2[i + 1]--;
                    hai2[i + 2]--;

                    j++;
                    if (i <= 6) {
                        manzu[i]++;
                        manzu[i + 1]++;
                        manzu[i + 2]++;
                    } else if (i >= 9 && i <= 15) {
                        pinzu[i - 9]++;
                        pinzu[i - 8]++;
                        pinzu[i - 7]++;
                    } else if (i >= 18 && i <= 24) {
                        souzu[i - 18]++;
                        souzu[i - 17]++;
                        souzu[i - 16]++;
                    }
                    if (hai2[i] != 0) {
                        if (b < 3) {
                            i--;
                            b = 0;
                        } else {

                            b++;
                        }
                    }
                }
            }
        }
        return j;
    }

    private void mati(int agari_hai, int a, int hai3[]) {
        hai2 = hai3.clone();
        if (toitu[a] == agari_hai && hai2[toitu[a]] != 3 && hai2[toitu[a]] != 4) {
            mati = 1;//単騎
            return;

        }
        for (int i = 0; i < ankou.length; i++) {
            if (ankou[i] == agari_hai && hai2[ankou[i]] != 4) {
                mati = 4;//シャンポン
                return;

            }
        }

        hai2[toitu[a]] = hai2[toitu[a]] - 2; //対子

        for (int i = 0; i < k; i++) {
            if (ankou[i] >= 0) {
                hai2[ankou[i]] = hai2[ankou[i]] - 3;//アンコウ
            }
        }
        hai2[agari_hai]--;
        int b = 0;
        int hai4[] = new int[34];
        hai4 = hai2.clone();
        for (int i = 0; i < hai2.length; i++) { /// 順子判定

            if ((i <= 26) && (hai2[i + 1] != 0) && (hai2[i + 2] != 0) && (hai2[i] != 0)) {
                if ((i == 7) || (i == 8)) {


                } else if ((i == 16) || (i == 17)) {


                } else if ((i == 25) || (i == 26)) {


                } else {

                    if (shuntu[0] == i || shuntu[1] == i || shuntu[2] == i || shuntu[3] == i) {
                        hai2[i]--;
                        hai2[i + 1]--;
                        hai2[i + 2]--;

                    }


                    if (hai2[i] != 0) {
                        if (b < 1) {
                            i--;
                            b++;
                        } else {

                            b = 0;
                        }
                    }
                }
            }
        }
        hai2[agari_hai]++;
        if (agari_hai != 0 && hai2[agari_hai - 1] != 0 && hai2[agari_hai + 1] != 0) {
            mati = 3;//カンチャン待ち

        } else if (((agari_hai == 2) && (hai2[0] != 0) && (hai2[1] != 0)) || ((agari_hai == 6) && (hai2[7] != 0) && (hai2[8] != 0)) ||
                ((agari_hai == 11) && (hai2[9] != 0) && (hai2[10] != 0)) || ((agari_hai == 15) && (hai2[16] != 0) && (hai2[17] != 0)) ||
                ((agari_hai == 20) && (hai2[18] != 0) && (hai2[19] != 0)) || ((agari_hai == 24) && (hai2[25] != 0) && (hai2[26] != 0))) {


            mati = 2;//ペンチャン待ち
        } else {
            mati = 0; //リャンメン
            return;
        }

        b = 0;
        for (int i = hai4.length - 1; i > 1; i--) { /// 順子判定

            if ((i <= 26) && (hai4[i - 1] != 0) && (hai4[i - 2] != 0) && (hai4[i] != 0)) {
                if ((i == 0) || (i == 1)) {


                } else if ((i == 9) || (i == 10)) {


                } else if ((i == 18) || (i == 19)) {


                } else {

                    if (shuntu[0] + 2 == i || shuntu[1] + 2 == i || shuntu[2] + 2 == i || shuntu[3] + 2 == i) {
                        hai4[i]--;
                        hai4[i - 1]--;
                        hai4[i - 2]--;

                    }


                    if (hai4[i] != 0) {
                        if (b < 1) {
                            i--;
                            b++;
                        } else {

                            b = 0;
                        }
                    }
                }
            }
        }
        hai4[agari_hai]++;
        if (agari_hai != 0 && hai4[agari_hai - 1] != 0 && hai4[agari_hai + 1] != 0 && mati != 0) {
            mati = 3;//カンチャン待ち

        } else if ((((agari_hai == 2) && (hai4[0] != 0) && (hai4[1] != 0)) || ((agari_hai == 6) && (hai4[7] != 0) && (hai4[8] != 0)) ||
                ((agari_hai == 11) && (hai4[9] != 0) && (hai4[10] != 0)) || ((agari_hai == 15) && (hai4[16] != 0) && (hai4[17] != 0)) ||
                ((agari_hai == 20) && (hai4[18] != 0) && (hai4[19] != 0)) || ((agari_hai == 24) && (hai4[25] != 0) && (hai4[26] != 0))) && mati != 0) {


            mati = 2;//ペンチャン待ち
        } else {
            mati = 0; //リャンメン
        }


    }


    private void yakusu(int a, int k, int j, int agari_hai) { //k:アンコウ j:シュンツ

        int tmp = 0;
        int yaku_index = 0;
        if (pinhu(a)) { //平和
            tmp = tmp + 1;
            yaku[a][yaku_index] = "平和　　　　1翻";
            yaku_index = yaku_index + 1;
        }
        if (tanyao()) {
            tmp = tmp + 1;
            yaku[a][yaku_index] = "断ヤオ　　　1翻";
            yaku_index = yaku_index + 1;
        }
        if (peiko() == 1) {
            tmp = tmp + 1; //いーぺーこー
            yaku[a][yaku_index] = "一盃口　　　1翻";
            yaku_index = yaku_index + 1;
        }
        if (yakuhai(k) > 0) {
            tmp = tmp + yakuhai(k);
            yaku[a][yaku_index] = "役牌×" + String.valueOf(yakuhai(k) + " 　　　" + String.valueOf(yakuhai(k) + "翻"));
            yaku_index = yaku_index + 1;
        }
        if (tyanta(a, k, j) == 2) {
            tmp = tmp + 2;
            yaku[a][yaku_index] = "混老頭　　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (tyanta(a, k, j) == 1) {
            tmp = tmp + 2;
            yaku[a][yaku_index] = "混全帯　　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (toitoi(k)) {
            tmp = tmp + 2;
            yaku[a][yaku_index] = "対々和　　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (ankou(k) == 2) {
            tmp = tmp + 2; //
            yaku[a][yaku_index] = "三暗刻　　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (sansyokudouzyun(j)) {
            tmp = tmp + 2; //
            yaku[a][yaku_index] = "三色同順　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (ikkituukan(j)) {
            tmp = tmp + 2; //
            yaku[a][yaku_index] = "一気通貫　　2翻";
            yaku_index = yaku_index + 1;
        }
        if (sansyokudoukou(k)) {
            tmp = tmp + 2; //
            yaku[a][yaku_index] = "三色同刻　　2翻";
            yaku_index = yaku_index + 1;
        }

        if (syousangen(k, a)) {
            tmp = tmp + 2; //
            yaku[a][yaku_index] = "小三元　　　2翻";
            yaku_index = yaku_index + 1;

        }


        if (peiko() == 3) {
            tmp = tmp + 3; // りゃんぺーこー
            yaku[a][yaku_index] = "二盃口　　　3翻";
            yaku_index = yaku_index + 1;
        }
        if (tyanta(a, k, j) == 3) {
            tmp = tmp + 3;
            yaku[a][yaku_index] = "純全帯　　　3翻";
            yaku_index = yaku_index + 1;
        }

        if (honitu_tinitu_ziiso() == 2) {
            tmp = tmp + 3;
            yaku[a][yaku_index] = "混一色　　　3翻";
            yaku_index = yaku_index + 1;
        }
        if (honitu_tinitu_ziiso() == 1) {
            tmp = tmp + 6;
            yaku[a][yaku_index] = "清一色　　　6翻";
            yaku_index = yaku_index + 1;
        }

        if (honitu_tinitu_ziiso() == 3) {
            if (tmp < 13) {
                Arrays.fill(yaku[a], "");
                yaku_index = 0;
                tmp = 0;
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "字一色　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }
        if (ankou(k) == 13) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "四暗刻　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (daisangen(k)) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "大三元　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }
        if (susihou(k, a) == 1) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "大四喜　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (susihou(k, a) == 2) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "小四喜　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (tinroto(k, a)) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "清老頭　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (ryuiso()) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "緑一色　　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (tyurenpoto(agari_hai)) {
            if (tmp < 13) {
                yaku_index = 0;
                tmp = 0;
                Arrays.fill(yaku[a], "");
            }
            tmp = tmp + 13;
            yaku[a][yaku_index] = "九蓮宝燈　　13翻";
            yaku_index = yaku_index + 1;
            yakuman=true;
        }

        if (yakusuu[a] < tmp) {
            yakusuu[a] = tmp;
            yuusen[yuusen_index] = 2;
        }


    }

    private int peiko() {
        int count = 0;
        int shuntu_tmp = shuntu[0];
        for (int i = 1; i < shuntu.length; i++) {

            if (shuntu[i] == -1) {
                break;
            }
            if (shuntu[i] == shuntu_tmp) {
                count++;
            } else {
                shuntu_tmp = shuntu[i];
            }
        }

        if (count == 1) {
            return 1;
        } else if (count == 2) {
            return 3;
        }
        return 0;

    }

    private boolean pinhu(int a) {
        if (mati == 0) {
            if (toitu[a] != 27 && toitu[a] != 31 && toitu[a] != 32 && toitu[a] != 33) {
                return true;

            }
        }

        return false;
    }

    private int ankou(int k) {
        if (k == 4 && mati == 1) {
            return 13;
        } else if (k == 4 && mati == 4) {
            suankou = true;
            return 0;
        } else if (k == 3 && mati != 4) {
            return 2;
        } else if (k == 3 && mati == 4) {
            sanankou = true;
            return 0;
        }
        return 0;
    }

    private boolean tanyao() {
        if ((manzu[0] == 0) && (manzu[8] == 0) && (pinzu[0] == 0) && (pinzu[8] == 0) && (souzu[0] == 0) && (souzu[8] == 0) && (zihai[0] == 0) &&
                (zihai[1] == 0) && (zihai[2] == 0) && (zihai[3] == 0) && (zihai[4] == 0) && (zihai[5] == 0) && (zihai[6] == 0)) {
            return true;

        }
        return false;
    }

    private int yakuhai(int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (ankou[i] == 31) {
                count = count + 1;
            }
            if (ankou[i] == 32) {
                count = count + 1;
            }
            if (ankou[i] == 33) {
                count = count + 1;
            }
            if (ankou[i] == 27) {
                count = count + 1;
            }
            if (ankou[i] == 27) {
                count = count + 1;
            }
        }

        return count;
    }

    private int tyanta(int a, int k, int j) {
        boolean tyanta = true;
        if ((toitu[a] == 0) || (toitu[a] == 8) || (toitu[a] == 9) || (toitu[a] == 17) || (toitu[a] == 18) || (toitu[a] == 26)) {
            for (int i = 0; i < k; i++) {
                if ((ankou[i] == 0) || (ankou[i] == 8) || (ankou[i] == 9) || (ankou[i] == 17) || (ankou[i] == 18) || (ankou[i] == 26)) {

                } else {
                    tyanta = false;
                    break;
                }
            }

            for (int i = 0; i < j; i++) {
                if ((shuntu[i] == 0) || (shuntu[i] == 6) || (shuntu[i] == 9) || (shuntu[i] == 15) || (shuntu[i] == 18) || (shuntu[i] == 24)) {

                } else {
                    tyanta = false;
                    break;
                }
            }

        } else {
            tyanta = false;
        }
        if (tyanta) {
            return 3;
        }
        tyanta = true;


        if ((toitu[a] == 0) || (toitu[a] == 8) || (toitu[a] == 9) || (toitu[a] == 17) || (toitu[a] == 18) || (toitu[a] == 26) || (toitu[a] == 27) || (toitu[a] == 28) || (toitu[a] == 29)
                || (toitu[a] == 30) || (toitu[a] == 31) || (toitu[a] == 32) || (toitu[a] == 33)) {
            for (int i = 0; i < k; i++) {
                if ((ankou[i] == 0) || (ankou[i] == 8) || (ankou[i] == 9) || (ankou[i] == 17) || (ankou[i] == 18) || (ankou[i] == 26) || (ankou[i] == 27) || (ankou[i] == 28) || (ankou[i] == 29)
                        || (ankou[i] == 30) || (ankou[i] == 31) || (ankou[i] == 32) || (ankou[i] == 33)) {

                } else {
                    tyanta = false;
                    break;
                }
            }

            for (int i = 0; i < j; i++) {
                if ((shuntu[i] == 0) || (shuntu[i] == 6) || (shuntu[i] == 9) || (shuntu[i] == 15) || (shuntu[i] == 18) || (shuntu[i] == 24)) {

                } else {
                    tyanta = false;
                    break;
                }
            }

        } else {
            tyanta = false;
        }
        if (tyanta) {
            if (j == 0) {
                return 2;
            } else {
                return 1;
            }
        }

        return 0;
    }

    private boolean toitoi(int k) {
        if (k == 4) {
            return true;
        }
        return false;
    }

    private boolean sansyokudouzyun(int j) {

        if (j > 2) {
            int count = 0;
            for (int i = 0; i < j; i++) {
                int tmp = shuntu[i];
                count = 0;
                for (int k = 0; k < j; k++) {


                    if (shuntu[k] < 18) {
                        if (shuntu[k] - 9 == tmp) {
                            count++;
                        }
                    } else {
                        if (shuntu[k] - 18 == tmp) {
                            count++;
                        }
                    }
                }
                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean ikkituukan(int j) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        if (j > 2) {
            for (int i = 0; i < j; i++) {
                if (shuntu[i] == 0) {
                    count1 = 1;
                }
                if (shuntu[i] == 3) {
                    count2 = 1;
                }
                if (shuntu[i] == 6) {
                    count3 = 1;
                }

                if (shuntu[i] == 9) {
                    count4 = 1;
                }
                if (shuntu[i] == 12) {
                    count5 = 1;
                }
                if (shuntu[i] == 15) {
                    count6 = 1;
                }
                if (shuntu[i] == 18) {
                    count7 = 1;
                }
                if (shuntu[i] == 21) {
                    count8 = 1;
                }
                if (shuntu[i] == 24) {
                    count9 = 1;
                }
            }
            if ((count1 == 1 && count2 == 1 && count3 == 1) || (count4 == 1 && count5 == 1 && count6 == 1) || (count7 == 1 && count8 == 1 && count9 == 1)) {
                return true;
            }
        }

        return false;
    }

    private boolean sansyokudoukou(int k) {
        if (k > 2) {
            int count = 0;
            for (int i = 0; i < k; i++) {
                int tmp = ankou[i];
                count = 0;
                for (int j = 0; j < k; j++) {

                    if (ankou[j] < 9) {
                        if (ankou[j] == tmp) {
                            count++;
                        }
                    } else if (ankou[j] < 18) {
                        if (ankou[j] - 9 == tmp) {
                            count++;
                        }
                    } else {
                        if (ankou[j] - 18 == tmp) {
                            count++;
                        }
                    }
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean syousangen(int k, int a) {

        if (k > 1) {
            if (toitu[a] == 31 || toitu[a] == 32 || toitu[a] == 33) {
                int count = 0;
                for (int i = 0; i < k; i++) {
                    if (ankou[i] == 31 || ankou[i] == 32 || ankou[i] == 33) {
                        count++;
                    }
                }
                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }


    private int honitu_tinitu_ziiso() {
        int flag = 0;

        for (int i = 0; i < manzu.length; i++) {
            if (manzu[i] != 0) {
                flag = 1;
            }
        }

        for (int i = 0; i < pinzu.length; i++) {
            if (pinzu[i] != 0) {
                if (flag != 0) {
                    return 0;
                } else {
                    flag = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < souzu.length; i++) {
            if (souzu[i] != 0) {
                if (flag != 0) {
                    return 0;
                } else {
                    flag = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < zihai.length; i++) {
            if (zihai[i] != 0) {
                if (flag != 0) {
                    flag = 2;
                } else {
                    flag = 3;
                    break;
                }
            }
        }

        return flag;
    }

    private boolean daisangen(int k) {
        if (k > 2) {
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (ankou[i] == 31 || ankou[i] == 32 || ankou[i] == 33) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    private int susihou(int k, int a) {
        if (k > 2) {
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (ankou[i] == 27 || ankou[i] == 28 || ankou[i] == 29 || ankou[i] == 30) {
                    count++;
                }
            }
            if (count == 4) {
                return 1;
            } else if (count == 3) {
                if (toitu[a] == 27 || toitu[a] == 28 || toitu[a] == 29 || toitu[a] == 30) {
                    return 2;
                }
            }
        }
        return 0;
    }


    private boolean tinroto(int k, int a) {
        if (k == 4) {
            for (int i = 0; i < k; i++) {
                if (ankou[i] == 0 || ankou[i] == 8 || ankou[i] == 9 || ankou[i] == 17 || ankou[i] == 18 || ankou[i] == 26) {

                } else {
                    return false;
                }
            }
            if (toitu[a] == 0 || toitu[a] == 8 || toitu[a] == 9 || toitu[a] == 17 || toitu[a] == 18 || toitu[a] == 26) {

            } else {
                return false;
            }
        } else {
            return false;
        }


        return true;
    }

    private boolean ryuiso() {
        for (int i = 0; i < manzu.length; i++) {
            if (manzu[i] != 0) {
                return false;
            }
        }
        for (int i = 0; i < pinzu.length; i++) {
            if (pinzu[i] != 0) {
                return false;
            }
        }


        if (souzu[0] != 0 || souzu[8] != 0 || souzu[4] != 0 || souzu[6] != 0) {
            return false;
        }

        if (zihai[0] != 0 || zihai[1] != 0 || zihai[2] != 0 || zihai[3] != 0 || zihai[4] != 0 || zihai[6] != 0) {
            return false;
        }

        return true;
    }

    private boolean tyurenpoto(int agari_hai) {
        if (agari_hai < 9) {
            int manzu_tmp[] = new int[9];
            manzu_tmp = manzu.clone();
            manzu_tmp[agari_hai]--;
            for (int i = 0; i < manzu_tmp.length; i++) {
                if (i == 0 || i == 8) {
                    if (manzu_tmp[i] != 3) {
                        return false;
                    }
                } else {
                    if (manzu_tmp[i] != 1) {
                        return false;
                    }
                }
            }

        } else if (agari_hai < 18) {
            int pinzu_tmp[] = new int[9];
            pinzu_tmp = pinzu.clone();
            pinzu_tmp[agari_hai - 9]--;
            for (int i = 0; i < pinzu_tmp.length; i++) {
                if (i == 0 || i == 8) {
                    if (pinzu_tmp[i] != 3) {
                        return false;
                    }
                } else {
                    if (pinzu_tmp[i] != 1) {
                        return false;
                    }
                }
            }
        } else if (agari_hai < 27) {
            int souzu_tmp[] = new int[9];
            souzu_tmp = souzu.clone();
            souzu_tmp[agari_hai - 18]--;
            for (int i = 0; i < souzu_tmp.length; i++) {
                if (i == 0 || i == 8) {
                    if (souzu_tmp[i] != 3) {
                        return false;
                    }
                } else {
                    if (souzu_tmp[i] != 1) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public int[] kokusi_riti() {
        int hai3[] = hai2.clone();
        for (int i = 0; i < hai2.length; i++) {

            if (i == 0 || i == 8 || i == 9 || i == 17 || i == 18 || i == 26 || i == 27 || i == 28 || i == 29 || i == 30 || i == 31 || i == 32 || i == 33) {
                if (hai2[i] != 0) {
                    hai2[i]--;
                }
            }

        }

        int x[] = riti();
        if (x[0] == 0 || x[0] == 8 || x[0] == 9 || x[0] == 17 || x[0] == 18 || x[0] == 26 || x[0] == 27 || x[0] == 28 || x[0] == 29 || x[0] == 30 || x[0] == 31 || x[0] == 32 || x[0] == 33) {
            if (x[1] != 0 && x[1] != 8 && x[1] != 9 && x[1] != 17 && x[1] != 18 && x[1] != 26 && x[1] != 27 && x[1] != 28 && x[1] != 29 && x[1] != 31 && x[1] != 31 && x[1] != 32 && x[1] != 33) {
                x[0] = -1;
            }
        }

        if (x[1] == 1 || x[1] == 8 || x[1] == 9 || x[1] == 17 || x[1] == 18 || x[1] == 26 || x[1] == 27 || x[1] == 28 || x[1] == 29 || x[1] == 31 || x[1] == 31 || x[1] == 32 || x[1] == 33) {
            if (x[0] != -1) {
                if (x[0] != 0 && x[0] != 8 && x[0] != 9 && x[0] != 17 && x[0] != 18 && x[0] != 26 && x[0] != 27 && x[0] != 28 && x[0] != 29 && x[0] != 31 && x[0] != 31 && x[0] != 32 && x[0] != 33) {
                    x[1] = -1;
                }
            }
        }
        hai2 = hai3.clone();
        return x;


    }

    public int[] riti_titoitu() {
        int hai3[] = hai2.clone();

        for (int i = 0; i < hai2.length; i++) {
            if (hai2[i] >= 2) {
                hai2[i] = hai2[i] - 2;
            }
        }

        int x[] = riti();
        hai2 = hai3.clone();
        return x;
    }

    public int[] ippan_riti() {

        int toitu[] = new int[7];
        int hai3[] = hai2.clone();

        int riti_hai[] = new int[6];
        int riti_hai_index = 0;
        Arrays.fill(riti_hai, -1);

        int l = 0;
        int a = 0;
        int ankou_count = 0;
        int shuntu_count = 0;
        int kouho_count = 0;

        for (int i = 0; i < hai2.length; i++) { //対子判定
            if (hai2[i] >= 2) {
                toitu[l] = i;
                l++;
            }
        }

        int min1;
        int min2;
        while (a < l) {
///////////////////////////////////////////////////////////////////////////////////////////////////////
            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            ankou_count = ankou_count();
            shuntu_count = shuntu_count();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;

            if (min1 == 1) {
                int x[] = riti();
                boolean flag = true;
                for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < riti_hai_index; j++) {
                        if (x[i] == riti_hai[j]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        riti_hai[riti_hai_index] = x[i];
                        riti_hai_index++;
                    } else {
                        flag = true;
                    }
                }
            }

            hai2 = hai3.clone();
///////////////////////////////////////////////////////////////////////////////////////////////

            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            ankou_count = ankou_count();
            shuntu_count = shuntu_count_back();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;

            if (min1 == 1) {
                int x[] = riti();
                boolean flag = true;
                for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < riti_hai_index; j++) {
                        if (x[i] == riti_hai[j]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        riti_hai[riti_hai_index] = x[i];
                        riti_hai_index++;
                    } else {
                        flag = true;
                    }
                }
            }

            hai2 = hai3.clone();
///////////////////////////////////////////////////////////////////////////////////////////////
            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            shuntu_count = shuntu_count();
            ankou_count = ankou_count();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            min2 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;


            if (min2 == 1) {
                int x[] = riti();
                boolean flag = true;
                for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < riti_hai_index; j++) {
                        if (x[i] == riti_hai[j]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        riti_hai[riti_hai_index] = x[i];
                        riti_hai_index++;
                    } else {
                        flag = true;
                    }
                }
            }

            hai2 = hai3.clone();
/////////////////////////////////////////////////////////////////////////
            hai2[toitu[a]] = hai2[toitu[a]] - 2;
            shuntu_count = shuntu_count_back();
            ankou_count = ankou_count();
            kouho_count = kouho_count();
            if (ankou_count + shuntu_count + kouho_count > 4) {
                kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
            }
            min2 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 2;


            if (min2 == 1) {
                int x[] = riti();
                boolean flag = true;
                for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < riti_hai_index; j++) {
                        if (x[i] == riti_hai[j]) {
                            flag = false;
                        }
                    }

                    if (flag) {
                        riti_hai[riti_hai_index] = x[i];
                        riti_hai_index++;
                    } else {
                        flag = true;
                    }
                }
            }

            hai2 = hai3.clone();
/////////////////////////////////////////////////////////////////////////
            a++;
        }

        ankou_count = ankou_count();
        shuntu_count = shuntu_count();
        kouho_count = kouho_count();
        if (ankou_count + shuntu_count + kouho_count > 4) {
            kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
        }
        min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 1;

        if (min1 == 1) {
            int x[] = riti();
            boolean flag = true;
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < riti_hai_index; j++) {
                    if (x[i] == riti_hai[j]) {
                        flag = false;
                    }
                }

                if (flag) {
                    riti_hai[riti_hai_index] = x[i];
                    riti_hai_index++;
                } else {
                    flag = true;
                }
            }
        }
        hai2 = hai3.clone();
        shuntu_count = shuntu_count();
        ankou_count = ankou_count();
        kouho_count = kouho_count();
        if (ankou_count + shuntu_count + kouho_count > 4) {
            kouho_count = kouho_count - (ankou_count + shuntu_count + kouho_count - 4);
        }
        min1 = 10 - (ankou_count * 2) - (shuntu_count * 2) - kouho_count - 1;

        if (min1 == 1) {
            int x[] = riti();
            boolean flag = true;
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < riti_hai_index; j++) {
                    if (x[i] == riti_hai[j]) {
                        flag = false;
                    }
                }

                if (flag) {
                    riti_hai[riti_hai_index] = x[i];
                    riti_hai_index++;
                } else {
                    flag = true;
                }
            }
        }
        hai2 = hai3.clone();
        return riti_hai;

    }


    public int[] riti() {
        int x[] = new int[2];
        int j = 0;
        Arrays.fill(x, -1);
        for (int i = 0; i < hai2.length; i++) {
            if (hai2[i] != 0) {
                x[j] = i;
                j++;
            }
        }
        return x;
    }

    public void set_riti() {
        riti = true;
        max++;
    }

    public void setD_riti() {
        d_riti = true;
        max = max + 2;
    }

    public void setIppatu(){
        ippatu=true;
        max=max+1;
    }

    public void setTenhou(){
        tenhou=true;
    }

    public void setHaitei_tumo(){
        haitei_tumo=true;
        max=max+1;
    }

}



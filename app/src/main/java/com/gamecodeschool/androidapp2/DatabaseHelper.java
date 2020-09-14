package com.gamecodeschool.androidapp2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database = "DB_klasyEkspozycji.db";

    public DatabaseHelper(Context context) {
        super(context, Database, null, 1);
        SQLiteDatabase mdb = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS tabPNEN_206(ID TEXT, Min_klasa TEXT, Min_cement1 TEXT, Min_cement2 TEXT, Min_cement3 TEXT, Min_PL1 TEXT, Min_PL2 TEXT, Max_woda TEXT, Max_wc TEXT, Min_powietrze TEXT, Wymagania_cement TEXT, Wymagania_kruszywo TEXT, Otulenie TEXT);");

        db.execSQL("INSERT INTO tabPNEN_206 VALUES('X0', 'C12/15', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '10');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XC1', 'C20/25', '260', '230', '236', '76', '59', '169', '0,65', '-', '-', '-', '15');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XC2', 'C25/30', '280', '247', '255', '82', '64', '168', '0,6', '-', '-', '-', '25');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XC3', 'C30/37', '280', '247', '255', '82', '64', '154', '0,55', '-', '-', '-', '25');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XC4', 'C30/37', '300', '265', '273', '87', '68', '150', '0,5', '-', '-', '-', '30');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XS1', 'C30/37', '300', '265', '273', '87', '68', '150', '0,5', '-', '-', '-', '35');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XS2', 'C35/45', '320', '283', '291', '93', '73', '144', '0,45', '-', '-', '-', '40');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XS3', 'C35/45', '340', '300', '309', '99', '77', '153', '0,45', '-', '-', '-', '45');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XD1', 'C30/37', '300', '265', '273', '87', '68', '165', '0,55', '-', '-', '-', '35');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XD2', 'C30/37', '300', '265', '273', '87', '68', '165', '0,55', '-', '-', '-', '40');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XD3', 'C35/45', '320', '283', '291', '93', '73', '144', '0,45', '-', '-', '-', '45');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XF1', 'C30/37', '300', '265', '273', '87', '68', '165', '0,55', '-', '-', '7)', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XF2', 'C25/30', '300', '265', '273', '87', '68', '165', '0,55', '4', '-', '7)', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XF3', 'C30/37', '320', '283', '291', '93', '73', '160', '0,5', '4', '-', '7)', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XF4', 'C30/37', '340', '300', '309', '99', '77', '153', '0,45', '4', '-', '7)', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XA1', 'C30/37', '300', '265', '273', '87', '68', '165', '0,55', '-', '-', '-', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XA2', 'C30/37', '320', '283', '291', '93', '73', '160', '0,5', '-', '6)', '-', '11)');");
        db.execSQL("INSERT INTO tabPNEN_206 VALUES('XA3', 'C35/45', '360', '318', '327', '105', '82', '162', '0,45', '-', '6)', '-', '11)');");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tabPNEN_206");

    }
}

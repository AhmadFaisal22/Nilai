package com.example.nilai;

public class Nilai {
    public float getNA(float a, float b,float c)
    {
        return a+b+c;
    }

    public String getNH(float na)
    { String nHuruf;
        if(na>=85)
        {
            nHuruf="A";
        }
        else if(na>=80)
        {
            nHuruf="AB";
        }
        else if(na>=70)
        {
            nHuruf="B";
        }
        else if(na>=65)
        {
            nHuruf="BC";
        }
        else if(na>=60)
        {
            nHuruf="C";
        }
        else if(na>=40)
        {
            nHuruf="D";
        }
        else
        {
            nHuruf="E";
        }
        return nHuruf;
    }
    public String getPredikat(String huruf)
    { String predikat;
        if(huruf.equalsIgnoreCase("A"))
        {
            predikat="Apik";
        }
        else if(huruf.equalsIgnoreCase("AB"))
        {
            predikat="Apik Baik";
        }
        else if(huruf.equalsIgnoreCase("B"))
        {
            predikat="Baik";
        }
        else if(huruf.equalsIgnoreCase("BC"))
        {
            predikat="Cukup Baik";
        }
        else if(huruf.equalsIgnoreCase("C"))
        {
            predikat="Cukup";
        }
        else if(huruf.equalsIgnoreCase("D"))
        {
            predikat="Dableq";
        }
        else
        {
            predikat="Elek";
        }
        return predikat;
    }
}

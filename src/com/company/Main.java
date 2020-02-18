package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<String> app = new ArrayList<String>();


        for (String retval: s.split(" ")){
            app.add(retval);
        }
        Collections.sort(app);
        for (int i =0; i<app.size(); i++){
            System.out.println(app.get(i));
        }

    }
}

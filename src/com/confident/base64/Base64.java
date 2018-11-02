/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.confident.base64;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Catur Adi Nugroho
 */
public class Base64 {

    public void decode(File file, String input) {
        long time1 = System.currentTimeMillis();
        try {
            byte[] b = Base64Util.decode(input);
            writeToFile(b, "pdf.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        log("Total execution time for read and split the file: " + (time2 - time1) + " ms");
    }

    private void log(String s) {
//        Form.log(s);
    }

    public static void writeToFile(byte[] b, String fileName) {
        File f = Form.fc.getCurrentDirectory();
        fileName = f.getAbsolutePath().concat("\\").concat(fileName);
        File file = new File(fileName);
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;

        try {

            // create FileOutputStream from filename
            fos = new FileOutputStream(file);

            // create BufferedOutputStream for FileOutputStream
            bos = new BufferedOutputStream(fos);

            bos.write(b);

        } catch (Exception fnfe) {

            System.out.println("File not found" + fnfe);

        } finally {

            try {

                if (bos != null) {

                    bos.flush();

                    bos.close();

                }

            } catch (Exception e) {

                System.out.println("Error while closing streams" + e);

            }

        }
    }

}

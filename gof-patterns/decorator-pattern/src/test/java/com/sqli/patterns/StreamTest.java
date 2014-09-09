package com.sqli.patterns;

import org.junit.Test;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * Created by eric.manuguerra on 09.09.2014.
 */
public class StreamTest {

    @Test
    public void testStream() throws IOException {

        InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("texte.txt.gz");
        BufferedInputStream bis = new BufferedInputStream(inStream);
        GZIPInputStream gis = new GZIPInputStream(bis);
        byte[] buffer = new byte[1024];
        int len;
        while((len = gis.read(buffer)) != -1){
            System.out.println(new String(buffer));
        }
    }

}

package ch2.hoon.item9;

import java.io.*;

public class ResourceCollection {

    static final int BUFFER_SIZE = 100;

    static String firstLineOfFiles(String path)throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){  //try-with-resources로 자원을 회수 (자원1개)
            return br.readLine();
        }
    }

    static void copy(String src, String dst) {
        try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)){  //try-with-resources로 자원을 회수 (자원2개)
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } catch (IOException e){

        }
    }

}

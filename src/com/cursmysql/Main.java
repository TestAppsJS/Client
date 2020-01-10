package com.cursmysql;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9999);
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedReader in = new BufferedReader(new InputStreamReader (inputStream));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter (outputStream));



        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String lineA = scanner.nextLine();
        String lineB = scanner.nextLine();
        out.write(line);
        out.write("\n");
        out.write(lineA);
        out.write("\n");
        out.write(lineB);
        out.write("\n");
        out.flush();
        outputStream.close();
    }
}

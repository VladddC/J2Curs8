/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Vlad.C
 */
public class Server {
    static ServerSocket ss;
    

    public static void main(String[] args) throws IOException{
        ss = new ServerSocket(4321);
        while(true){
            new ServerThread(ss.accept()).start();
        }
    }
}

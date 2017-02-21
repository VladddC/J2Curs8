/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Vlad.C
 */
public class ServerThread extends Thread{
    private Socket socket;
    private ObjectInputStream oin;
    private ObjectOutputStream oout;
    
    public ServerThread(Socket socket) throws IOException{
        this.socket = socket;
        oout = new ObjectOutputStream(socket.getOutputStream());
        oin = new ObjectInputStream(socket.getInputStream());
    }
    
    public void run(){
        
    }
}

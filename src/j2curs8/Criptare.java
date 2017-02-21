/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2curs8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Freeware Sys
 */
public class Criptare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
            String parola = "parola";
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte [] pass = parola.getBytes();
            md.reset();
            byte [] digested = md.digest(pass);
            
            StringBuffer sb = new StringBuffer();
            for(int i =0; i< digested.length; i++){
                sb.append(Integer.toHexString(0xFF & digested[i]));
                }
            System.out.println(sb);
            
            
    }
    
}

package EncryptDecrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class des {
    
    public static Cipher ec;
    public static Cipher dc;
    public static SecretKey sk;
        
    public String encrypt(String msg)
    {
        String encmsg = " ";
        try {
            
            ec = Cipher.getInstance("DES/ECB/PKCS5Padding");
            ec.init(Cipher.ENCRYPT_MODE, sk);
            
            byte[] enc = msg.getBytes();
            byte[] ed = ec.doFinal(enc);
            encmsg = Arrays.toString(enc);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return encmsg;
    }

    public String decrypt (String msg)
    {
        String decmsg = " ";
        try {
            
            dc = Cipher.getInstance("DES/ECB/PKCS5Padding");
            dc.init(Cipher.DECRYPT_MODE, sk);
            
            byte[] dec = msg.getBytes();
            byte[] dd = dc.doFinal(dec);
            
            decmsg = Arrays.toString(dec);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return decmsg;
    }
    
    {
        try {
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            sk = kg.generateKey();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(des.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
    

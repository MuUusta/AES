package aes;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class MAIN {

    public static void main(String[] args) {
        AES AES_Algorithm = new AES();
        String Message = "TEST";
        try {
            AES.s="mabedoshi";
            SecretKey key = AES_Algorithm.keyGenerator();
            SecretKey key2 = AES_Algorithm.keyGenerator();   
            byte[] cipherText = AES_Algorithm.AES_Encryption(key, Message);
            byte[] plainTextDecomp = AES_Algorithm.AES_Decryption(key, cipherText);

            

            
            

            String KEY = new String(key.getEncoded());
            String org = new String(plainTextDecomp);
            String Cipher = new String(cipherText);


            System.out.println("[+]Message:" + Message);
            System.out.println("[+]Key:" + KEY);
            System.out.println("\n[!]AES_Encryption:" + Cipher);
            System.out.println("[!]AES_Decryption:" + org);
            
            aes2 as = new aes2();
            String tryy,tryy2;
            tryy=as.encrypt("so2ad");
            System.out.println(as.decrypt(tryy));
            

        } catch (Exception E) {
            System.out.println("[!]ERR FRM MAIN CLASS:"+E.getMessage());
        }
    }
}

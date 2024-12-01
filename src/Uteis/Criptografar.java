package Uteis;

import java.math.BigInteger;
import java.security.*;
import javax.swing.JOptionPane;

public class Criptografar {
    public static String gerarHash(String senha){
        String retorno = "";
        MessageDigest md;
        try{
            md = MessageDigest.getInstance("SHA-256");
            BigInteger hash = new BigInteger(1,md.digest(senha.getBytes()));
            retorno = hash.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Algoritmo não encontrado!");
        }
        return retorno;
    }
}

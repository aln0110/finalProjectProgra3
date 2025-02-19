package logica;

import org.apache.commons.codec.digest.DigestUtils;

public class logSeguridad {
    public static String encriptar(String passwordSinEncriptar){
        return DigestUtils.md5Hex(passwordSinEncriptar);
    }
}

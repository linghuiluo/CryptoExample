package example;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.util.*;

/**
 * This code contains a misuse example CogniCrypt_SAST of a Cipher object. 
 * CogniCrypt_SAST reports that the string argument to Cipher.getInstance("AES/ECB/PKCS5Padding") does not correspond the CrySL specification. 
 *
 */
public class ConstraintErrorExample {
	public static void main(final String...args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        final Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
        
        final HashMap<String,String> map = new HashMap<String,String>();
        map.put("first","value1");
        map.put("second","value2");
        for(String e: map.keySet())
        {
           String v= map.get(e);
           System.out.println(v);
        }

        int weather = 2;
      //passing variable to the switch
      switch (weather) 
      {
          //comparing value of variable against each case
        case 0:
          System.out.println("It is Sunny today!");
        case 1:
          System.out.println("It is Raining today!");
          break;
        case 2:
          System.out.println("It is Cloudy today!");
          break;
        //optional
        default:
          System.out.println("Invalid Input!");
    }

	}
}

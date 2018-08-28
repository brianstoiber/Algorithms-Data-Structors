package week2;

/** Class for doing encryption and decryption using the Caesar Cipher. */
public class CaesarCipher2 {

	// Building object arrays "encoder" and "decoder" with a lengh of 26 each
	protected char[] encoder = new char[26]; // Encryption array
	protected char[] decoder = new char[26]; // Decryption array

	/** Constructor that initializes the encryption and decryption arrays */
	// takes in int rotation which is currently set to 3 on line 50
	public CaesarCipher2(int rotation) {

		// creates a counter by initializing int k as 0, loops until counter reaches 25, increments k after each round
		for (int k = 0; k <= 25; k++) {

			/* 
			
			I CAN'T FIGURE OUT WHAT IS WRONG WITH THS CODE BUT FOR SOME REASON, 'Y' IS REPLACED WITH A '\' 
			
			*/
			
			
			// takes counter k, adds rotation, mods by 26, advances A the resulting array positions, casts result as a char
			encoder[k] = (char)('A' + (k + rotation % 26)); // (char)'A' + (0 + 3 % 26)
			
			// takes counter k, subtracts rotation, adds 26, mods by 26, advances A the resulting array positions, casts result as a char
			decoder[k] = (char)('A' + (k - rotation + 26) % 26); // (char'A' + (0 - 3 + 26) % 26)
		}
	}

	/** Returns String representing encrypted message. */
	public String encrypt(String message) {
		return transform(message, encoder); // use encoder array
	}

	/** Returns decrypted message given encrypted secret. */
	public String decrypt(String secret) {
		return transform(secret, decoder); // use decoder array
	}

	/** Returns transformation of original String using given code. */
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for (int k = 0; k < msg.length; k++)
			if (Character.isUpperCase(msg[k])) { // we have a letter to change
				int j = msg[k] - 'A'; // will be value from 0 to 25
				msg[k] = code[j]; // replace the character
			}
		return new String(msg);
	}

	/** Simple main method for testing the Caesar cipher */
	public static void main(String[] args) {
		CaesarCipher2 cipher = new CaesarCipher2(3);
		System.out.println("Encryption code = " + new String(cipher.encoder));
		System.out.println("Decryption code = " + new String(cipher.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer); // should be plaintext again
	}
}
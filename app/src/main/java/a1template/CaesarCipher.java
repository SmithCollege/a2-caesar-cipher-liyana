// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet = new Character[26];
    Character[] alphabet2 = new Character[26];

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher = new DynamicArray<Character>(26, alphabet2);

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    public int i;
    public int k;

    public CaesarCipher(Character[] alphabet, DynamicArray<Character> cipher, int i, int k) {
        this.alphabet = alphabet;
        this.cipher = cipher;
        this.i = i;
        this.k = k;
    }

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset){
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        alphabet[3] = 'd';
        alphabet[4] = 'e';
        alphabet[5] = 'f';
        alphabet[6] = 'g';
        alphabet[7] = 'h';
        alphabet[8] = 'i';
        alphabet[9] = 'j';
        alphabet[10] = 'k';
        alphabet[11] = 'l';
        alphabet[12] = 'm';
        alphabet[13] = 'n';
        alphabet[14] = 'o';
        alphabet[15] = 'p';
        alphabet[16] = 'q';
        alphabet[17] = 'r';
        alphabet[18] = 's';
        alphabet[19] = 't';
        alphabet[20] = 'u';
        alphabet[21] = 'v';
        alphabet[22] = 'w';
        alphabet[23] = 'x';
        alphabet[24] = 'y';
        alphabet[25] = 'z';
        for (i=0; i<26; i++) {
            cipher.set(i, alphabet[(26 - offset + i)%26]);
            System.out.println((26 + offset + i)%26);
            }
        }

    

    public int get(int i) {
        System.out.println(cipher.get(i));
        return cipher.get(i); 
        //return alphabet[i];
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (i=0; i<26; i++) {
            if (val == alphabet[i]) {
                k = i; 
            }
        }
        return k;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        char[] charArray = message.toCharArray();
        for(i=0; i< charArray.length; i++) {
           findIndex(charArray[i]);
           
        }

        return new String(); 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        return new String();
    }

    public static void main(String[] args) {
        CaesarCipher classUnderTest = new CaesarCipher(3);
        classUnderTest.get(17);
    }
    
}

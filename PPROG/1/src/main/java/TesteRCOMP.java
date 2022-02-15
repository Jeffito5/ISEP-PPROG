/**
 * @author Luís Araújo
 */
public class TesteRCOMP {
    public static void main(String[] args) throws Exception {
        //Scanner input=new Scanner(System.in);
        //System.out.println("Plese insert a byte [-128 ; 127]");
        //byte version = input.nextByte();
        //int version2 = (version & 0xFF);
        //System.out.println(version2);
        int i, aux;
        byte b;
        for (i = 0; i < 256; i++) {
            b = (byte) i; // INTEGER TO BYTE TYPE CAST
            if (b < 0)
                aux = 256 + b;
            else
                aux = b;
            System.out.println(
                    "Original INT:" + i + "   Casted to byte:" + b + "   Converted to integer from byte: " + aux);
        }
    }
}


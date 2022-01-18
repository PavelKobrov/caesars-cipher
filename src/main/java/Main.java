import caesarCode.caesarCode;
import service.DecodeService;
import service.SimpleDecodeService;

public class Main {
    public static void main(String[] args) {
        DecodeService decodeService = new SimpleDecodeService();
        for (int key = 0; key < 34; key++) {
            caesarCode csCode = new caesarCode();
            String result = decodeService.decode(csCode, key);
            System.out.println("----------------------------KEY " + key + "-------------------------");
            System.out.println(result);
        }
    }
}


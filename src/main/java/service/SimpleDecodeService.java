package service;

import caesarCode.caesarCode;

public class SimpleDecodeService implements DecodeService {

    @Override
    public int charToCode(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int code = symbol;
        if (code == 1025) {
            return 6;
        }
        if (code > 1039 && code < 1046) {
            return code - 1040;
        }
        if (code > 1045) {
            return code - 1039;
        }
        return -1;
    }

    @Override
    public char codeToChar(int code, char symbol) {
        int flag = 1040;
        if (code == -1) return symbol;
        if (Character.isLowerCase(symbol)) {
            flag = 1072;
        }


        if (code < 6) return (char) (code + flag);
        if (code == 6) return 'ё';
        return (char) (code + flag - 1);
    }

    @Override
    public int replaceCode(int code, int key) {
        if (code == -1) {
            return code;
        }
        int newCode = (code - key) % (33);
        if (newCode < 0) newCode += 33;
        return newCode;
    }

    @Override
    public String decode(caesarCode csCode, int key) {
        for (int i = 0; i < csCode.str.length(); i++) {
            char symbol = csCode.myString.charAt(i);
            int code = charToCode(symbol);
            int replaceCode = replaceCode(code, key);
            symbol = codeToChar(replaceCode, symbol);
            csCode.myString.setCharAt(i, symbol);
        }
        return csCode.myString.toString();
    }


}

package service;

import caesarCode.caesarCode;

public interface DecodeService {
    int charToCode(char symbol);

    char codeToChar(int code, char symbol);

    int replaceCode(int code, int key);

    String decode (caesarCode csCode, int key);



}

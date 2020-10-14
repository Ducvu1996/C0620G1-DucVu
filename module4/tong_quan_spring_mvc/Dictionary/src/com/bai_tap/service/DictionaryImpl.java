package com.bai_tap.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryImpl implements Dictionary {
    @Override

    public String findWord(String word) {
        String[] vietnamese= { "bạn","tôi","bạn bè","gia đình"};
        String[] english= { "you","I","friends","family"};
        for(int i= 0;i<vietnamese.length;i++){
            if(word.equals(vietnamese[i])){
                return english[i];
            }
        }

        return "Không tìm thấy";
    }
}

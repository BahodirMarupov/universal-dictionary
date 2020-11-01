package uz.magichands.universaldictionary.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.magichands.universaldictionary.payload.WordReq;

@Service
public class WordService {


    public void checkWord(WordReq wordReq) {
        RestTemplate restTemplate=new RestTemplate();
    }
}

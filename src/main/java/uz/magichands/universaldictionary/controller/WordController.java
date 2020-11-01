package uz.magichands.universaldictionary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.magichands.universaldictionary.payload.WordReq;
import uz.magichands.universaldictionary.service.WordService;

@RestController
@RequestMapping("api/words")
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping
    public ResponseEntity<?> checkWord(@RequestBody WordReq wordReq){
        wordService.checkWord(wordReq);
        return null;
    }
}

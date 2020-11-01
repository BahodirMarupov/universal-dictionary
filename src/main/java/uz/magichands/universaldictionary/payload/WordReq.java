package uz.magichands.universaldictionary.payload;

public class WordReq {
    private boolean isEnglish;
    private String word;

    public WordReq() {
    }

    public WordReq(boolean isEnglish, String word) {
        this.isEnglish = isEnglish;
        this.word = word;
    }

    public boolean isEnglish() {
        return isEnglish;
    }

    public void setEnglish(boolean english) {
        isEnglish = english;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

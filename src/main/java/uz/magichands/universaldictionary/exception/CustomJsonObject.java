package uz.magichands.universaldictionary.exception;

public class CustomJsonObject {
    private StringBuilder obj;

    public CustomJsonObject() {
        this.obj = new StringBuilder();
    }

    public void put(String key, String value) {
        if (obj.length() == 0) {
            obj.append(String.format("\"%s\":\"%s\"", key, value));
        } else {
            obj.append(String.format(",\n\"%s\":\"%s\"", key, value));
        }
    }

    @Override
    public String toString() {
        return "{" + obj + "}";
    }
}

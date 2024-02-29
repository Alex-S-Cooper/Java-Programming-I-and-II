package dictionary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }
    
     public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry: this.dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(word)) {
                    return key;
                }
            }
        } 
        return null;
    }
     
    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry: this.dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(word)) {
                    this.dictionary.remove(key);
                    return;
                }
            }
        }
        return;
    }
    
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                writer.println(key + ":" + value);
            }
            writer.close();
        } catch (Exception e ) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}

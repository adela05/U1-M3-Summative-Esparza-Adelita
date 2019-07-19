package com.company.U1M3SummativeEsparzaAdelita;

public class Word {
    private String word;
    private String definition;

    public Word(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }
    public Word(){}

    // Getter and Setter

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

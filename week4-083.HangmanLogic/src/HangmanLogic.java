public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, the number of faults increases
        // the letter is added among the already guessed letters

        if (!guessedLetters.contains(letter)){
            if(word.contains(letter)){
                guessedLetters += letter;
            } else {
                numberOfFaults++;
                guessedLetters += letter;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        String hidden = "";
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (guessedLetters.indexOf(c) != -1){ //check if char is in String, -1 if it isn't
                hidden = hidden + c;
            } else {
                hidden = hidden + "_";
            }
        }
        return hidden;
    }
}
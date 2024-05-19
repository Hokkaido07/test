public class Guess{
    private final char[] letters;

    public Guess(char[] letters) {
        this.letters = letters;
    }

    public char[] getLetters() {
        return letters;
    }

    public char getLetter(int i) {
        return letters[i];
    }

    public boolean isSixLettersLong() {
        return letters.length == 6;
    }

    public boolean isRealWord() {
        String word = new String(letters);
        FileParse fileParse = new FileParse();
        return fileParse.isWordInFile(word, "WordBank.txt");
    }

    public boolean isDuplicateWord(Guess[] previousGuesses) {
        for (Guess guess : previousGuesses) {
            if (guess.equals(this)) {
                return true;
            }
        }
        return false;
    }
}

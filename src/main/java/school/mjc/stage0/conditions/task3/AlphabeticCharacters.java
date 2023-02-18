package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String message = Character.toString(character).matches("[aeiouAEIOU]") ? "Vowel" :
                Character.toString(character).matches("[^a-zA-Z]") ? "wrong alphabet!" : "Consonant";
        System.out.println(message);

    }
}


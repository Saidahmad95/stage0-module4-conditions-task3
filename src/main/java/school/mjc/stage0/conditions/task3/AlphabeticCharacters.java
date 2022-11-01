package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((int) character >=66 && (int) character <=122){
            if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}

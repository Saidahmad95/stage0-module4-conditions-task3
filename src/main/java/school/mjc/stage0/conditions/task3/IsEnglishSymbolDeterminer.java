package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int code=symbol;
        if (code>=65 && code<=122){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}

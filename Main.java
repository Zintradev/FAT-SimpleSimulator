package ssoo;

public class Main {
    public static void main(String[] args) {
        
        FAT fat = new FAT();
        Console console = new Console(fat);

        console.chooseOption();
    }
}

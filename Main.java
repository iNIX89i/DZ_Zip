import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //3 экземпляра класса GameProgress
        GameProgress person = new GameProgress(90, 33, 8, 85.8);
        GameProgress person1 = new GameProgress(80, 72, 4, 442.9);
        GameProgress person2 = new GameProgress(60, 11, 9, 111.4);

        //метод с путём и объектом
        GameProgress.saveGame("E:/GamesJava/savegames/save.dat", person);
        GameProgress.saveGame("E:/GamesJava/savegames/save1.dat", person1);
        GameProgress.saveGame("E:/GamesJava/savegames/save2.dat", person2);

        //список файлов
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("E:/GamesJava/savegames/save.dat");
        arrayList.add("E:/GamesJava/savegames/save1.dat");
        arrayList.add("E:/GamesJava/savegames/save2.dat");

        //метод с zip и путём
        GameProgress.zipFiles("E:/GamesJava/savegames/zip.zip", arrayList);


        File saveDat = new File("E:/GamesJava/savegames/save.dat");
        File save1Dat = new File("E:/GamesJava/savegames/save1.dat");
        File save2Dat = new File("E:/GamesJava/savegames/save2.dat");

        //удаление
        if (saveDat.delete()) System.out.println("Файл \"save.dat\" удален");
        if (save1Dat.delete()) System.out.println("Файл \"save1.dat\" удален");
        if (save2Dat.delete()) System.out.println("Файл \"save2.dat\" удален");
    }
}
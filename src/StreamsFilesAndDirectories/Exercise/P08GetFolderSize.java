package StreamsFilesAndDirectories.Exercise;

import java.io.File;

public class P08GetFolderSize {
    public static void main(String[] args) {
        String folderPath = "path/to/folder";
        long folderSize = getFolderSize(new File(folderPath));
        System.out.println("Folder size: " + folderSize + " bytes");
    }

    public static long getFolderSize(File folder) {
        long size = 0;

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    size += getFolderSize(file);
                }
            }
        } else {
            size = folder.length();
        }

        return size;
    }
}

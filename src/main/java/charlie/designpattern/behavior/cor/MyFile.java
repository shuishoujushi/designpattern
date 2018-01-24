package charlie.designpattern.behavior.cor;

/**
 * Created by charlie on 24/01/2018.
 */
public class MyFile {
    private final String fileName;
    private final String fileType;
    private final String filePath;

    public MyFile(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }
}

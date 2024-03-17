import java.util.Objects;

public class Notebook {
    private int memorySize;
    private String processor;
    private int diskVolume;
    private String diskType;
    private String osName;

    public Notebook(int memorySize, String processor, int diskVolume, String diskType, String osName) {
        this.memorySize = memorySize;
        this.processor = processor;
        this.diskVolume = diskVolume;
        this.diskType = diskType;
        this.osName = osName;
    }

    
    public Notebook() {
        this.memorySize = 8;
        this.processor = "Intel";
        this.diskVolume = 500;
        this.diskType = "HDD";
        this.osName = "Windows 10";
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return memorySize == notebook.memorySize &&
                diskVolume == notebook.diskVolume &&
                processor.equals(notebook.processor) &&
                diskType.equals(notebook.diskType) &&
                osName.equals(notebook.osName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memorySize, processor, diskVolume, diskType, osName);
    }

   

    @Override
    public String toString() {
        return "Ноутбук{" +
                "память: " + memorySize +
                ", процесор: " + processor +
                ", объем диска: " + diskVolume +
                ", диск: " + diskType +
                ", ОС: " + osName +
                '}';
    }

   

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getDiskVolume() {
        return diskVolume;
    }

    public void setDiskVolume(int diskVolume) {
        this.diskVolume = diskVolume;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }
}
package FileBackupScheduler;

public class BackupTask implements Comparable<BackupTask>{
	String folderPath;
    int priority;

    BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }
}

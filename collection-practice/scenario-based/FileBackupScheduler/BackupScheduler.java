package FileBackupScheduler;
import java.util.*;

public class BackupScheduler {
	PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    void scheduleBackup(String path, int priority) throws InvalidBackupPathException {
        if (path == null || path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }
        queue.add(new BackupTask(path, priority));
        System.out.println("Backup scheduled: " + path);
    }

    void executeBackups() {
        System.out.println("\nExecuting backups:");
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up: " + task.folderPath + " | Priority: " + task.priority);
        }
    }
}

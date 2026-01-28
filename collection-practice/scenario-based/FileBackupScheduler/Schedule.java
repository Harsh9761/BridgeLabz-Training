package FileBackupScheduler;

public class Schedule {

	public static void main(String[] args) {
		BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.scheduleBackup("/documents", 2);
            scheduler.scheduleBackup("/system", 5);
            scheduler.scheduleBackup("/photos", 3);
            scheduler.scheduleBackup("", 1);
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();

	}

}


public class StringTimeComparison {

	public static void main(String[] args) {
		int executions = 1000000;

        StringBuffer stringBuffer = new StringBuffer();
        long startBuffertime = System.nanoTime();

        for (int i = 0; i < executions; i++) {
            stringBuffer.append("hello");
        }

        long endBuffertime = System.nanoTime();
        long bufferTime = endBuffertime - startBuffertime;

        StringBuilder stringBuilder = new StringBuilder();
        long startBuildertime = System.nanoTime();

        for (int i = 0; i < executions; i++) {
            stringBuilder.append("hello");
        }

        long endBuildertime = System.nanoTime();
        
        long builderTime = endBuildertime - startBuildertime;

        System.out.println("StringBuffer Time is: " + bufferTime);
        System.out.println("StringBuilder Time is: " + builderTime);

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster");
        } else {
            System.out.println("StringBuffer is faster");
        }

	}

}

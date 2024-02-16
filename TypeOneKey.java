public class TypeOneKey {
    static void oneLetter(String line) {
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            try {
                Thread.sleep(45L);    // time interval in milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}}

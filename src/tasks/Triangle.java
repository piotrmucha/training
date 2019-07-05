package tasks;

public class Triangle {
    public static void main(String[] args) {
        draw(20, 10);
    }
    public static void draw (int columns, int rows) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < columns-1; i++) {
            s.append(" ");
        }
        for (int i = 0; i < columns; i++) s.append("*");
        String result = s.toString();
        for (int i = 0; i < rows; i++) {
            if ((columns + 2*i ) > result.length() ) break;
            System.out.println(result.substring(i, columns + 2*i));
        }
    }

}

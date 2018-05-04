package problem;

import java.io.*;
import java.util.ArrayList;

public class Problem {

    public final Point[] points;
    public final int numCluster;

    public Problem(final String pointsFile, final PrintStream log) throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader(pointsFile));
        numCluster = readNumCluster(br);
        points = readPoints(pointsFile, log, br);
    }

    private int readNumCluster(BufferedReader br) throws IOException {
        return br.read();
    }

    private Point[] readPoints(final String pointsFile, final PrintStream log, BufferedReader br) throws IOException {
        final ArrayList<Point> list = new ArrayList<>();
        String line;
        String[] coord;
        while ((line = br.readLine()) != null) {
            coord = line.split("    ");
            list.add(new Point(Double.valueOf(coord[0]), Double.valueOf(coord[1])));
            for(String s: coord)
                System.out.println(s + "!!");
        }
        return (Point[]) list.toArray();
    }
}

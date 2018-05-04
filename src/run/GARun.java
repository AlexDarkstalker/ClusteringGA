package run;

import problem.Problem;

import java.io.IOException;
import java.io.PrintStream;

public class GARun {
    public static void main(String[] args) {
        try {
            Problem clusterProblem = new Problem("/home/alex/IdeaProjects/GAClustering/s1.txt", new PrintStream("log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

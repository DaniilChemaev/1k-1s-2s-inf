import java.io.*;
import java.util.LinkedList;

public class FriendGraph<T> {
    private LinkedList<Vertex<String>> vertices;

    public FriendGraph() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    "friends.txt"
                            )
                    )
            );
            try {
                String in = null;
                in = br.readLine();
                if (in.equals("# v")) {
                    while (!in.equals("# e")) {
                        in = br.readLine();
                        String[] data = in.split(" ");
                        vertices.add(
                                new Vertex<String>(
                                        Integer.parseInt(data[0]),
                                        data[1]
                                )
                        );
                        in = br.readLine();
                    }
                    while (in != null) {
                        this.addEdge(vertices, in);
                        in = br.readLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    

    private void addEdge(LinkedList<Vertex<String>> vertices, String in) {
        String[] data = in.split(" ");
        Vertex<String> v1 = getVertexByID(vertices, Integer.parseInt(data[0]));
        Vertex<String> v2 = getVertexByID(vertices, Integer.parseInt(data[1]));

        v1.getNeighbours().add(v2);
        v2.getNeighbours().add(v1);

    }

    private Vertex<String> getVertexByID(LinkedList<Vertex<String>> vertices, int parseInt) {
        for (Vertex<String> v : vertices) {
            if (v.getID() == id) {
                return v;
            }
        }
    }

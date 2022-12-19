import java.util.LinkedList;


public class Vertex<T> {
    private int id;
    private T info;
    private VertexStatus status = VertexStatus.NOT_VISITED;
    private LinkedList<Vertex<T>> neighbours;

    public Vertex(int id, T datum) {
        this.id = id;
        this.info = datum;
    }
}

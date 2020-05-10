package Chap04_Graph.Chap04_01;

import Chap04_Graph.Graph;

/**
 * @author Evan
 * @date 2020/5/10 22:01
 * 路径寻找问题 API
 */
@SuppressWarnings("WeakerAccess")
public abstract class Paths implements GraphProblem{
    private Graph graph;
    private final int source;

    // 给定图和顶点 S
    public Paths(Graph G, int s){
        this.graph = G;
        this.source = s;
    }

    public abstract boolean hasPath(int v);
    public abstract Iterable<Integer> pathTo(int v);

    public Graph G(){
        return this.graph;
    }

    public int getSource(){
        return this.source;
    }

    @Override
    public void test() {
        for(int v = 0; v < this.G().V(); v ++){
            System.out.println(this.source + " to " + v + ": ");
            if(!this.hasPath(v)){
                System.out.println("no path......");
                continue;
            }

            for(int x: this.pathTo(v))
                if(x == this.source) System.out.print(x);
                else System.out.print("-" + x);
            System.out.println();
        }
    }
}

package Chap04_Graph.Chap04_01;

import Chap04_Graph.Graph;

/**
 * @author Evan
 * @date 2020/5/10 22:03
 */
public interface GraphProblem {

    default String problemDesc(){return "empty";}
    Graph G();
    void test();
}

package br.com.jdp.design;

import org.junit.jupiter.api.Test;

class MinStackTest {

    //    ["MinStack","push","push","push","getMin","pop","getMin","pop","getMin","pop","push","push","push","getMin","pop","top","getMin","pop","getMin","pop"]
//            [[],[0],[1],[0],[],[],[],[],[],[],[-2],[-1],[-2],[],[],[],[],[],[],[]]
    @Test
    void case1() {
        MinStack obj = new MinStack();
        obj.push(0);
        obj.push(1);
        obj.push(0);
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
        obj.push(-2);
        obj.push(-1);
        obj.push(-2);
        obj.getMin();
        obj.pop();
        obj.top();
        obj.getMin();
        obj.pop();
        obj.getMin();
        obj.pop();
    }
}
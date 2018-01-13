package com.ymh;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContextTest {
    @Test
    public void ContextInterfaceTest() throws Exception{
        Strategy cA=new ConcreteStrategyA();
        Strategy cB=new ConcreteStrategyB();
        Strategy cC=new ConcreteStrategyC();
        assertEquals(240,new Context(cA).contextInterface(200),0);
        assertEquals(200,new Context(cB).contextInterface(200),0);
        assertEquals(120,new Context(cC).contextInterface(200),0);
    }
}

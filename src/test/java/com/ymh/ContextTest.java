package com.ymh;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContextTest {
    @Test
    public void ContextInterfaceTest() throws Exception{
        Book[] books=new Book[3];
        Book[] books2=new Book[3];
        books[0]=new Book("新书", 100.0);
        books[1]=new Book("常规图书", 100.0);
        books[2]=new Book("滞销图书", 100.0);

        books2[0]=new Book("新书", 200.0);
        books2[1]=new Book("常规图书", 150.0);
        books2[2]=new Book("滞销图书", 500.0);
        Context context=new Context();
        assertEquals(280.0,context.contextInterface(books),0);
        assertEquals(690.0,context.contextInterface(books2),0);
    }
}
